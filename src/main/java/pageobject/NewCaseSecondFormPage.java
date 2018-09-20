package pageobject;

import logging.CustomLogger;
import org.openqa.selenium.By;

public class NewCaseSecondFormPage extends AbstractPage {
    private static final By SAVE_BUTTON_LOCATOR = By.xpath("//button[contains(@title,'Save')]//span[contains(@class,'label bBody')][contains(text(),'Save')]");


    public CaseOverviewPage clickSaveCaseButton() {
        CustomLogger.info("Save Case with default values");
        driver.findElement(SAVE_BUTTON_LOCATOR).click();
        return new CaseOverviewPage();
    }
}
