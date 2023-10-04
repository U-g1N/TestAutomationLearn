package com.example.testautomationlearn.ohrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// page_url = https://geeksforgeeks.com/
public class AuthPage {
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
    public WebElement loginField;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
    public WebElement passwordField;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    public WebElement signInButton;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/i")
    public WebElement profileButton;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")
    public WebElement logoutButton;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")
    public WebElement invalidEmailPasswordMessage;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/h5")
    public WebElement loginText;


    public void incorrectCredentials() {
        loginField.sendKeys("Test");
        passwordField.sendKeys("Test");
        signInButton.click();
    }

    public void correctCredentials() {
        loginField.sendKeys("Admin");
        passwordField.sendKeys("admin123");
        signInButton.click();
    }

    public void logout() {
        profileButton.click();
        logoutButton.click();
    }

    public AuthPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
