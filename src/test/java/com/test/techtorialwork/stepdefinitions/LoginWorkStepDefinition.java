package com.test.techtorialwork.stepdefinitions;

import com.test.techtorialwork.pages.LoginWorkPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.Configreader;
import utils.DriverHelper;

public class LoginWorkStepDefinition {
    WebDriver driver= DriverHelper.getDriver();
    LoginWorkPage loginWorkPage=new LoginWorkPage(driver);

    @Given("User validates the title is {string}")
    public void user_validates_the_title_is(String expectedTitle) {
        Assert.assertEquals(expectedTitle,driver.getTitle());

    }
    @Given("user validates the login is visibale on the page")
    public void user_validates_the_login_is_visibale_on_the_page() {
        Assert.assertTrue(loginWorkPage.isLoginVisible());

    }
    @When("user provide username and password to the loginPage")
    public void user_provide_username_and_password_to_the_login_page() {
        loginWorkPage.login(Configreader.readProperty("work_username"),Configreader.readProperty("work_password"));

    }
    @Then("User validates the title {string} from MainPage")
    public void user_validates_the_title_from_main_page(String expectedTitle) {
        Assert.assertEquals(expectedTitle,driver.getTitle().trim());

    }
    @When("User provides {string} and {string} to the LoginPage")
    public void user_provides_and_to_the_login_page(String username, String password) {
        loginWorkPage.login(username,password);

    }
    @Then("User validates {string} and {string} from LoginPage")
    public void user_validates_and_from_login_page(String errorMessage, String expectedColor) {
        loginWorkPage.errorMessageAndColor(errorMessage,expectedColor);
    }

}
