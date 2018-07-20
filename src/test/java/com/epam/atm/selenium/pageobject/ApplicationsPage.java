package com.epam.atm.selenium.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ApplicationsPage extends AbstractPage {
    private static final By NEW_APPLICATION_BUTTON_LOCATOR = By.xpath("//div[@title='New']");

    public ApplicationsPage(WebDriver driver) {
        super(driver);
    }

    public NewApplicationFirstForm clickCreateNewApplicationButton() {
        driver.findElement(NEW_APPLICATION_BUTTON_LOCATOR).click();
        return new NewApplicationFirstForm(driver);
    }
}
