package com.newProject.step_definitions;

import com.newProject.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class languageDropdownVerification extends LoginPage {

    LoginPage loginPage = new LoginPage();

    @Then("English should be as first option")
    public void english_should_be_as_first_option() {
        Select newDropdown = new Select(languagesDropdown);
        String actDrop = newDropdown.getFirstSelectedOption().getText();
        Assert.assertTrue(actDrop.equals("English"));
    }



    @When("User is clicking on Russian btn")
    public void user_is_clicking_on_russian_btn() {
        languagesDropdown.click();
    }

    @Then("Russian should be displayed")
    public void russian_should_be_displayed() {
        dropdownRussian.isDisplayed();
    }

    @When("User is clicking on Hebrew btn")
    public void user_is_clicking_on_hebrew_btn() {
        languagesDropdown.click();
    }
    @Then("Webelement Hebrew should be displayed")
    public void webelement_hebrew_should_be_displayed() {
        dropdownHebrew.isDisplayed();
    }

}
