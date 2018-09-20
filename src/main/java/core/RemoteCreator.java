package core;

import logging.CustomLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class RemoteCreator extends RunLocationCreator {
    private static final String URL_REMOTE_DRIVER = "http://127.0.0.1:4444/wd/hub";

    public RemoteCreator() {
        super();
    }

    protected WebDriver getWebDriver() {
        try {
            driver = new RemoteWebDriver(new URL(URL_REMOTE_DRIVER), DesiredCapabilities.chrome());
        } catch (MalformedURLException e) {
            CustomLogger.error(e.getMessage());
            e.printStackTrace();
        }
        return driver;
    }
}
