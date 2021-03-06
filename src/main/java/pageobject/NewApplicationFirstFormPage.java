package pageobject;

import logging.CustomLogger;
import org.openqa.selenium.By;
import util.Helpers;

public class NewApplicationFirstFormPage extends AbstractPage {
    private static final By TRADE_NAME_FIELD_LOCATOR = By.id("input-4");
    private static final By EMAIL_FIELD_LOCATOR = By.cssSelector("#input-5"); //Please pay attention CSS selector is used !!!!!!!
    private static final By BUSINESS_NATURE_VALUE_LIST_LOCATOR = By.xpath("//select[@class='slds-select']/option");
    private static final By NUMBER_ADDITIONAL_OUTLETS_FIELD_LOCATOR = By.xpath("//div[@class='slds-form slds-form_compound']//input[@id='input-01']");
    private static final By NEXT_BUTTON_LOCATOR = By.xpath("//button[contains(text(),'Next')]");


    public void inputTradeName(String tradeName) {
        CustomLogger.info("Clear and populate Trade Name field");
        Helpers.clearAndInput(TRADE_NAME_FIELD_LOCATOR, tradeName);
    }

    public void inputEmail(String email) {
        CustomLogger.info("Clear and populate Email field");
        Helpers.clearAndInput(EMAIL_FIELD_LOCATOR, email);
    }

    public void selectBusinessNatureOption(String businessNature) {
        CustomLogger.info("Select value from Business Nature Option");
        Helpers.selectValueFromDropdownAppForm(BUSINESS_NATURE_VALUE_LIST_LOCATOR, BUSINESS_NATURE_VALUE_LIST_LOCATOR, businessNature, "value");
    }

    public void inputNumberOfAddOutlets(String numberOfOutlets) {
        CustomLogger.info("Clear and populate Number Of Additional Outlets field");
        Helpers.clearAndInput(NUMBER_ADDITIONAL_OUTLETS_FIELD_LOCATOR, numberOfOutlets);
    }

    public NewApplicationSecondFormPage clickNextButton() {
        CustomLogger.info("Click Next button");
        driver.findElement(NEXT_BUTTON_LOCATOR).click();
        return new NewApplicationSecondFormPage();
    }
}
