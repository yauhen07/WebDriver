package pageobject;

import logging.CustomLogger;
import org.openqa.selenium.By;

public class ApplicationsPage extends AbstractPage {
    private static final By NEW_APPLICATION_BUTTON_LOCATOR = By.xpath("//div[@title='New']");


    public NewApplicationFirstFormPage clickCreateNewApplicationButton() {
        CustomLogger.info("Click Create New Application button");
        driver.findElement(NEW_APPLICATION_BUTTON_LOCATOR).click();
        return new NewApplicationFirstFormPage();
    }
}
