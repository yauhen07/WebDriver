package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import util.Screenshoter;

public class LoginActionsPage extends AbstractPage {
    private static final String URL = "https://network-international--qa.cs83.my.salesforce.com/";
    private static final By USER_NAME_FIELD_LOCATOR = By.id("username");
    private static final By PASSWORD_FIELD_LOCATOR = By.id("password");
    private static final By LOGIN_BUTTON_LOCATOR = By.xpath("//input[@class='button r4 wide primary']");

    public LoginActionsPage(WebDriver driver) {
        super(driver);
    }

    public void openURL() {
        System.out.println("Open SaleseForce login page");
        driver.get(URL);
    }

    public void inputUsername(String userName) {
        highlightElement(USER_NAME_FIELD_LOCATOR);
        System.out.println("Clear and populate User Name field");
        HelpersAction.clearAndInput(driver, USER_NAME_FIELD_LOCATOR, userName);
        Screenshoter.takeScreenshot(driver);
        unhighlightElement(USER_NAME_FIELD_LOCATOR);
    }

    public void inputPassword(String password) {
        highlightElement(PASSWORD_FIELD_LOCATOR);
        System.out.println("Clear and populate Password field");
        HelpersAction.clearAndInput(driver, PASSWORD_FIELD_LOCATOR, password);
        Screenshoter.takeScreenshot(driver);
        unhighlightElement(PASSWORD_FIELD_LOCATOR);
    }

    public HomeActionPage clickLoginButton() {
        WebElement loginButton = driver.findElement(LOGIN_BUTTON_LOCATOR);
        highlightElement(LOGIN_BUTTON_LOCATOR);
        Screenshoter.takeScreenshot(driver);
        unhighlightElement(LOGIN_BUTTON_LOCATOR);
        System.out.println("Click Login button");
        new Actions(driver).click(loginButton).build().perform();
        return new HomeActionPage(driver);
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

    public HomeActionPage inputCredAndLogin(String username, String password) {
        inputUsername(username);
        inputPassword(password);
        clickLoginButton();
        return new HomeActionPage(driver);
    }
}
