package services;

import businessobjects.User;
import pageobject.HomePage;
import pageobject.LoginPage;

public class LoginService {
    private static LoginPage loginPage;

    public static HomePage loginToSF(User user) {
        loginPage = new LoginPage();
        loginPage.openURL();
        return loginPage.inputCredAndLogin(user);
    }
}