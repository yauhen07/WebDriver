package stepdefs;

import businessobjects.User;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import pageobject.HomePage;
import pageobject.LoginPage;


public class LoginStepDefs {

    @Given("^Login page is opened and required elements displayed$")
    public void openLoginPage() {
        LoginPage loginPage = new LoginPage();
        loginPage.openURL();
        Assert.assertTrue(loginPage.checkUsernameIsDisplayed(), "Username field is not displayed");
        Assert.assertTrue(loginPage.checkPasswordIsDisplayed(), "Password field is not displayed");
        Assert.assertTrue(loginPage.checkLoginButtonIsDisplayed(), "Login button is not displayed");
    }

    @When("^Populate 'Login' ([^\"]*) and 'Password' ([^\"]*) fields and login$")
    public void populateCredentialsAndLogin(String login, String password) {
        new LoginPage().inputCredAndLogin(new User(login, password));
    }


    @Then("^Home page title is ([\\w | \\w]*)$")
    public void homePageTitleIs(String TITLE_HOME_PAGE) {
        Assert.assertEquals(new HomePage().getHomePageTitle(), TITLE_HOME_PAGE, "User is not logged in or incorrect Home page is not opened");
    }
}
