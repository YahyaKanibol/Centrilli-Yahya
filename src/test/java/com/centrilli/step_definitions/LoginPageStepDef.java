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
    public void user_Lands_On_Homepage_As_Sales_manager() {
        Assert.assertTrue(loginPage.usernameVerify.getText().toLowerCase().contains("salesmanager"));
    }

    @Then("User lands on homepage as manufacturing user")
    public void user_Lands_On_Homepage_As_Manufacturing_User() {
        Assert.assertTrue(loginPage.usernameVerify.getText().toLowerCase().contains("manufacturinguser"));
    }

    @Then("User lands on homepage as inventory manager")
    public void user_Lands_On_Homepage_As_Inventory_Manager() {
        Assert.assertTrue(loginPage.usernameVerify.getText().toLowerCase().contains("inventorymanager"));
    }

    @Then("User lands on homepage as expense manager")
    public void user_Lands_On_Homepage_As_Expense_Manager() {
        Assert.assertTrue(loginPage.usernameVerify.getText().toLowerCase().contains("expensemanager"));
    }

    @And("User enters invalid  email {string} and valid password {string} and press enter key")
    public void user_Enters_Invalid_Email_And_Valid_Password_And_Press_Enter_Key(String email, String password) {
        loginPage.emailBox.sendKeys(email);
        loginPage.passwordBox.sendKeys(password+Keys.ENTER);
    }

    @And("User enters valid email {string} and invalid password {string}and press enter key")
    public void user_Enters_Valid_Email_And_Invalid_Password_And_Press_Enter_Key(String email, String password) {
        loginPage.emailBox.sendKeys(email);
        loginPage.passwordBox.sendKeys(password+Keys.ENTER);
    }

    @And("User enters valid password {string}")
    public void user_Enters_Valid_Password(String password) {
        loginPage.passwordBox.sendKeys(password);
        loginPage.loginButton.click();
    }

    @And("User enters valid email {string}")
    public void user_Enters_Valid_Email(String email) {
        loginPage.emailBox.sendKeys(email);
        loginPage.loginButton.click();
    }

    @Then("Verify the please fill out this field message appears\\(email missing)")
    public void verify_The_Please_Fill_Out_This_Field_Message_Appears_EmailMissing() {
        String message=loginPage.emailBox.getAttribute("validationMessage");
        Assert.assertEquals("Please fill out this field.",message);
    }

    @Then("Verify the please fill out this field message appears\\(password missing)")
    public void verify_The_Please_Fill_Out_This_Field_Message_Appears_PasswordMissing() {
        String message=loginPage.passwordBox.getAttribute("validationMessage");
        Assert.assertEquals("Please fill out this field.",message);
    }

    @Then("Verify the error message appears")
    public void verifyTheErrorMessageAppears() {
        Assert.assertTrue(loginPage.wrongAlert.isDisplayed());
    }
}