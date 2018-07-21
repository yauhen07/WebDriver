package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NewApplicationFirstFormPage extends AbstractPage {
    private static final By TRADE_NAME_FIELD_LOCATOR = By.xpath("//input[@id='input-3']");
    private static final By EMAIL_FIELD_LOCATOR = By.cssSelector("#input-4"); //Please pay attention CSS selector is used !!!!!!!
    private static final By BUSINESS_NATURE_VALUE_LIST_LOCATOR = By.xpath("//select[@class='slds-select']/option");
    private static final By NUMBER_ADDITIONAL_OUTLETS_FIELD_LOCATOR = By.xpath("//div[@class='slds-form slds-form_compound']//input[@id='input-01']");
    private static final By NEXT_BUTTON_LOCATOR = By.xpath("//button[contains(text(),'Next')]");

    public NewApplicationFirstFormPage(WebDriver driver) {
        super(driver);
    }

    public void inputTradeName(String tradeName) {
        System.out.println("Clear and populate Trade Name field");
        driver.findElement(TRADE_NAME_FIELD_LOCATOR).clear();
        driver.findElement(TRADE_NAME_FIELD_LOCATOR).sendKeys(tradeName);
    }

    public void inputEmail(String email) {
        System.out.println("Clear and populate Email field");
        driver.findElement(EMAIL_FIELD_LOCATOR).clear();
        driver.findElement(EMAIL_FIELD_LOCATOR).sendKeys(email);
    }

    public void selectBusinessNatureOption(String businessNature) {
        System.out.println("Select value from Business Nature Option");
        List<WebElement> listOfValuesBusinessNature = driver.findElements(BUSINESS_NATURE_VALUE_LIST_LOCATOR);
        for (int i = 0; i < listOfValuesBusinessNature.size(); i++) {
            WebElement element = listOfValuesBusinessNature.get(i);
            String innerComp = element.getAttribute("value");
            if (innerComp.contentEquals(businessNature)) {
                element.click();
                break;
            }
        }
    }

    public void inputNumberOfAddOutlets(String numberOfOutlets) {
        System.out.println("Clear and populate Number Of Additional Outlets field");
        driver.findElement(NUMBER_ADDITIONAL_OUTLETS_FIELD_LOCATOR).clear();
        driver.findElement(NUMBER_ADDITIONAL_OUTLETS_FIELD_LOCATOR).sendKeys(numberOfOutlets);
    }

    public NewApplicationSecondFormPage clickNextButton() {
        System.out.println("Click Next button");
        driver.findElement(NEXT_BUTTON_LOCATOR).click();
        return new NewApplicationSecondFormPage(driver);
    }
}
