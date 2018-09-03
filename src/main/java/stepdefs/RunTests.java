package stepdefs;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        strict = true,
        features = {"src/test/java/resources/feature/atm/"},
        plugin = {"json:target/cucumber-report.json", "html:target/cucumber-report"},
        glue = {"stepdefs"}
)

public class RunTests extends AbstractTestNGCucumberTests {
}
