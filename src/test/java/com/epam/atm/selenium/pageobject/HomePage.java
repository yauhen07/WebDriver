package com.epam.atm.selenium.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends AbstractPage{
    private static final By APPLICATIONS_NAVIGATION_BAR_LOCATOR = By.xpath("//span[@class='slds-truncate'][contains(text(),'Applications')]");
    private static final By CASES_NAVIGATION_BAR_LOCATOR = By.xpath("//span[@class='slds-truncate'][contains(text(),'Cases')]");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public ApplicationsPage clickApplicationsLinkInNavBar() {
        driver.findElement(APPLICATIONS_NAVIGATION_BAR_LOCATOR).click();
        return new ApplicationsPage(driver);
    }

    public CasesPage clickCasesLinkInNavBar() {
        driver.findElement(CASES_NAVIGATION_BAR_LOCATOR).click();
        return new CasesPage(driver);
    }
}
