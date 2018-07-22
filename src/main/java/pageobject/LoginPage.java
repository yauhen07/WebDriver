package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends AbstractPage {
    private static final String URL = "https://network-international--qa.cs83.my.salesforce.com/";
    private static final By USER_NAME_FIELD_LOCATOR = By.id("username");
    private static final By PASSWORD_FIELD_LOCATOR = By.id("password");
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
        Help.clearAndInput(driver, USER_NAME_FIELD_LOCATOR, userName);
    }

    public void inputPassword(String password) {
        System.out.println("Clear and populate Password field");
        Help.clearAndInput(driver, PASSWORD_FIELD_LOCATOR, password);
    }

    public HomePage clickLoginButton() {
        System.out.println("Click Login button");
        driver.findElement(LOGIN_BUTTON_LOCATOR).click();
        return new HomePage(driver);
    }

    public boolean checkUsernameIsDisplayed() {
        System.out.println("Check Username field is displayed");
        return driver.findElement(USER_NAME_FIELD_LOCATOR).isDisplayed();
    }

    public boolean checkPasswordIsDisplayed() {
        System.out.println("Check Password field is displayed");
        return driver.findElement(PASSWORD_FIELD_LOCATOR).isDisplayed();
    }

    public boolean checkLoginButtonIsDisplayed() {
        System.out.println("Check Login button is displayed");
        return driver.findElement(LOGIN_BUTTON_LOCATOR).isDisplayed();
    }

    public HomePage inputCredAndLogin(WebDriver driver, String username, String password) {
        inputUsername(username);
        inputPassword(password);
        clickLoginButton();
        return new HomePage(driver);
    }
}
