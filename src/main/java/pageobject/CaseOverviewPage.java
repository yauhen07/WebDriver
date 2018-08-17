package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CaseOverviewPage extends AbstractPage {
    private static final By STATUS_OF_CASE_LOCATOR = By.xpath("//p[@title='Status']/../*[@class='slds-text-body--regular  slds-truncate']");

    public CaseOverviewPage(WebDriver driver) {
        super(driver);
    }

    public String getStatusOfCase() {
        System.out.println("Check Case created with Status - New");
        return driver.findElement(STATUS_OF_CASE_LOCATOR).getText();
    }
}
