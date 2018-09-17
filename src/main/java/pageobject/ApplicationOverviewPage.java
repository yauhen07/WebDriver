package pageobject;

import logging.CustomLogger;
import org.openqa.selenium.By;

public class ApplicationOverviewPage extends AbstractPage {
    private static final By STANDARD_MSF_RATE_FIELD_LOCATOR = By.xpath("//span[text()='* Standard MSF rate']/../../..//*[@data-aura-class='uiOutputPercent']");


    public String getStandardMSFRate() {
        CustomLogger.info("Check Standard MSF rate for newly created Application");
        return driver.findElement(STANDARD_MSF_RATE_FIELD_LOCATOR).getText();
    }
}
