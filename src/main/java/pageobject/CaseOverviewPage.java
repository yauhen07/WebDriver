package pageobject;

import logging.CustomLogger;
import org.openqa.selenium.By;

public class CaseOverviewPage extends AbstractPage {
    private static final By STATUS_OF_CASE_LOCATOR = By.xpath("//p[@title='Status']/../*[@class='slds-text-body--regular  slds-truncate']");


    public String getStatusOfCase() {
        CustomLogger.info("Check Case created with Status - New");
        return driver.findElement(STATUS_OF_CASE_LOCATOR).getText();
    }
}
