package com.example.testautomationlearn.auth;

import com.example.testautomationlearn.landing_page.LandingPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class AuthPageTest {
    private WebDriver driver;
    private AuthPage authPage;
    private LandingPage landingPage;

    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        // Fix the issue https://github.com/SeleniumHQ/selenium/issues/11750
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://github.com/");

        authPage = new AuthPage(driver);
        landingPage = new LandingPage(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testIncorrectCredentials() {
        landingPage.signInButtonClick();
        authPage.incorrectCredentials();
        assert (authPage.invalidEmailPasswordMessage.isDisplayed());
    }

}
