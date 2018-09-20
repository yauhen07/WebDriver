package com.epam.atm.selenium;

import businessobjects.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject.CaseOverviewPage;
import services.CreateCaseService;
import services.LoginService;

public class CreateNewCasePOTest extends BaseTest {
    private static final String CASE_STATUS = "New";

   // @Test(description = "Check status of new Case")
    public void creationOfNewCase() {
        LoginService.loginToSF(new User());
        CaseOverviewPage caseOverviewPage = CreateCaseService.createCase();
        Assert.assertEquals(caseOverviewPage.getStatusOfCase(), CASE_STATUS, "Incorrect status of Case");
    }
}
