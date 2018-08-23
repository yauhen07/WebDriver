package services;

import pageobject.*;

public class CreateCaseService {
    public static CaseOverviewPage createCase() {
        HomePage homePage = new HomePage();
        CasesPage casesPage = homePage.clickCasesLinkInNavBar();
        NewCaseFirstFormPage caseFirstFormPage = casesPage.clickCreateNewCaseButton();
        NewCaseSecondFormPage caseSecondFormPage = caseFirstFormPage.clickNextButton();
        return caseSecondFormPage.clickSaveCaseButton();
    }
}
