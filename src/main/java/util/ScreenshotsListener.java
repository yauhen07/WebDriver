package util;


import logging.CustomLogger;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import java.io.File;
import java.io.IOException;

import static core.WebDriverSingleton.getWebDriverInstance;

public class ScreenshotsListener extends TestListenerAdapter {
    private static final String SCREENSHOTS_NAME_TPL = "screenshots/scr";

    @Override
    public void onTestFailure(ITestResult result) {
        if (!result.isSuccess()) {
            File screenshot = getWebDriverInstance().getScreenshotAs(OutputType.FILE);
            try {
                String screenshotName = SCREENSHOTS_NAME_TPL + System.nanoTime();
                File copy = new File(screenshotName + ".png");
                FileUtils.copyFile(screenshot, copy);
                CustomLogger.info("Saved screenshot: " + screenshotName);
            } catch (IOException e) {
                CustomLogger.error("Ooops! Screenshoter failed");
                e.printStackTrace();
            }
        }
    }
}
