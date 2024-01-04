package com.test.sauceLab.stepdefinitions;

import com.test.sauceLab.pages.SauceLabLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class LoginStepDef {

    WebDriver driver= DriverHelper.getDriver();
   SauceLabLoginPage sauceLabLoginPage=new SauceLabLoginPage(driver);

    @Given("User navigates to website {string}")
    public void user_navigates_to_website(String url) {
        driver.get(url);
    }
    @When("user provides {string} and {string} to the login page")
    public void user_provides_and_to_the_login_page(String username, String password) {
        sauceLabLoginPage.loginInformation(username,password);

    }
    @Then("user validates the {string} from Mainpage")
    public void user_validates_the_from_mainpage(String expextedTitle) {
        Assert.assertEquals(expextedTitle,driver.getTitle().trim());

    }
}
