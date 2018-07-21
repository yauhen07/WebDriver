package com.epam.atm.selenium;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject.HomePage;
import pageobject.LoginPage;

public class LoginPOTest extends BaseTest {
    private static final String LOGIN = "yauhen_valodzin@epam.com.qa";
    private static final String PASSWORD = "Ceakt_1234";
    private static final String TITLE_HOME_PAGE = "Recently Viewed | Applications | Salesforce";

    @Test(description = "Check Login to SalesForce is working")
    public void loginToSF() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openURL();
        System.out.println("Check Username field is displayed");
        Assert.assertTrue(loginPage.checkUsernameIsDisplayed(), "Username field is not displayed");
        System.out.println("Check Password field is displayed");
        Assert.assertTrue(loginPage.checkPasswordIsDisplayed(), "Password field is not displayed");
        System.out.println("Check Login button is displayed");
        Assert.assertTrue(loginPage.checkLoginButtonIsDisplayed(), "Login button is not displayed");
        loginPage.inputUsername(LOGIN);
        loginPage.inputPassword(PASSWORD);
        HomePage homePage = loginPage.clickLoginButton();
        System.out.println("Check that user is successfully logged in and correct Home page is displayed");
        Assert.assertEquals(homePage.getTitleOfHomePage(), TITLE_HOME_PAGE, "User is not logged in or incorrect Home page is not opened");
    }
}
