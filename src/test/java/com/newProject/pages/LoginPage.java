package com.newProject.pages;

import com.github.javafaker.Faker;
import com.newProject.pages.base.BasePage;
import com.newProject.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.regex.Pattern;

public class LoginPage extends BasePage {
    public String emailUsername = ConfigurationReader.getProperty("userEmail");
    public String emailPassword = ConfigurationReader.getProperty("userPassword");
    public static boolean isValid(String email)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }

    public static String createFakeUsername(){
        Faker faker = new Faker();
        String fakeUsername = faker.name().username();
        return fakeUsername+"@gmail.com";
    }
    public void login(String emailUsername,String emailPassword){
        loginInput.sendKeys(emailUsername);
        nextBtn.click();
        loginPassword.sendKeys(emailPassword);
        signInBtn.click();
    }
    public static String createFakePassword(){
        Faker faker = new Faker();
        String fakePassword = faker.name().name();
        return fakePassword;
    }
    @FindBy(xpath = "//input[@data-name='emailLoginForm']")
    public WebElement loginInput;
    @FindBy(xpath = "//input[@data-name='passwordLoginForm']")
    public WebElement loginPassword;
    @FindBy(xpath = "//a[@data-name='forgotPasswordLink']")
    public WebElement forgetPasswordBtn;
    @FindBy(xpath = "//button[@data-name='loginNextButton']")
    public WebElement nextBtn;
    @FindBy(xpath = "//button[@data-name='loginButton']")
    public WebElement signInBtn;
    @FindBy(xpath = "//div[@data-name='errorMessage']")
    public WebElement errorMessage;
    @FindBy(xpath = "//div[@data-name='emailValidationError']")
    public WebElement emailValidationError;
    @FindBy(xpath = "//div[@data-name='loginLocalePicker']")
    public WebElement languagesDropdown;


    @FindBy(xpath = "//*[contains(text(),'English')]")
    public WebElement dropdownEnglish;
    @FindBy(xpath = "//*[contains(text(),'Russian')]")
    public WebElement dropdownRussian;
    @FindBy(xpath = "//*[contains(text(),'Hebrew')]")
    public WebElement dropdownHebrew;


}
