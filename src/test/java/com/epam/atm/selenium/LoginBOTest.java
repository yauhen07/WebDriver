package com.epam.atm.selenium;

import businessobjects.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject.HomePage;
import services.LoginService;

public class LoginBOTest extends BaseTest {
    private static final String TITLE_HOME_PAGE = "Home | Salesforce";

    @Test(description = "Check Login to SalesForce is working")
    public void loginToSF() {
        HomePage homePage = LoginService.loginToSF(new User());
        Assert.assertEquals(homePage.getHomePageTitle(), TITLE_HOME_PAGE, "User is not logged in or incorrect Home page is not opened");
    }
}

