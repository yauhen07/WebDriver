package services;

import org.openqa.selenium.WebDriver;
import pageobject.*;

public class CreateCaseService {
    public static CaseOverviewPage createCase(WebDriver driver) {
        HomePage homePage = new HomePage(driver);
        CasesPage casesPage = homePage.clickCasesLinkInNavBar();
        NewCaseFirstFormPage caseFirstFormPage = casesPage.clickCreateNewCaseButton();
        NewCaseSecondFormPage caseSecondFormPage = caseFirstFormPage.clickNextButton();
        return caseSecondFormPage.clickSaveCaseButton();
    }
}
