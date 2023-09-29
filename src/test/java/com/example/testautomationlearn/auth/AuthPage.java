package com.example.testautomationlearn.auth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// page_url = https://github.com/
public class AuthPage {
    @FindBy(xpath = "//*[@id=\"login_field\"]")
    public WebElement loginField;

    @FindBy(xpath = "//*[@id=\"password\"]")
    public WebElement passwordField;

    @FindBy(xpath = "//*[@id=\"login\"]/div[4]/form/div/input[13]")
    public WebElement signInButton;

    @FindBy(xpath = "//*[@id=\"js-flash-container\"]/div/div/div")
    public WebElement invalidEmailPasswordMessage;

    public AuthPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
