package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class GoogleStepDefinitions {

    @When("user is on Gooogle search page")
    public void user_is_on_gooogle_search_page() {

        Driver.getDriver().get("https://www.google.com");

    }
    @Then("user should see tittle is Google")
    public void user_should_see_tittle_is_google() {

        String expectedTitle = "Google";
        String actualTitle = Driver.getDriver().getTitle();


        Assert.assertEquals(actualTitle,expectedTitle);
        Driver.closeDriver();

    }


}
