package steps;

import org.openqa.selenium.WebDriver;
import pageobject.LoginPage;

public class LoginSteps {
    private static final String URL = "https://network-international--qa.cs83.my.salesforce.com/";

    public static LoginPage loginSteps(WebDriver driver){
        LoginPage loginPage = new LoginPage(driver);
        return loginPage;
    }

    public static void urlsteps(WebDriver driver){
        driver.get(URL);
    }
}
