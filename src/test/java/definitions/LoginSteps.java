package definitions;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.assertions.PlaywrightAssertions;
import constant.BaseContext;
import io.cucumber.java8.En;
import pages.Login;
import utills.ConfigReader;

import java.io.FileNotFoundException;

public class LoginSteps implements En {

    private final ConfigReader configReader = ConfigReader.getInstance();

    public LoginSteps() throws FileNotFoundException {

        Given("User Launch URL", () -> {
            BaseContext.page.navigate(configReader.getProperty("url"));
            BaseContext.page.waitForLoadState();
        });

        And("User Logged in Swag Labs", () -> {
            Login loginPage = new Login(BaseContext.page);
            loginPage.emailID(configReader.getProperty("userEmail"));
            loginPage.password(configReader.getProperty("userPassword"));
            loginPage.clickToLogin();
        });

        Then("User Verify Page Tittle", () -> {
            PlaywrightAssertions.assertThat(BaseContext.page).hasTitle("Swag Labs");
        });


    }
}
