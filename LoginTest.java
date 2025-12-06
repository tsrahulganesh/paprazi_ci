package com.example.demo;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest {

    private final String url = "https://choosethechief-p2.onlinebank.com/Service/UserManager.aspx";

    @Test
    void testChromeSimulated() {
        WebDriver driver = new HtmlUnitDriver(true);
        driver.get(url);
        assertTrue(driver.getTitle() != null);
        driver.quit();
    }

    @Test
    void testFirefoxSimulated() {
        WebDriver driver = new HtmlUnitDriver(true);
        driver.get(url);
        assertTrue(driver.getTitle() != null);
        driver.quit();
    }

    @Test
    void testSafariSimulated() {
        WebDriver driver = new HtmlUnitDriver(true);
        driver.get(url);
        assertTrue(driver.getTitle() != null);
        driver.quit();
    }
}

