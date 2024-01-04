package com.test.techtorialwork.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Browserutils;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class ClientWorkpage {

    public ClientWorkpage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }


    @FindBy(xpath = "//div[@id='table-actions']//a[1]")
    WebElement addClientButton;


    @FindBy(css = "#name")
    WebElement clientName;

    @FindBy(css = "#email")
    WebElement clientEmail;

    @FindBy(xpath = "//select[@id='country']")
    WebElement country;

    @FindBy(css = "#mobile")
    WebElement clientMobile;

    @FindBy(css = "#company_name")
    WebElement companyName;

    @FindBy(css = "#website")
    WebElement companyEmail;

    @FindBy(css = "#office")
    WebElement companyPhoneNumber;

    @FindBy(css = "#address")
    WebElement companyAddress;

    @FindBy(css = "#shipping_address")
    WebElement companyShippingAddress;

    @FindBy(xpath = "//button[@id='save-client-form']")
    WebElement saveButton;

    @FindBy(xpath = "//tbody//tr[@role='row']//td")
    List<WebElement> allClientData;


    public void addClientButton() {

        addClientButton.click();
    }


    public void nameAndEmailFunctionality(String clientName, String clientEmail) {
        this.clientName.sendKeys(clientName);
        this.clientEmail.sendKeys(clientEmail);
    }


    public void countryAndMobileFunctionality(String country, String mobile) {
        Browserutils.selectBy(this.country, country, "text");
        this.clientMobile.sendKeys(mobile);
    }

    public void companyInformation(String companyName, String companyEmail, String companyPhoneNumber, String companyAddress, String companyShippingAddress) throws InterruptedException {
        this.companyName.sendKeys(companyName);
        this.companyEmail.sendKeys(companyEmail);
        this.companyPhoneNumber.sendKeys(companyPhoneNumber);
        this.companyAddress.sendKeys(companyAddress);
        this.companyShippingAddress.sendKeys(companyShippingAddress);
        saveButton.click();
        Thread.sleep(2000);

    }

//    public void clientDataValidation(String customerName, String companyName, String customerEmail, String date){
//        List<String>expectedClientData= Arrays.asList("","","",customerName,companyName,customerEmail,"",date);
//        for (int i=3;i<allClientData.size()-1;i++){
//            Assert.assertEquals(expectedClientData.get(i),Browserutils.getText(allClientData.get(i)));
//        }


    public void saveAndValidate(String expectedClientName, String expectedCompanyName,
                                String expectedEmail, String expectedStatus) throws InterruptedException {
        String currentDateGMT= LocalDateTime.now(ZoneId.of("GMT")).format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));


        Assert.assertTrue(Browserutils.getText(allClientData.get(2)).contains(expectedClientName));
        Assert.assertTrue(Browserutils.getText(allClientData.get(2)).contains(expectedCompanyName));
        Assert.assertTrue(Browserutils.getText(allClientData.get(3)).contains(expectedEmail));
        Assert.assertEquals(expectedStatus, Browserutils.getText(allClientData.get(4)));
        Assert.assertEquals(Browserutils.getText(allClientData.get(5)), currentDateGMT);
    }
}
