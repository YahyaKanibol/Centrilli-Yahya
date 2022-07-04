package com.centrilli.step_definitions;

import com.centrilli.pages.ContactsPage;
import com.centrilli.pages.DashPage;
import com.centrilli.pages.LoginPage;
import com.centrilli.utilities.ConfigurationReader;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Contact_Step_Def {
    DashPage dashPage = new DashPage();
    LoginPage loginPage = new LoginPage();
    ContactsPage contactsPage = new ContactsPage();

    @Given("User on the homepage c")
    public void user_on_the_homepage_c() {
        loginPage.login();
    }

    @When("User click on contacts button")
    public void user_click_on_contacts_button() {
        dashPage.contactsButton.click();
    }

    @When("User click on create button")
    public void user_click_on_create_button() {
        contactsPage.createButton.click();
    }

    @When("User fills the new contact form and clicks save button")
    public void user_fills_the_new_contact_form_and_clicks_save_button() {
        contactsPage.nameInputBox.sendKeys("new user");
        contactsPage.adressbox.sendKeys("somewhere in planet");
        contactsPage.saveButton.click();
    }

    @Then("Verify user has created new contact successfully")
    public void verify_user_has_created_new_contact_successfully() {
        Assert.assertTrue(contactsPage.ContactVerify.isDisplayed());


    }
}
