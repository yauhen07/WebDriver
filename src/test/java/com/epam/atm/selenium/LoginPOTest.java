package com.epam.atm.selenium;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject.HomePage;
import pageobject.LoginPage;

public class LoginPOTest extends BaseTest {
    private static final String TITLE_HOME_PAGE = "Recently Viewed | Applications | Salesforce";

    @Test(description = "Check Login to SalesForce is working")
    public void loginToSF() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openURL();
        Assert.assertTrue(loginPage.checkUsernameIsDisplayed(), "Username field is not displayed");
        Assert.assertTrue(loginPage.checkPasswordIsDisplayed(), "Password field is not displayed");
        Assert.assertTrue(loginPage.checkLoginButtonIsDisplayed(), "Login button is not displayed");
        HomePage homePage = loginPage.inputCredAndLogin(driver, LOGIN, PASSWORD);
        Assert.assertEquals(homePage.getTitleOfHomePage(), TITLE_HOME_PAGE, "User is not logged in or incorrect Home page is not opened");
    }
}
