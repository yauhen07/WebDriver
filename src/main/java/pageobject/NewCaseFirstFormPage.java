package pageobject;

import logging.CustomLogger;
import org.openqa.selenium.By;

public class NewCaseFirstFormPage extends AbstractPage {
    private static final By NEXT_BUTTON_LOCATOR = By.xpath("//span[contains(text(),'Next')]");


    public NewCaseSecondFormPage clickNextButton() {
        CustomLogger.info("Create default type of Case");
        driver.findElement(NEXT_BUTTON_LOCATOR).click();
        return new NewCaseSecondFormPage();
    }
}
