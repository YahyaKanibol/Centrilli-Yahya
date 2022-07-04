package com.centrilli.step_definitions;

import com.centrilli.pages.DashPage;
import com.centrilli.pages.LoginPage;
import com.centrilli.utilities.ConfigurationReader;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogoutStepDef  {
    DashPage dashPage=new DashPage();
    LoginPage loginPage=new LoginPage();

    @Given("User on the homepage")
    public void user_on_the_homepage() {
        loginPage.login();
    }
    @When("User clicks on user dropdown menu")
    public void user_clicks_on_user_dropdown_menu() {
        dashPage.userDropdownButton.click();
    }
    @Then("User clicks on logout button")
    public void user_clicks_on_logout_button() {
        dashPage.logoutButton.click();
    }
    @Then("User logged out securely")
    public void user_logged_out_securely() {
        Assert.assertTrue(loginPage.loginButton.isDisplayed());
    }


}
