package pageobject;

import org.openqa.selenium.By;

public class HomePage extends AbstractPage {
    private static final By APPLICATIONS_NAVIGATION_BAR_LOCATOR = By.xpath("//span[@class='slds-truncate'][contains(text(),'Applications')]");
    private static final By CASES_NAVIGATION_BAR_LOCATOR = By.xpath("//span[contains(@class,'slds-truncate')][contains(text(),'Cases')]");
    private static final By TITLE_HOME_PAGE_LOCATOR = By.xpath("//*[text()='Home | Salesforce']");


    public ApplicationsPage clickApplicationsLinkInNavBar() {
        System.out.println("Open Applications tab");
        driver.findElement(APPLICATIONS_NAVIGATION_BAR_LOCATOR).click();
        return new ApplicationsPage();
    }

    public CasesPage clickCasesLinkInNavBar() {
        System.out.println("Open Cases tab");
        driver.findElement(CASES_NAVIGATION_BAR_LOCATOR).click();
        return new CasesPage();
    }

    public String getHomePageTitle() {
        waitForElementPresent(TITLE_HOME_PAGE_LOCATOR);
        System.out.println("Check that user is successfully logged in and correct Home page is displayed");
        return driver.getTitle();
    }
}
