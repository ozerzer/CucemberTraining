package com.test.techtorialwork.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainWorkPage {

    public  MainWorkPage (WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[contains(text(),'Products')]")
    WebElement productButton;
    @FindBy (xpath = "//a[@title='Clients']")
    WebElement clientsButton;


    public void clickProductButton(){
        productButton.click();
    }
    public void  clickClientsButton(){
        clientsButton.click();
    }
    }