package com.test.techtorialwork.stepdefinitions;

import com.test.techtorialwork.pages.ClientWorkpage;
import com.test.techtorialwork.pages.MainWorkPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class AddClientsStepDef {
WebDriver driver= DriverHelper.getDriver();
MainWorkPage mainWorkPage=new MainWorkPage(driver);
ClientWorkpage clientWorkpage=new ClientWorkpage(driver);

    @When("User Clicks Clients Button on the left side and click AddClientButton from ClientPage")
    public void user_clicks_clients_button_on_the_left_side_and_click_add_client_button_from_client_page() {
        mainWorkPage.clickClientsButton();
        clientWorkpage.addClientButton();
    }
    @When("User provides {string} and  {string} to ClientDetails")
    public void user_provides_and_to_client_details(String clientName, String clientEmail) {
        clientWorkpage.nameAndEmailFunctionality(clientName,clientEmail);
    }
    @When("User select {string}  and provide {string} to ClientDetails")
    public void user_select_and_provide_to_client_details(String country, String mobile) {
        clientWorkpage.countryAndMobileFunctionality(country,mobile);

    }


    @When("User provides {string},{string},{string},{string} , {string} to CompanyDetails and click SaveButton")
    public void user_provides_to_company_details_and_click_save_button(String companyName, String companyEmail, String companyPhoneNumber, String companyAddress, String companyShippingAddress) throws InterruptedException {
        clientWorkpage.companyInformation(companyName,companyEmail,companyPhoneNumber,companyAddress,companyShippingAddress);

    }
    @Then("User validates all the client details {string},{string} and {string},{string} from table")
    public void user_validates_all_the_client_details_and_from_table(String customerName, String companyName, String customerEmail, String status) throws InterruptedException {
        clientWorkpage.saveAndValidate(customerName,companyName,customerEmail,status);


    }

    @Given("User provides username and password to the loginPage")
    public void user_provides_username_and_password_to_the_login_page() {

    }
    @When("User clicks Clients button")
    public void user_clicks_clients_button() {

    }
    @When("User clicks add client and provides personal information")
    public void user_clicks_add_client_and_provides_personal_information(DataTable dataTable) {

    }
    @When("User provides company information")
    public void user_provides_company_information(DataTable dataTable) {

    }
    @When("User provides address information")
    public void user_provides_address_information(DataTable dataTable) {

    }
    @Then("User clicks save button and validates information")
    public void user_clicks_save_button_and_validates_information(DataTable dataTable) {

    }





}
