package com.automation.testclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.automation.webpages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoginPageTest {

    private WebDriver driver;
    private Properties prop = new Properties();

    @BeforeClass
    public void setup() throws IOException {
        // Load properties file
        FileInputStream fis = new FileInputStream("src/main/resources/config/config.properties");
        prop.load(fis);
        fis.close();
      //  ChromeDriver with certificate handling
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true); // Accept self-signed certificates
        driver = new ChromeDriver(options);
    }

    @Test
    public void testLogin() {
        driver.get(prop.getProperty("baseUrl"));

        LoginPage login = new LoginPage(driver);
        login.enterUsername(prop.getProperty("username"));
        login.enterPassword(prop.getProperty("password"));
        login.clickLogin();

        // Assertion to verify successful login
        assert driver.getCurrentUrl().contains("https://api.icedq.net/") : "Login failed or incorrect redirect URL.";
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
