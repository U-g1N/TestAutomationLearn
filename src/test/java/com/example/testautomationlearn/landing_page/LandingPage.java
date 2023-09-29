package com.example.testautomationlearn.landing_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// page_url = https://github.com/
public class LandingPage {
    @FindBy(xpath = "/html/body/div[1]/div[1]/header/div/div[2]/div/div/div/a")
    public WebElement loginButton;

    public void signInButtonClick() {
        loginButton.click();
    }

    public LandingPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
