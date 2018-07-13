package com.epam.atm.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewApplicationTest extends BaseTest {

    @Test
    public void createNewApplicationWithDefaultSetup() {
        int x = (int) (Math.random() * 1000);
        driver.get("https://network-international--qa.cs83.my.salesforce.com/");
        System.out.println("Open application (url) for testing");
        System.out.println("Check that correct Login page is opened");
        Assert.assertEquals(driver.getTitle(), "Login | Salesforce", "Incorrect page (login page) is opened");
        WebElement usernameInput = driver.findElementByXPath("//input[@class='input r4 wide mb16 mt8 username']");
        usernameInput.sendKeys("yauhen_valodzin@epam.com.qa");
        System.out.println("Find and populate Username field");
        WebElement passwordInput = driver.findElementByXPath("//input[@class='input r4 wide mb16 mt8 password']");
        passwordInput.sendKeys("Ceakt_1234");
        System.out.println("Find and populate Password field");
        WebElement loginButton = driver.findElementByXPath("//input[@class='button r4 wide primary']");
        loginButton.click();
        System.out.println("Find and click Login button");
        System.out.println("Add explicit wait");
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated((By.xpath("//span[text()='Recently Viewed']"))));
        System.out.println("Check that correct Home page (after login) is opened");
        Assert.assertEquals(driver.getTitle(), "Recently Viewed | Applications | Salesforce", "Incorrect Home page is not opened");
        WebElement alicationDropdown = driver.findElementByXPath("//span[text()='Applications']/../../one-app-nav-bar-item-dropdown//*[@role='button']");
        alicationDropdown.click();
        System.out.println("Find and click Applications dropdown");
        WebElement createNewAppButton = driver.findElementByXPath("//span[text()='New Application']");
        createNewAppButton.click();
        System.out.println("Find and click New Application option");
        WebElement formTradeNameInput = driver.findElementById("input-3");
        formTradeNameInput.sendKeys("yauhen0707" + x);
        System.out.println("Find and populate Trade Name field");
        WebElement formEmailInput = driver.findElementByName("input-12");
        formEmailInput.sendKeys("yauhen" + x + "@example.com");
        System.out.println("Find and populate Merchant Email field");
        WebElement formNumberOfAdditionalOutletsInput = driver.findElementById("input-01");
        formNumberOfAdditionalOutletsInput.sendKeys("1");
        System.out.println("Find and populate Number of additional outlets field");
        WebElement formBusinessNatureDropdown = driver.findElementByXPath("//div/select/option[@value='Computer Services']");
        formBusinessNatureDropdown.click();
        System.out.println("Find and select value from Business Nature dropdown");
        WebElement formNextButton = driver.findElementByXPath("//button[text()='Next']");
        formNextButton.click();
        System.out.println("Find and click Next button");
        WebElement secontPartFormTitle = driver.findElementByXPath("//h2[@class=\"title slds-text-heading--medium\"]");
        System.out.println("Check that second part of form Create new Application is opened");
        String secontPartFormTitleValue = secontPartFormTitle.getText();
        Assert.assertEquals(secontPartFormTitleValue, "New Application: New", "Second part of Create new Application form is not opened");
        WebElement formLastNameInput = driver.findElementByXPath("//input[@maxlength='80' and @data-interactive-lib-uid='24']");
        formLastNameInput.sendKeys("test");
        System.out.println("Find and populate Last Name field");
        WebElement formBusinessLineDropdown = driver.findElementByXPath("//span[text()='Business Line']/../..//a[@class='select']");
        formBusinessLineDropdown.click();
        System.out.println("Find and open Business Line drop down");
        WebElement formBusinessLineValue = driver.findElementByXPath("//a[text()='Computer Network/Information Services']");
        formBusinessLineValue.click();
        System.out.println("Find and select value from Business drop down");
        WebElement formSaveButton = driver.findElementByXPath("//button[@class='slds-button slds-button--neutral uiButton--default uiButton--brand uiButton forceActionButton']");
        formSaveButton.click();
        System.out.println("Find and click Save button");
        WebElement standardMSFRate = driver.findElementByXPath("//span[text()='* Standard MSF rate']/../../..//*[@data-aura-class='uiOutputPercent']");
        String valueMSF = standardMSFRate.getText();
        System.out.println("Final check");
        Assert.assertEquals(valueMSF, "1.49%", "Invalid value in field Standard MSF Rate");
    }
}
