package com.newProject.pages.base;

import com.newProject.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver = Driver.getDriver();

    public BasePage(){
        PageFactory.initElements(driver, this);

    }
}
