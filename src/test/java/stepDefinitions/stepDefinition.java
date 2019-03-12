package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinition {

    @Given("^I navigate to the site$")
    public void I_navigate_to_the_site() throws Exception {
        System.out.print("Navigate to the site");
    }

    @When("^I click the button$")
    public void I_click_the_button() throws Exception {
        System.out.print("Click the button");
    }

    @Then("^I can see the message$")
    public void I_can_see_the_message() throws Exception {
        System.out.print("See the message");
    }
}
