package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeActionPage extends AbstractPage {
    private static final By TITLE_HOME_PAGE_LOCATOR = By.xpath("//*[text()='Home | Salesforce']");

    public HomeActionPage(WebDriver driver) {
        super(driver);
    }

    public String getTitleOfHomePage() {
        waitForElementPresent(TITLE_HOME_PAGE_LOCATOR);
        System.out.println("Check that user is successfully logged in and correct Home page is displayed");
        return driver.getTitle();
    }
}
