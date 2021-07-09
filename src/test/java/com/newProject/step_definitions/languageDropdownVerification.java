package com.newProject.step_definitions;

import com.newProject.pages.LoginPage;
import com.newProject.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class languageDropdownVerification extends LoginPage {

    LoginPage loginPage = new LoginPage();
    BrowserUtils utils = new BrowserUtils();

    @Then("English should be clickable")
    public void english_should_be_clickable() {
        utils.waitForElementClickable(dropdownEnglish);
    }
    @When("User is clicking on Russian btn")
    public void user_is_clicking_on_russian_btn() {
        languagesDropdown.click();
    }

    @Then("Russian should be clickable")
    public void russian_should_be_clickable() {
        utils.waitForElementClickable(dropdownRussian);
    }

    @When("User is clicking on Hebrew btn")
    public void user_is_clicking_on_hebrew_btn() {
        languagesDropdown.click();
    }
    @Then("Webelement Hebrew should be clickable")
    public void webelement_hebrew_should_be_clickable() {
        utils.waitForElementClickable(dropdownHebrew);
    }

}
