package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewApplicationSecondFormPage extends AbstractPage {
    private static final By LAST_NAME_INPUT_LOCATOR = By.xpath("//input[@maxlength='80' and @data-interactive-lib-uid='24']");
    private static final By BUSINESS_LINE_DROPDOWN_LOCATOR = By.xpath("//span[text()='Business Line']/../..//a[@class='select']");
    private static final By BUSINESS_LINE_VALUE_LIST_LOCATOR = By.xpath("//ul[@class='scrollable']//li/a[@title]");
    private static final By CONTACT_MOBILE_PHONE_INPUT_LOCATOR = By.xpath("//input[@type='tel'][@aria-required='true']");
    private static final By SAVE_BUTTON_LOCATOR = By.xpath("//button[@class='slds-button slds-button--neutral uiButton--default uiButton--brand uiButton forceActionButton']");

    public NewApplicationSecondFormPage(WebDriver driver) {
        super(driver);
    }

    public void inputLastName(String lastName) {
        System.out.println("Clear and populate Last Name field");
        Helpers.clearAndInput(driver, LAST_NAME_INPUT_LOCATOR, lastName);
    }

    public void inputContactMobilePhone(String mobilePhone) {
        System.out.println("Clear and populate Mobile Phone field");
        Helpers.clearAndInput(driver, CONTACT_MOBILE_PHONE_INPUT_LOCATOR, mobilePhone);
    }

    public void selectBusinessLineOption(String businessLine) {
        System.out.println("Select value from Business Line dropdown");
        Helpers.selectValueFromDropdownAppForm(driver, BUSINESS_LINE_DROPDOWN_LOCATOR, BUSINESS_LINE_VALUE_LIST_LOCATOR, businessLine, "title");
    }

    public ApplicationOverviewPage clickSaveButton() {
        System.out.println("Save Application");
        driver.findElement(SAVE_BUTTON_LOCATOR).click();
        return new ApplicationOverviewPage(driver);
    }
}
