package definitions;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;
import constant.BaseContext;
import io.cucumber.java.Before;
import io.cucumber.java8.En;

public class BaseHooks implements En {

    public BaseHooks() {

        Before("@ui", 0, () -> {
            System.out.println("Browser initializing ");
            Browser browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(10));
            BaseContext.page = browser.newPage();
        });

    }
}
