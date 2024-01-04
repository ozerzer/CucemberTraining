package com.test.etsy.pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Browserutils;

public class EtsyMainPage {
    public EtsyMainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy(css = "#global-enhancements-search-query")
    WebElement searchBar;

    @FindBy(css = "#title")
    WebElement title;

    public void searchProduct(String product) {
        searchBar.sendKeys(product, Keys.ENTER);

    }
}

//    public void  getTitle(String expectedTitle){
//        Assert.assertEquals(Browserutils.getText(title),expectedTitle);
//
//    }
//}
