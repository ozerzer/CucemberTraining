package com.test.techtorialwork.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import utils.Browserutils;
import utils.Configreader;
import utils.DriverHelper;

public class WorkHook {
    public WebDriver driver;
    @Before  // it comes dfrom i.o cucumber not from junit
    public void setup(){
        driver= DriverHelper.getDriver();
        driver.get(Configreader.readProperty("work_url"));


    }

    @After
    public void tearDown(Scenario scenario){
        Browserutils.getScreenShotWithCucumber(driver,scenario);

        driver.quit();
    }
}
