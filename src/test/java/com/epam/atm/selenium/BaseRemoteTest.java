package com.epam.atm.selenium;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseRemoteTest extends BaseTest {

    protected void getWebDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\data\\tools\\chromedriver.exe");
        try {
            driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"), DesiredCapabilities.chrome());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
