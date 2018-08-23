package core;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverSingleton {

    private static WebDriver instance;
    private static RunLocationCreator runLocationCreator;

    private WebDriverSingleton() {
    }

    public static void selectDriverType(RunLocationCreator locationCreator) {
        runLocationCreator = locationCreator;
    }

    public static WebDriver getWebDriverInstance() {
        if (instance != null) {
            return instance;
        }
        return instance = init();
    }



    private static WebDriver init() {
        if (null == runLocationCreator){
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
                System.out.println("Browser was closed");
                instance.quit();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Cannot kill browser");
            } finally {
                instance = null;
            }
        }
    }
}

