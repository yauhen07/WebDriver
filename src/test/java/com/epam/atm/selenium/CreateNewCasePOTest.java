package com.epam.atm.selenium;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject.*;

public class CreateNewCasePOTest extends BaseTest {
    private static final String LOGIN = "yauhen_valodzin@epam.com.qa";
    private static final String PASSWORD = "Ceakt_1234";
    private static final String CASE_STATUS = "New";

    @Test(description = "Check status of new Case")
    public void creationOfNewCase() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openURL();
        HomePage homePage = loginPage.inputCredAndLogin(LOGIN, PASSWORD);
        CasesPage casesPage = homePage.clickCasesLinkInNavBar();
        NewCaseFirstFormPage caseFirstFormPage = casesPage.clickCreateNewCaseButton();
        NewCaseSecondFormPage caseSecondFormPage = caseFirstFormPage.clickNextButton();
        CaseOverviewPage caseOverviewPage = caseSecondFormPage.clickSaveCaseButton();
        Assert.assertEquals(caseOverviewPage.getStatusOfCase(), CASE_STATUS, "Incorrect status of Case");
    }
}
