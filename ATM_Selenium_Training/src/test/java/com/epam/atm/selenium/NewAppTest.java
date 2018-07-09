package com.epam.atm.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.regex.Pattern;

public class NewAppTest extends BaseTest {

    @Test
    public void newApplication() {
        int x = (int) (Math.random() * 1000);
        driver.get("https://network-international--qa.cs83.my.salesforce.com/");
        System.out.println("Open application (url) for testing");
        Assert.assertEquals(driver.getTitle(), "Login | Salesforce", "Incorrect page (login page) is not opened");
        System.out.println("Check that correct Login page is opened");
        WebElement username = driver.findElementByXPath("//input[@class='input r4 wide mb16 mt8 username']");
        username.sendKeys("yauhen_valodzin@epam.com.qa");
        System.out.println("Find and populate Username field");
        WebElement password = driver.findElementByXPath("//input[@class='input r4 wide mb16 mt8 password']");
        password.sendKeys("Ceakt_1234");
        System.out.println("Find and populate Password field");
        WebElement button = driver.findElementByXPath("//input[@class='button r4 wide primary']");
        button.click();
        System.out.println("Find and click Login button");
        WebElement dynamicElement = (new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated((By.xpath("//span[text()='Recently Viewed']")))));
        System.out.println("Add explicit wait");
        Assert.assertEquals(driver.getTitle(), "Recently Viewed | Applications | Salesforce", "Incorrect Home page is not opened");
        System.out.println("Check that correct Home page (after login) is opened");
        WebElement appDropdown = driver.findElementByXPath("//span[text()='Applications']/../../one-app-nav-bar-item-dropdown//*[@role='button']");
        appDropdown.click();
        System.out.println("Find and click Applications dropdown");
        WebElement createNewAppButton = driver.findElementByXPath("//span[text()='New Application']");
        createNewAppButton.click();
        System.out.println("Find and click New Application option");
        WebElement formTradeName = driver.findElementById("input-3");
        formTradeName.sendKeys("yauhen0707" + x);
        System.out.println("Find and populate Trade Name field");
        WebElement formEmail = driver.findElementByName("input-12");
        formEmail.sendKeys("yauhen" + x + "@example.com");
        System.out.println("Find and populate Merchant Email field");
        WebElement formNumberOfAdditionalOutlets = driver.findElementById("input-01");
        formNumberOfAdditionalOutlets.sendKeys("1");
        System.out.println("Find and populate Number of additional outlets field");
        WebElement formBusinessNature = driver.findElementByXPath("//div/select/option[@value='Computer Services']");
        formBusinessNature.click();
        System.out.println("Find and select value from Business Nature dropdown");
        WebElement formButtonNext = driver.findElementByXPath("//button[text()='Next']");
        formButtonNext.click();
        System.out.println("Find and click Next button");
        WebElement formLastName = driver.findElementByXPath("//input[@maxlength='80' and @data-interactive-lib-uid='24']");
        formLastName.sendKeys("test");
        System.out.println("Find and populate Last Name field");
        WebElement formBusinessLine = driver.findElementByXPath("//span[text()='Business Line']/../..//a[@class='select']");
        formBusinessLine.click();
        System.out.println("Find and open Business Line drop down");
        WebElement formBusinessLineValue = driver.findElementByXPath("//a[text()='Computer Network/Information Services']");
        formBusinessLineValue.click();
        System.out.println("Find and select value from Business drop down");
        WebElement formSave = driver.findElementByXPath("//button[@class='slds-button slds-button--neutral uiButton--default uiButton--brand uiButton forceActionButton']");
        formSave.click();
        System.out.println("Find and click Save button");
        WebElement standardMSFRate = driver.findElementByXPath("//span[text()='* Standard MSF rate']/../../..//*[@data-aura-class='uiOutputPercent']");
        String valueMSF = standardMSFRate.getText();
        Assert.assertEquals(valueMSF, "1.49%", "Invalid value in field Standard MSF Rate");
        System.out.println("Final check");
    }
}
