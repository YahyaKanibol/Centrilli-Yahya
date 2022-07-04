package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage{
    public ContactsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (xpath = "//button[@accesskey='c']")
    public WebElement createButton;

    @FindBy(id = "o_field_input_334")
    public WebElement nameInputBox;

    @FindBy (id="o_field_input_338")
    public WebElement adressbox;

    @FindBy (xpath = "//button[@accesskey='s']")
    public WebElement saveButton;

    @FindBy(css = ".o_thread_message_content p")
    public WebElement ContactVerify;

    @FindBy(css = "ol .active")
    public WebElement contactnameVerify;
    

}
