#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.steps;

import javax.inject.Inject;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.Given;

import static org.junit.Assert.assertEquals;

public class ExampleSteps {

    @Inject
    private WebDriver webDriver;

    @Given("^I search for \"([^\"]*)\"$")
    public void i_search_for(String arg1) {
    }

    @Then("^I google should show me results!$")
    public void i_google_should_show_me_results() {
    }
}