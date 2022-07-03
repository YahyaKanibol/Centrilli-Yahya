package com.centrilli.step_definitions;

import com.centrilli.pages.LoginPage;
import com.centrilli.utilities.ConfigurationReader;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class LoginPageStepDef {

    LoginPage loginPage = new LoginPage();

    @When("User goes to application page")
    public void user_goes_to_application_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("User enters valid email {string} and valid password {string} and press enter key")
    public void user_enters_valid_email_and_valid_password_and_press_enter_key(String email, String password) {
        loginPage.emailBox.sendKeys(email);
        loginPage.passwordBox.sendKeys(password+ Keys.ENTER);
    }

    @Then("User lands on homepage as posmanager")
    public void user_lands_on_homepage_as_posmanager() {
        Assert.assertTrue(loginPage.usernameVerify.getText().toLowerCase().contains("posmanager"));
    }

    @And("User enters valid email {string} and valid password {string}")
    public void user_Enters_Valid_Email_And_Valid_Password(String email, String password) {
        loginPage.emailBox.sendKeys(email);
        loginPage.passwordBox.sendKeys(password);

    }

    @And("User click on login button")
    public void user_Click_On_Login_Button() {
        loginPage.loginButton.click();
    }

    @Then("User lands on homepage as salesmanager")
    public void user_Lands_On_Homepage_As_Salesmanager() {
        Assert.assertTrue(loginPage.usernameVerify.getText().toLowerCase().contains("salesmanager"));
    }
}
