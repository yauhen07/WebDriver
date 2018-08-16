package services;

import businessobject.User;
import org.openqa.selenium.WebDriver;
import pageobject.HomePage;
import pageobject.LoginPage;

public class LoginService {
    private static LoginPage loginPage;

    public static HomePage loginToSF(WebDriver driver, User user) {
        loginPage = new LoginPage(driver);
        loginPage.openURL();
        return loginPage.inputCredAndLogin(user);
    }
}