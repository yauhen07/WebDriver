package com.epam.atm.selenium;

import businessobjects.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject.HomePage;
import pageobject.LoginPage;

public class LoginActionTest extends BaseRemoteTest {
    private static final String TITLE_HOME_PAGE = "Home | Salesforce";

    @Test(description = "Check Login to SalesForce is working")
    public void loginToSF() {
        LoginPage loginActionPage = new LoginPage(driver);
        loginActionPage.openURL();
        Assert.assertTrue(loginActionPage.checkUsernameIsDisplayed(), "Username field is not displayed");
        Assert.assertTrue(loginActionPage.checkPasswordIsDisplayed(), "Password field is not displayed");
        Assert.assertTrue(loginActionPage.checkLoginButtonIsDisplayed(), "Login button is not displayed");
        HomePage homePage = loginActionPage.inputCredAndLoginHighlightAndScreenshotAction(new User());
        Assert.assertEquals(homePage.getHomePageTitle(), TITLE_HOME_PAGE, "User is not logged in or incorrect Home page is not opened");
    }
}
