package stepdefs;

import core.LocalCreator;
import core.RunLocationCreator;
import core.WebDriverSingleton;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class ScenarioHooks {
    private RunLocationCreator runLocationCreator;

    @Before
    public void openBrowser() {
        runLocationCreator = new LocalCreator();
        WebDriverSingleton.selectDriverType(runLocationCreator);
    }

    @After
    public void closeBrowser() {
        WebDriverSingleton.kill();
    }
}
