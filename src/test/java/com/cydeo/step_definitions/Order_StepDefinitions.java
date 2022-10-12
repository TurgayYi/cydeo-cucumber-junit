package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.OrderPage;
import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Order_StepDefinitions {

    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();
    BasePage basePage = new BasePage();

    OrderPage orderPage = new OrderPage();

    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {

        //getting the url using the URL from configuration.properties
        Driver.getDriver().get(ConfigurationReader.getProperty("web.table.url"));
        webTableLoginPage.login();
        basePage.order.click();


    }
    @When("user selects product type {string}")
    public void user_selects_product_type(String string) {

        Select select = new Select(orderPage.productDropdown);
        select.selectByVisibleText(string);

    }
    @When("user enters quantity {int}")
    public void user_enters_quantity(Integer arg) {

        //clear() method will delete whatever is in the input box
        //orderPage.inputQuantity.clear();
        orderPage.inputQuantity.sendKeys(Keys.BACK_SPACE);
        orderPage.inputQuantity.sendKeys(arg + "");
       // orderPage.inputQuantity.sendKeys(String.valueOf(arg));


    }
    @When("user enters customer name {string}")
    public void user_enters_customer_name(String string) {
        orderPage.inputName.sendKeys(string);

    }
    @When("user enters street {string}")
    public void user_enters_street(String string) {

        orderPage.inputStreet.sendKeys(string);


    }
    @When("user enters city {string}")
    public void user_enters_city(String string) {

        orderPage.inputCity.sendKeys(string);


    }
    @When("user enters state {string}")
    public void user_enters_state(String string) {
        orderPage.inputState.sendKeys(string);

    }
    @When("user enters zipcode {string}")
    public void user_enters_zipcode(String string) {
        orderPage.inputZip.sendKeys(string);

    }
    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String expectedCardType) {
        List<WebElement> cardTypes = orderPage.cardType;

        for (WebElement each : cardTypes) {
            if(each.getAttribute("value").equalsIgnoreCase(expectedCardType)){
                each.click();
            }

        }

    }
    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String string) {


    }
    @When("user enters expiry date {string}")
    public void user_enters_expiry_date(String string) {


    }
    @When("user enters process order button")
    public void user_enters_process_order_button() {


    }
    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String string) {


    }




}
