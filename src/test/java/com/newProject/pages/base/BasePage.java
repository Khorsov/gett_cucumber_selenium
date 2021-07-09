package com.newProject.pages.base;

import com.newProject.LoggerRoot;
import com.newProject.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.lang.invoke.MethodHandles;
import java.util.logging.Logger;

public class BasePage extends LoggerRoot {
    protected WebDriver driver = Driver.getDriver();


    public BasePage(){
        PageFactory.initElements(driver, this);

    }
}
