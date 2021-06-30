package com.newProject.pages;

import com.github.javafaker.Faker;
import com.newProject.pages.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.regex.Pattern;

public class LoginPage extends BasePage {
    public String emailUsername = "hhorsovv@gmailcom";

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
}
