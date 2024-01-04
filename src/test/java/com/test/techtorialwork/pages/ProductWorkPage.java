package com.test.techtorialwork.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.Browserutils;

import java.util.Arrays;
import java.util.List;

public class ProductWorkPage {
    public ProductWorkPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//div[@id='table-actions']//a")
    WebElement addProduct;

    @FindBy(xpath = "//input[@id='name']")
    WebElement productName;


    @FindBy(xpath = "//input[@id='price']")
    WebElement productPrice;

    @FindBy(xpath = "//select[@id='product_category_id']")
    WebElement productCategory;

    @FindBy(xpath = "//select[@id='sub_category_id']")
    WebElement productSubCategory;

    @FindBy(xpath = "//select[@id='tax_id']")
    WebElement taxOfProduct;

    @FindBy(xpath = "//input[@id='purchase_allow']")
    WebElement purchaseBox;

    @FindBy(xpath = "//textarea[@id='description-text']")
    WebElement description;

    @FindBy (xpath = "//button[.='Choose a file']")
    WebElement chooseFile;

    @FindBy(xpath = "//button[@id='save-product']")
    WebElement saveButton;

    @FindBy(xpath = "//tr[1]//td")
    List<WebElement> alLData;
    @FindBy(xpath = "//select[@id='category_id']")
    WebElement category;
    @FindBy(xpath = "//select[@id='sub_category']")
    WebElement sub_category;
    @FindBy(xpath = "//a[contains(@id,'dropdownMenuLink')]")
    List<WebElement> actionButtons;
    @FindBy(xpath = "//a[.='View']")
    List<WebElement> viewButtons;
    @FindBy(xpath = "//p[contains(text(),'Lifting')]")
    WebElement productName2;
    @FindBy(xpath = "//p[contains(text(),'Mobile')]")
    WebElement subCategory;


    public void addProductButton() throws InterruptedException {
        addProduct.click();
        Thread.sleep(2000);
    }

    public void provideProductInformation(String productName, String price){
        this.productName.sendKeys(productName);
        this.productPrice.clear();
        this.productPrice.sendKeys(price);
    }


    public void provideDropDownInformation(String category, String subCategory,String tax){
        Browserutils.selectBy(this.productCategory,category,"text");
        Browserutils.selectBy(this.productSubCategory,subCategory,"text");
        Browserutils.selectBy(this.taxOfProduct,tax,"value");



    }

    public void checkBoxAndDescription(String description){
        Assert.assertFalse(purchaseBox.isSelected());
        purchaseBox.click();
        Assert.assertTrue(purchaseBox.isSelected());
        this.description.sendKeys(description);

    }

        public void pictureAndSaveBUtton(String location) throws InterruptedException {

        chooseFile.sendKeys(location);
        saveButton.click();
        }

    public void allInformation(String productName2,String price,String canPurchase) throws InterruptedException {
        Thread.sleep(2000);
        List<String> expectedInformation= Arrays.asList("","","",productName2,price,canPurchase,"");
        for(int i=3;i<alLData.size()-1;i++){
            Assert.assertEquals(expectedInformation.get(i),Browserutils.getText(alLData.get(i)));
        }
    }

    public void filterCategories(String category,String subCategory){
        Browserutils.selectBy(this.category,category,"text");
        Browserutils.selectBy(this.sub_category,subCategory,"text");
    }
//
    public void clickActionAndViewButton() throws InterruptedException {
        Thread.sleep(1000);
        actionButtons.get(0).click();
        Thread.sleep(2000);
        viewButtons.get(0).click();
        Thread.sleep(1000);
    }

    public void categoryInformation(String expectedCategory,String expectedSubCategory){
        Assert.assertEquals(expectedCategory,Browserutils.getText(productName2));
        Assert.assertEquals(expectedSubCategory,Browserutils.getText(subCategory));
    }





}