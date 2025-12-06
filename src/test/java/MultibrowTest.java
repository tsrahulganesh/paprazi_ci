import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

import static org.junit.jupiter.api.Assertions.*;

public class MultibrowTest {

    // ---------- Chrome Driver ----------
    private WebDriver getChromeDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        return new ChromeDriver(options);
    }

    // ---------- Firefox Driver ----------
    private WebDriver getFirefoxDriver() {
        FirefoxOptions options = new FirefoxOptions();
        return new FirefoxDriver(options);
    }

    // ---------- Safari Driver ----------
    private WebDriver getSafariDriver() {
        return new SafariDriver();
    }

    // ------------ TEST CASES ------------

    @Test
    void openGoogleOnChrome() {
        WebDriver driver = getChromeDriver();
        driver.get("https://www.google.com");
        assertTrue(driver.getTitle().toLowerCase().contains("google"));
        driver.quit();
    }

    @Test
    void openAmazonOnFirefox() {
        WebDriver driver = getFirefoxDriver();
        driver.get("https://www.amazon.in");
        assertTrue(driver.getTitle().toLowerCase().contains("amazon"));
        driver.quit();
    }

    @Test
    void openFlipkartOnSafari() {
        WebDriver driver = getSafariDriver();
        driver.get("https://www.flipkart.com");
        assertTrue(driver.getTitle().toLowerCase().contains("flipkart"));
        driver.quit();
    }
}

