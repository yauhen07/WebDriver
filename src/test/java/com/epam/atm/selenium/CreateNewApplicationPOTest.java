package com.epam.atm.selenium;

import businessobjects.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject.*;
import services.LoginService;
import util.DataGeneration;

public class CreateNewApplicationPOTest extends BaseTest {

    private static final String TRADE_NAME = DataGeneration.generateUniqueTradeName();
    private static final String EMAIL = TRADE_NAME + "@example.com";
    private static final String NUMBER_OF_OUTLETS = "1";
    private static final String BUSINESS_NATURE = "Computer Services";
    private static final String LAST_NAME = "yauhenlast";
    private static final String CONTACT_MOBILE_PHONE = DataGeneration.generateUniqueMobilePhone();
    private static final String BUSINESS_LINE = "Computer Maintenance, Repair, and Services. not elsewhere classified";
    private static final String MSF_VALUE = "1.49%";

    @Test(description = "Creation of new Application and check Standard MSF rate")
    public void createNewBasicApplication() {
        HomePage homePage = LoginService.loginToSF(new User());
        ApplicationsPage applicationsPage = homePage.clickApplicationsLinkInNavBar();
        NewApplicationFirstFormPage firstFormOfApplication = applicationsPage.clickCreateNewApplicationButton();
        firstFormOfApplication.inputTradeName(TRADE_NAME);
        firstFormOfApplication.inputEmail(EMAIL);
        firstFormOfApplication.inputNumberOfAddOutlets(NUMBER_OF_OUTLETS);
        firstFormOfApplication.selectBusinessNatureOption(BUSINESS_NATURE);
        NewApplicationSecondFormPage secondFormOfApplication = firstFormOfApplication.clickNextButton();
        secondFormOfApplication.inputLastName(LAST_NAME);
        secondFormOfApplication.inputContactMobilePhone(CONTACT_MOBILE_PHONE);
        secondFormOfApplication.selectBusinessLineOption(BUSINESS_LINE);
        ApplicationOverviewPage applicationOverview = secondFormOfApplication.clickSaveButton();
        Assert.assertEquals(applicationOverview.getStandardMSFRate(), MSF_VALUE, "Standard MSF rate is incorrect");
    }
}
