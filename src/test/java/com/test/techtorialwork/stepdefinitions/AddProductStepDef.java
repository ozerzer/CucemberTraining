package com.test.techtorialwork.stepdefinitions;

import com.test.techtorialwork.pages.MainWorkPage;
import com.test.techtorialwork.pages.ProductWorkPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class AddProductStepDef {
    WebDriver driver = DriverHelper.getDriver();
    MainWorkPage mainWorkPage = new MainWorkPage(driver);
    ProductWorkPage productWorkPage = new ProductWorkPage(driver);

    @When("User clicks Products button on the left side and AddProductButton from ProductPage")
    public void user_clicks_products_button_on_the_left_side_and_add_product_button_from_product_page() throws InterruptedException {
        mainWorkPage.clickProductButton();
        productWorkPage.addProductButton();
    }

    @When("User provides {string} and {string} to ProductDetails")
    public void user_provides_and_to_product_details(String productName, String price) throws InterruptedException {

        productWorkPage.provideProductInformation(productName, price);

    }

    @When("User selects {string}, {string} and  {string} from dropdowns")
    public void user_selects_and_from_dropdowns(String category, String subCategory, String tax) {
        productWorkPage.provideDropDownInformation(category, subCategory, tax);
    }

    @When("User clicks purchase checkbox and add {string}")
    public void user_clicks_purchase_checkbox_and_add(String description) throws InterruptedException {

        productWorkPage.checkBoxAndDescription(description);

    }

    @When("User provides picture {string} and click save button")
    public void user_provides_picture_and_click_save_button(String location) throws InterruptedException {
        productWorkPage.pictureAndSaveBUtton(location);
    }

    @Then("User validates all the product details , {string},{string},{string} from table")
    public void user_validates_all_the_product_details_from_table(String expectedProductName, String expectedPrice, String canPurchase) throws InterruptedException {
    productWorkPage.allInformation(expectedProductName,expectedPrice,canPurchase);
    }

    @When("User clicks Products Button")
    public void user_clicks_products_button() {
        mainWorkPage.clickProductButton();
    }
    @When("User selects {string} and {string} for categories")
    public void user_selects_and_for_categories(String category, String subCategory) {
        productWorkPage.filterCategories(category,subCategory);
    }
    @When("User clicks three dots and view button from ProductPage")
    public void user_clicks_three_dots_and_view_button_from_product_page() {
    productWorkPage.clickActionAndViewButton();
    }
    @Then("User validates {string} and {string} from action view")
    public void user_validates_and_from_action_view(String productName ,String subCategory2) {
        productWorkPage.categoryInformation(productName,subCategory2);
    }



}
