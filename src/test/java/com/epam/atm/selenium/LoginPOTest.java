package com.epam.atm.selenium;

import businessobjects.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject.HomePage;
import pageobject.LoginPage;

public class LoginPOTest extends BaseLocalTest {
    private static final String TITLE_HOME_PAGE = "Home | Salesforce";

    @Test(description = "Check Login to SalesForce is working")
    public void loginToSF() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openURL();
        Assert.assertTrue(loginPage.checkUsernameIsDisplayed(), "Username field is not displayed");
        Assert.assertTrue(loginPage.checkPasswordIsDisplayed(), "Password field is not displayed");
        Assert.assertTrue(loginPage.checkLoginButtonIsDisplayed(), "Login button is not displayed");
        HomePage homePage = loginPage.inputCredAndLogin(new User());
        Assert.assertEquals(homePage.getHomePageTitle(), TITLE_HOME_PAGE, "User is not logged in or incorrect Home page is not opened");
    }
}
