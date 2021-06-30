package com.newProject.step_definitions;

import com.newProject.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class emailValidationOnLoginPage extends LoginPage {

    LoginPage loginPage = new LoginPage();

    @When("user input incorrect {string}")
    public void userInputIncorrect(String arg0) {
        if(!isValid(arg0)) {
            loginInput.sendKeys(arg0+ Keys.ENTER);
        }
    }
    @Then("user should see an validation Error message")
    public void user_should_see_a_validation_error_message() {
        emailValidationError.isDisplayed();
    }

}
