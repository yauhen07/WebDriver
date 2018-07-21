package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends AbstractPage {
    private static final String URL = "https://network-international--qa.cs83.my.salesforce.com/";
    private static final By USER_NAME_FIELD_LOCATOR = By.xpath("//input[@id='username']");
    private static final By PASSWORD_FIELD_LOCATOR = By.xpath("//input[@id='password']");
    private static final By LOGIN_BUTTON_LOCATOR = By.xpath("//input[@class='button r4 wide primary']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void openURL() {
        System.out.println("Open SaleseForce login page");
        driver.get(URL);
    }

    public void inputUsername(String userName) {
        System.out.println("Clear and populate User Name field");
        driver.findElement(USER_NAME_FIELD_LOCATOR).clear();
        driver.findElement(USER_NAME_FIELD_LOCATOR).sendKeys(userName);
    }

    public void inputPassword(String password) {
        System.out.println("Clear and populate Password field");
        driver.findElement(PASSWORD_FIELD_LOCATOR).clear();
        driver.findElement(PASSWORD_FIELD_LOCATOR).sendKeys(password);
    }

    public HomePage clickLoginButton() {
        System.out.println("Click Login button");
        driver.findElement(LOGIN_BUTTON_LOCATOR).click();
        return new HomePage(driver);
    }

    public boolean checkUsernameIsDisplayed() {
        return driver.findElement(USER_NAME_FIELD_LOCATOR).isDisplayed();
    }

    public boolean checkPasswordIsDisplayed() {
        return driver.findElement(PASSWORD_FIELD_LOCATOR).isDisplayed();
    }

    public boolean checkLoginButtonIsDisplayed() {
        return driver.findElement(LOGIN_BUTTON_LOCATOR).isDisplayed();
    }
}
