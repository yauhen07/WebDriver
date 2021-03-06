package core;

import logging.CustomLogger;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverSingleton {

    private static CustomWebDriver instance;
    private static RunLocationCreator runLocationCreator;

    private WebDriverSingleton() {
    }

    public static void selectDriverType(RunLocationCreator locationCreator) {
        runLocationCreator = locationCreator;
    }

    public static CustomWebDriver getWebDriverInstance() {
        if (instance != null) {
            return instance;
        }
        return instance = init();
    }


    private static CustomWebDriver init() {
        if (null == runLocationCreator) {
            runLocationCreator = new LocalCreator();
        }
        WebDriver driver = runLocationCreator.getWebDriver();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return new CustomWebDriver(driver);
    }

    public static void kill() {
        if (instance != null) {
            try {
                instance.quit();
            } catch (Exception e) {
                CustomLogger.error(e.getMessage());
                CustomLogger.info("Cannot kill browser");
            } finally {
                instance = null;
            }
        }
    }
}

