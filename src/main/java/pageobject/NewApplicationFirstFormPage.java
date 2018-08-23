package pageobject;

import org.openqa.selenium.By;
import util.Helpers;

public class NewApplicationFirstFormPage extends AbstractPage {
    private static final By TRADE_NAME_FIELD_LOCATOR = By.id("input-3");
    private static final By EMAIL_FIELD_LOCATOR = By.cssSelector("#input-4"); //Please pay attention CSS selector is used !!!!!!!
    private static final By BUSINESS_NATURE_VALUE_LIST_LOCATOR = By.xpath("//select[@class='slds-select']/option");
    private static final By NUMBER_ADDITIONAL_OUTLETS_FIELD_LOCATOR = By.xpath("//div[@class='slds-form slds-form_compound']//input[@id='input-01']");
    private static final By NEXT_BUTTON_LOCATOR = By.xpath("//button[contains(text(),'Next')]");


    public void inputTradeName(String tradeName) {
        System.out.println("Clear and populate Trade Name field");
        Helpers.clearAndInput(driver, TRADE_NAME_FIELD_LOCATOR, tradeName);
    }

    public void inputEmail(String email) {
        System.out.println("Clear and populate Email field");
        Helpers.clearAndInput(driver, EMAIL_FIELD_LOCATOR, email);
    }

    public void selectBusinessNatureOption(String businessNature) {
        System.out.println("Select value from Business Nature Option");
        Helpers.selectValueFromDropdownAppForm(driver, BUSINESS_NATURE_VALUE_LIST_LOCATOR, BUSINESS_NATURE_VALUE_LIST_LOCATOR, businessNature, "value");
    }

    public void inputNumberOfAddOutlets(String numberOfOutlets) {
        System.out.println("Clear and populate Number Of Additional Outlets field");
        Helpers.clearAndInput(driver, NUMBER_ADDITIONAL_OUTLETS_FIELD_LOCATOR, numberOfOutlets);
    }

    public NewApplicationSecondFormPage clickNextButton() {
        System.out.println("Click Next button");
        driver.findElement(NEXT_BUTTON_LOCATOR).click();
        return new NewApplicationSecondFormPage();
    }
}
