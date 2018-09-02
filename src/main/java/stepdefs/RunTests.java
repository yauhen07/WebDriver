package stepdefs;

import core.LocalCreator;
import core.RunLocationCreator;
import core.WebDriverSingleton;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

@CucumberOptions(
        strict = true,
        features = {"src/test/java/resources/feature/atm/"},
        plugin = {"json:target/cucumber-report.json", "html:target/cucumber-report"},
        glue = {"stepdefs"}
)

public class RunTests extends AbstractTestNGCucumberTests {
    private RunLocationCreator runLocationCreator;

    @BeforeClass
    public void startBrowser() {
        runLocationCreator = new LocalCreator();
        WebDriverSingleton.selectDriverType(runLocationCreator);
    }

    @AfterClass
    public void closeBrowser() {
        WebDriverSingleton.kill();
    }
}
