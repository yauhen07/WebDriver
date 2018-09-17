package pageobject;

import logging.CustomLogger;
import org.openqa.selenium.By;

public class CasesPage extends AbstractPage {
    private static final By NEW_CASE_BUTTON_LOCATOR = By.xpath("//div[@title='New']");


    public NewCaseFirstFormPage clickCreateNewCaseButton() {
        CustomLogger.info("Click create new Case");
        driver.findElement(NEW_CASE_BUTTON_LOCATOR).click();
        return new NewCaseFirstFormPage();
    }
}
