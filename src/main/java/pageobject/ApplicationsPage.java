package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ApplicationsPage extends AbstractPage {
    private static final By NEW_APPLICATION_BUTTON_LOCATOR = By.xpath("//div[@title='New']");

    public ApplicationsPage(WebDriver driver) {
        super(driver);
    }

    public NewApplicationFirstFormPage clickCreateNewApplicationButton() {
        System.out.println("Click Create New Application button");
        driver.findElement(NEW_APPLICATION_BUTTON_LOCATOR).click();
        return new NewApplicationFirstFormPage(driver);
    }
}
