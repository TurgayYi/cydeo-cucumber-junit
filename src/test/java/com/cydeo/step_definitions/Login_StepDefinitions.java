package com.cydeo.step_definitions;

import com.cydeo.pages.WikiSearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinitions {

    @Given("user is on the library login page")
    public void user_is_on_the_library_login_page() {

        System.out.println("user is on the library login page");

    }


    @When("user enters librarian username")
    public void userEntersLibrarianUsername() {
        System.out.println("user enters librarian username");
    }

    @And("user enters librarian password")
    public void userEntersLibrarianPassword() {
        System.out.println("user enters librarian password");
    }

    @Then("user should see the dashboard")
    public void userShouldSeeTheDashboard() {
        System.out.println("user  sees the dashboard");
    }

    @When("user enters student username")
    public void userEntersStudentUsername() {
        System.out.println("user enters student username");
    }

    @And("user enters student password")
    public void userEntersStudentPassword() {
        System.out.println("user enters student password");
    }

    @When("user enters admin username")
    public void userEntersAdminUsername() {
        System.out.println("user enters admin username");
    }

    @And("user enters admin password")
    public void userEntersAdminPassword() {
        System.out.println("user enters admin password");
    }

}