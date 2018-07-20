package com.epam.atm.selenium.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class NewApplicationFirstForm extends AbstractPage {
    private static final By TRADE_NAME_FIELD_LOCATOR = By.xpath("//input[@id='input-6']");
    private static final By EMAIL_FIELD_LOCATOR = By.xpath("//input[@id=\'input-9\']");
    private static final By BUSINESS_NATURE_DROPDOWN_LOCATOR = By.xpath("//span[text()='Business Nature']/../..//*[@class='slds-select']");
    private static final By COMPUTER_SERVICES_BUSINESS_NATURE_OPTION_LOCATOR = By.xpath("//option[@value='Computer Services']");
    private static final By NUMBER_ADDITIONAL_OUTLETS_FIELD_LOCATOR = By.xpath("//div[@class='slds-form slds-form_compound']//input[@id='input-01']");
    private static final By NEXT_BUTTON_LOCATOR = By.xpath("//button[contains(text(),'Next')]");


    public NewApplicationFirstForm(WebDriver driver) {
        super(driver);
    }

    public void inputTradeName(String tradeName) {
        driver.findElement(TRADE_NAME_FIELD_LOCATOR).sendKeys(tradeName);
    }

    public void inputEmail(String email){
        driver.findElement(EMAIL_FIELD_LOCATOR).sendKeys(email);
    }

    public void selectComputerServicesOptionFromBusinessNature(){
        Select businessNaureDropdown = new Select((WebElement) By.xpath(String.valueOf(BUSINESS_NATURE_DROPDOWN_LOCATOR)));
        businessNaureDropdown.selectByVisibleText("");

        driver.findElement(BUSINESS_NATURE_DROPDOWN_LOCATOR).click();


        driver.findElement(COMPUTER_SERVICES_BUSINESS_NATURE_OPTION_LOCATOR).click();
    }


}
