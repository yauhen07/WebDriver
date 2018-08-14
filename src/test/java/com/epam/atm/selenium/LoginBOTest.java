package com.epam.atm.selenium;

import businessobject.AdminUser;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject.HomePage;

import static steps.LoginSteps.loginSteps;
import static steps.LoginSteps.urlsteps;

public class LoginBOTest extends BaseLocalTest {
    private static final String TITLE_HOME_PAGE = "Home | Salesforce";

    @Test(description = "Check Login to SalesForce is working")
    public void loginToSF() {
        urlsteps(driver);
        HomePage homePage = loginSteps(driver).inputCredAndLogin(new AdminUser());
        Assert.assertEquals(homePage.getHomePageTitle(), TITLE_HOME_PAGE, "User is not logged in or incorrect Home page is not opened");
    }
}

