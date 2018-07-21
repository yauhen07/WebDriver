package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CaseOverviewPage extends AbstractPage {
    private static final By SATUS_OF_CASE_LOCATOR = By.xpath("//p[@title='Status']/../*[@class='slds-text-body--regular  slds-truncate']");

    public CaseOverviewPage(WebDriver driver) {
        super(driver);
    }

    public String getStatusOfCase() {
        String statusOfCase = driver.findElement(SATUS_OF_CASE_LOCATOR).getText();
        return statusOfCase;
    }
}
