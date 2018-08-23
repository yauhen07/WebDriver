package core;

import org.openqa.selenium.WebDriver;

public abstract class RunLocationCreator {
    protected WebDriver driver;

    protected abstract WebDriver getWebDriver();

    public RunLocationCreator() {
    }
}
