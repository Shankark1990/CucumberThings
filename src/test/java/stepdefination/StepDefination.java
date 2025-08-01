package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Reporter;
import pages.LoginPage;

public class StepDefination {


    @Given("user enter a {string} in username field")
    public void user_enter_a_in_username_field(String string) {
        System.out.println("Inside stepdefination..");
        Hooks.loginPage.enter_user_name(string);
        Reporter.log("Hello");

    }

    @Given("user enter {string} in password field")
    public void user_enter_in_password_field(String string) {
        Hooks.loginPage.enter_password(string);

    }

    @When("user click login button.")
    public void user_click_login_button() {
        Hooks.loginPage.click_login_button();

    }

    @Then("Validate user successfully logged into application")
    public void validate_user_succussfully_logged_into_application() {
        Hooks.loginPage.verify_order_success();

    }
}
