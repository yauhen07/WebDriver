package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewCaseFirstFormPage extends AbstractPage {
    private static final By NEXT_BUTTON_LOCATOR = By.xpath("//span[contains(text(),'Next')]");

    public NewCaseFirstFormPage(WebDriver driver) {
        super(driver);
    }

    public NewCaseSecondFormPage clickNextButton() {
        System.out.println("Create default type of Case");
        driver.findElement(NEXT_BUTTON_LOCATOR).click();
        return new NewCaseSecondFormPage(driver);
    }
}
