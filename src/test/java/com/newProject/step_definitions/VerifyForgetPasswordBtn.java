package com.newProject.step_definitions;

import com.newProject.pages.ForgotPage;
import com.newProject.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.newProject.pages.LoginPage;
import com.newProject.utilities.ConfigurationReader;
import com.newProject.utilities.Driver;

public class VerifyForgetPasswordBtn extends ForgotPage {


    ForgotPage forgotPage = new ForgotPage();

    @Given("the user on login page")
    public void the_user_on_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("user click on Forget Password button")
    public void user_click_on_button() {
        forgotPage.forgetPasswordBtn.click();

    }
    @Then("user should see message {string}")
    public void user_should_see_message(String needToAccessYourAccount) {
        forgotPage.needToAccessYourAccount.contains(needToAccessYourAccount);
    }
    @Then("user should input his email")
    public void user_should_input_his() {
        forgotPage.resetPasswordInput.sendKeys(ConfigurationReader.getProperty("userEmail"));
    }
    @Then("user should click Reset Password button")
    public void user_should_click_button() {
        forgotPage.resetPasswordBtn.click();

    }
    @Then("user should see success notification message")
    public void user_should_see_message_as() {
        forgotPage.weSentAnEmailSuccessNotificationMessage.isDisplayed();
    }
}
