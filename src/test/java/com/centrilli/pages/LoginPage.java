package com.centrilli.pages;

import com.centrilli.utilities.ConfigurationReader;
import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }
    public void login(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));          // centrilli
        this.emailBox.sendKeys(ConfigurationReader.getProperty("email"));        //posmanager10
        this.passwordBox.sendKeys(ConfigurationReader.getProperty("password"));  //posmanager
        this.loginButton.click();
    }


    @FindBy(xpath = "//input[@id='login']")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement loginButton;

    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement usernameVerify;

    @FindBy(xpath = "//a[@class='btn btn-link pull-right']")
    public WebElement resetPasswordButton;

    @FindBy (xpath = "//p[@class='alert alert-danger']")
    public WebElement wrongAlert;

    
}

