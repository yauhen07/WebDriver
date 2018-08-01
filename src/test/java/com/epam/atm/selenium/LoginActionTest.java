package com.epam.atm.selenium;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject.HomeActionPage;
import pageobject.HomePage;
import pageobject.LoginActionsPage;
import pageobject.LoginPage;

public class LoginActionTest extends BaseActionTest {
    private static final String TITLE_HOME_PAGE = "Home | Salesforce";

    @Test(description = "Check Login to SalesForce is working")
    public void loginToSF() {
        LoginActionsPage loginActionPage = new LoginActionsPage(driver);
        loginActionPage.openURL();
        Assert.assertTrue(loginActionPage.checkUsernameIsDisplayed(), "Username field is not displayed");
        Assert.assertTrue(loginActionPage.checkPasswordIsDisplayed(), "Password field is not displayed");
        Assert.assertTrue(loginActionPage.checkLoginButtonIsDisplayed(), "Login button is not displayed");
        HomeActionPage homePage = loginActionPage.inputCredAndLogin(LOGIN, PASSWORD);
        Assert.assertEquals(homePage.getTitleOfHomePage(), TITLE_HOME_PAGE, "User is not logged in or incorrect Home page is not opened");
    }
}
