package stepdefs;

import core.WebDriverSingleton;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class ScenarioHooks {
    @Before
    public void openBrowser() {
    }

    @After
    public void closeBrowser() {
        WebDriverSingleton.getWebDriverInstance().close();
    }
}
