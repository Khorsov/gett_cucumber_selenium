package com.newProject.pages;

import com.github.javafaker.Faker;
import com.newProject.pages.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPage extends BasePage {
    public String forgetPassword = "Forget Password";
    public String needToAccessYourAccount = "Need to access your account?";
    public String resetPassword = "Reset password";
    public String finalVerifyPart1 = "We sent an email with further instructions";



    @FindBy(xpath = "//a[@data-name='forgotPasswordLink']")
    public WebElement forgetPasswordBtn;
    @FindBy(xpath = "//input[@data-name='emailForgotPassword']")
    public WebElement resetPasswordInput;
    @FindBy(xpath = "//*[contains(text(),'Need to access your account?')]")
    public WebElement textNeedToAccessYourAccount;
    @FindBy(xpath = "//button[@data-name='forgotPasswordBtn']")
    public WebElement resetPasswordBtn;
    @FindBy(xpath = "//div[@data-name='successNotificationMessage']")
    public WebElement weSentAnEmailSuccessNotificationMessage;
}
