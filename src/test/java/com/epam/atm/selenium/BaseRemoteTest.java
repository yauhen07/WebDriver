package com.epam.atm.selenium;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseRemoteTest extends BaseTest {
    private static final String URL_REMOTE_DRIVER = "http://127.0.0.1:4444/wd/hub";

    protected void getWebDriver() {
        setWebDriverSystemProperty();
        try {
            driver = new RemoteWebDriver(new URL(URL_REMOTE_DRIVER), DesiredCapabilities.chrome());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
