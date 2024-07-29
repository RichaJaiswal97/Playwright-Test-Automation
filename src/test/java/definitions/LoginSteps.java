package definitions;

import constant.BaseContext;
import io.cucumber.java8.En;
import utills.ConfigReader;

import java.io.FileNotFoundException;

public class LoginSteps implements En {

    private final ConfigReader configReader = ConfigReader.getInstance();

    public LoginSteps() throws FileNotFoundException {

        Given("User Launch URL", () -> {
            BaseContext.page.navigate(configReader.getProperty("url"));
            BaseContext.page.waitForLoadState();
        });

        And("User Logged in Lambda Test",() ->{

        });

    }
}
