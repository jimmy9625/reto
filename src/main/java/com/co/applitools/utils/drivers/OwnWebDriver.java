package com.co.applitools.utils.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OwnWebDriver {

    private WebDriver driver;

    private OwnWebDriver() {
    }

    public static OwnWebDriver newWebDriver() {
        return new OwnWebDriver();
    }

    public WebDriver firefox(String url) {
        driver = new FirefoxDriver();
        driver.get(url);
        return driver;
    }


}
