package stepdefs;

import businessobjects.User;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import org.testng.Assert;
import pageobject.*;
import services.LoginService;
import util.DataGeneration;

import java.util.List;

public class CreateDefaultApplicationStepDefs {

    private HomePage homePage;
    private NewApplicationFirstFormPage firstFormOfApplication;
    private NewApplicationSecondFormPage secondFormOfApplication;

    @Given("^Login as Admin$")
    public void loginAsAdmin() {
        homePage = LoginService.loginToSF(new User());
    }

    @And("^Applications overview page is opened$")
    public void applicationsOverviewPageIsOpened() {
        homePage.clickApplicationsLinkInNavBar();
    }

    @When("^Populate first form with parameters:$")
    public void populateFirstFormWith(DataTable firstForm) {
        firstFormOfApplication = new ApplicationsPage().clickCreateNewApplicationButton();
        firstFormOfApplication.inputTradeName(DataGeneration.generateUniqueTradeName());
        List<String> list = firstForm.asList(String.class);
        firstFormOfApplication.inputTradeName(DataGeneration.generateUniqueTradeName());
        firstFormOfApplication.inputEmail(DataGeneration.generateUniqueTradeName() + list.get(0));
        firstFormOfApplication.inputNumberOfAddOutlets(list.get(1));
        firstFormOfApplication.selectBusinessNatureOption(list.get(2));
    }

    @And("^Populate second form with parameters:$")
    public void poulateSecondFormWith(DataTable secondForm) {
        secondFormOfApplication = firstFormOfApplication.clickNextButton();
        List<String> list = secondForm.asList(String.class);
        secondFormOfApplication.inputLastName(list.get(0));
        secondFormOfApplication.inputContactMobilePhone(DataGeneration.generateUniqueMobilePhone());
        secondFormOfApplication.selectBusinessLineOption(list.get(1));
    }

    @Then("^Check MSF rate is ([^\"]*)$")
    public void checkMSFRateIs(String rateMSF) {
        ApplicationOverviewPage applicationOverview = secondFormOfApplication.clickSaveButton();
        Assert.assertEquals(applicationOverview.getStandardMSFRate(), rateMSF, "Standard MSF rate is incorrect");
    }
}
