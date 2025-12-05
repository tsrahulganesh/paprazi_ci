package com.example.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class login {

    public static void main(String[] args) {

        String url = "https://choosethechief-p2.onlinebank.com/Service/UserManager.aspx";

        // -----------------------------
        // TestCase 1 - Chrome
        // -----------------------------
        System.out.println("Running TestCase 1 on Chrome...");
        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();
        chrome.get(url);
        System.out.println("Chrome Title: " + chrome.getTitle());
        chrome.quit();


        // -----------------------------
        // TestCase 2 - Firefox
        // -----------------------------
        System.out.println("Running TestCase 2 on Firefox...");
        WebDriverManager.firefoxdriver().setup();
        WebDriver firefox = new FirefoxDriver();
        firefox.get(url);
        System.out.println("Firefox Title: " + firefox.getTitle());
        firefox.quit();


        // -----------------------------
        // TestCase 3 - Safari
        // -----------------------------
        System.out.println("Running TestCase 3 on Safari...");
        WebDriver safari = new SafariDriver();   // no setup needed
        safari.get(url);
        System.out.println("Safari Title: " + safari.getTitle());
        safari.quit();

        System.out.println("All 3 TestCases completed successfully.");
    }
}

