package pageobject;

import businessobjects.User;
import logging.CustomLogger;
import org.openqa.selenium.By;
import util.Helpers;
import util.Screenshots;

public class LoginPage extends AbstractPage {
    private static final String URL = "https://network-international--qa.cs83.my.salesforce.com/";
    private static final By USER_NAME_FIELD_LOCATOR = By.id("username");
    private static final By PASSWORD_FIELD_LOCATOR = By.id("password");
    private static final By LOGIN_BUTTON_LOCATOR = By.xpath("//input[@class='button r4 wide primary']");


    public void openURL() {
        CustomLogger.info("Open SaleseForce login page");
        driver.get(URL);
    }

    public void inputUsername(String userName) {
        CustomLogger.info("Clear and populate User Name field");
        Helpers.clearAndInput(driver, USER_NAME_FIELD_LOCATOR, userName);
    }

    public void inputPassword(String password) {
        CustomLogger.info("Clear and populate Password field");
        Helpers.clearAndInput(driver, PASSWORD_FIELD_LOCATOR, password);
    }

    public HomePage clickLoginButton() {
        CustomLogger.info("Click Login button");
        driver.findElement(LOGIN_BUTTON_LOCATOR).click();
        return new HomePage();
    }

    public boolean checkUsernameIsDisplayed() {
        CustomLogger.info("Check Username field is displayed");
        return driver.findElement(USER_NAME_FIELD_LOCATOR).isDisplayed();
    }

    public boolean checkPasswordIsDisplayed() {
        CustomLogger.info("Check Password field is displayed");
        return driver.findElement(PASSWORD_FIELD_LOCATOR).isDisplayed();
    }

    public boolean checkLoginButtonIsDisplayed() {
        CustomLogger.info("Check Login button is displayed");
        return driver.findElement(LOGIN_BUTTON_LOCATOR).isDisplayed();
    }

    public HomePage inputCredAndLogin(String username, String password) {
        inputUsername(username);
        inputPassword(password);
        clickLoginButton();
        return new HomePage();
    }

    public HomePage inputCredAndLogin(User user) {
        inputUsername(user.getLogin());
        inputPassword(user.getPassword());
        clickLoginButton();
        return new HomePage();
    }

    public void inputUsernameHighlightAndScreenshotAction(String userName) {
        highlightElement(USER_NAME_FIELD_LOCATOR);
        CustomLogger.info("Clear and populate User Name field");
        Helpers.clearAndInputAction(driver, USER_NAME_FIELD_LOCATOR, userName);
        Screenshots.takeScreenshot(driver);
        unhighlightElement(USER_NAME_FIELD_LOCATOR);
    }

    public void inputPasswordHighlightAndScreenshotAction(String password) {
        highlightElement(PASSWORD_FIELD_LOCATOR);
        CustomLogger.info("Clear and populate Password field");
        Helpers.clearAndInputAction(driver, PASSWORD_FIELD_LOCATOR, password);
        Screenshots.takeScreenshot(driver);
        unhighlightElement(PASSWORD_FIELD_LOCATOR);
    }

    public HomePage clickLoginButtonHighlightAndScreenshotAction() {
        highlightElement(LOGIN_BUTTON_LOCATOR);
        Screenshots.takeScreenshot(driver);
        unhighlightElement(LOGIN_BUTTON_LOCATOR);
        CustomLogger.info("Click Login button");
        Helpers.clickButtonAction(driver, LOGIN_BUTTON_LOCATOR);
        return new HomePage();
    }

    public HomePage inputCredAndLoginHighlightAndScreenshotAction(User user) {
        inputUsernameHighlightAndScreenshotAction(user.getLogin());
        inputPasswordHighlightAndScreenshotAction(user.getPassword());
        clickLoginButtonHighlightAndScreenshotAction();
        return new HomePage();
    }
}
