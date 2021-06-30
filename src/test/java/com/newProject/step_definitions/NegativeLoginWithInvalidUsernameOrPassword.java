package com.newProject.step_definitions;

import com.newProject.pages.ForgotPage;
import com.newProject.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.newProject.pages.LoginPage;
import com.newProject.utilities.ConfigurationReader;
import com.newProject.utilities.Driver;
public class NegativeLoginWithInvalidUsernameOrPassword extends LoginPage{
    LoginPage loginPage = new LoginPage();

    @When("user login with invalid username")
    public void user_login_with_wrong_username() {
        loginPage.loginInput.sendKeys(createFakeUsername());
    }
    @Then("user click on button Next")
    public void user_click_on_button_next() {
       loginPage.nextBtn.click();
    }
    @Then("user login with invalid password")
    public void user_login_with_wrong_password() {
        loginPage.loginPassword.sendKeys(createFakePassword());
    }
    @Then("user click on button Sign In")
    public void user_click_on_button_sign_in() {
        loginPage.signInBtn.click();
    }
    @Then("user should see warning message on display")
    public void user_should_see_warning_message_on_display_as() {
        loginPage.errorMessage.isDisplayed();
    }

}
