package stepdefs;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        strict = true,
        features = {"C:\\data\\projects\\Selenium\\WebDriver\\src\\test\\java\\resources\\feature\\atm"},
        plugin = {"json:target/cucumber-report.json", "html:target/cucumber-report"}
)

public class RunTests extends AbstractTestNGCucumberTests {
}
