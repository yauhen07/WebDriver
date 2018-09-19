package util;


import core.CustomWebDriver;
import core.WebDriverSingleton;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import java.io.File;
import java.io.IOException;

public class ScreenshotsListener extends TestListenerAdapter {
    private static final String SCREENSHOTS_NAME_TPL = "screenshots/scr";
    private WebDriver driver = WebDriverSingleton.getWebDriverInstance();

    @Override
    public void onTestFailure(ITestResult result) {
        if (!result.isSuccess()) {
            File screenshot = ((TakesScreenshot) ((CustomWebDriver) driver).driver).getScreenshotAs(OutputType.FILE);
            try {
                String screenshotName = SCREENSHOTS_NAME_TPL + System.nanoTime();
                File copy = new File(screenshotName + ".png");
                FileUtils.copyFile(screenshot, copy);
                System.out.println("Saved screenshot: " + screenshotName);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
