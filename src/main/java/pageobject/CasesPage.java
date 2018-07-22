package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CasesPage extends AbstractPage {
    private static final By NEW_CASE_BUTTON_LOCATOR = By.xpath("//div[@title='New']");

    public CasesPage(WebDriver driver) {
        super(driver);
    }

    public NewCaseFirstFormPage clickCreateNewCaseButton() {
        System.out.println("Click create new Case");
        driver.findElement(NEW_CASE_BUTTON_LOCATOR).click();
        return new NewCaseFirstFormPage(driver);
    }
}
