package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ApplicationOverviewPage extends AbstractPage {
    private static final By STANDARD_MSF_RATE_FIELD_LOCATOR = By.xpath("//span[text()='* Standard MSF rate']/../../..//*[@data-aura-class='uiOutputPercent']");

    public ApplicationOverviewPage(WebDriver driver) {
        super(driver);
    }

    public String getStandartMSFRate() {
        String valueMSFRate = driver.findElement(STANDARD_MSF_RATE_FIELD_LOCATOR).getText();
        return valueMSFRate;
    }
}
