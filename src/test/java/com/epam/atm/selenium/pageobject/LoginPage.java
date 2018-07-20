package com.epam.atm.selenium.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends AbstractPage{
    private static final String URL = "https://network-international--qa.cs83.my.salesforce.com/";
    private static final By USER_NAME_FIELD_LOCATOR = By.xpath("//input[@id='username']");
    private static final By PASSWORD_FIELD_LOCATOR = By.xpath("//input[@id='password']");
    private static final By LOGIN_BUTTON_LOCATOR = By.xpath("//input[@class='button r4 wide primary']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void inputUsername(String userName){
        driver.findElement(USER_NAME_FIELD_LOCATOR).sendKeys(userName);
    }

    public void inputPassword(String password){
        driver.findElement(PASSWORD_FIELD_LOCATOR).sendKeys(password);
    }

    public HomePage clickLoginButton(){
        driver.findElement(LOGIN_BUTTON_LOCATOR).click();
        return new HomePage(driver);
    }

}
