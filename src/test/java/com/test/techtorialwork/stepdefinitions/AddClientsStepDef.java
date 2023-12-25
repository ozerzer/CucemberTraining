package com.test.techtorialwork.stepdefinitions;

import com.test.techtorialwork.pages.ClientWorkpage;
import com.test.techtorialwork.pages.MainWorkPage;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class AddClientsStepDef {
WebDriver driver= DriverHelper.getDriver();
MainWorkPage mainWorkPage=new MainWorkPage(driver);
ClientWorkpage clientWorkpage=new ClientWorkpage(driver);





}
