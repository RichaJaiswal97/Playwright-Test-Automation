package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import constant.BaseContext;

public class Login {
    private Page page;

    public Login(Page page) {
        this.page = page;
    }


    public void emailID(String email) {
        page.getByPlaceholder("Username").fill(email);

    }

    public void password(String pass) {
        page.locator("id=password").fill(pass);
    }

    public void clickToLogin() {
        page.locator("//*[@type ='submit']").click();
    }

    public Locator errorMessage() {
        return page.getByTestId("errors-password");

    }

}
