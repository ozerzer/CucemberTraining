package com.test.techtorialwork.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ClientWorkpage {

    public ClientWorkpage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }



}
