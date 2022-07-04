package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashPage {
    public DashPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (xpath = "//span[@class='oe_topbar_name']")
    public WebElement userDropdownButton;

    @FindBy(xpath = "//a[@data-menu='logout']")
    public WebElement logoutButton;


    @FindBy(css = "a[data-menu='68'] span")
    public WebElement contactsButton;
}
