package com.newProject.utilities;

import com.newProject.pages.base.BasePage;
import com.newProject.pages.helper.TimeHelper;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;
import java.util.Timer;

public class BrowserUtils extends BasePage {

    private final static int TIMEOUT_WAIT_ELEMENT = 5;


    public static void sleep(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            System.out.println("something happened in sleep method");

        }
    }
    public void waitForElementClickable(WebElement webElement){
        WebDriverWait wait = new WebDriverWait(driver, TIMEOUT_WAIT_ELEMENT);
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }
    public void waitForElementVisible(WebElement webElement){
        WebDriverWait wait = new WebDriverWait(driver, TIMEOUT_WAIT_ELEMENT);
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }
    public void waitForURL(String urlPart){
        WebDriverWait wait = new WebDriverWait(driver, TIMEOUT_WAIT_ELEMENT);
        wait.until(ExpectedConditions.urlContains(urlPart));
    }
    public boolean isElementDisplayed(WebElement element){
        try {
            return element.isDisplayed();
        }catch (NoSuchElementException e){
            return false;
        }
    }
    public void clickOnElementUsingJavaScript(WebElement element){
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("argument[0].click",element);
    }
    public void goBack(){
        driver.navigate().back();
    }
    public static void sendKeysWithDelay(String value, WebElement element){
        for(char letter : value.toCharArray()){
            element.sendKeys(""+letter);
            TimeHelper.waitABit(25);
        }
    }





}
