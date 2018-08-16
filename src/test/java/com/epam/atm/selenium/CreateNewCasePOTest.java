package com.epam.atm.selenium;

import businessobject.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject.*;
import services.CreateCaseService;
import services.LoginService;

public class CreateNewCasePOTest extends BaseLocalTest {
    private static final String CASE_STATUS = "New";

    @Test(description = "Check status of new Case")
    public void creationOfNewCase() {
        LoginService.loginToSF(driver, new User());
        CaseOverviewPage caseOverviewPage = CreateCaseService.createCase(driver);
        Assert.assertEquals(caseOverviewPage.getStatusOfCase(), CASE_STATUS, "Incorrect status of Case");
    }
}
