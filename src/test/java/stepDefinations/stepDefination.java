package stepDefinations;

//import cucumber.api.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

import org.junit.runner.RunWith;

	@RunWith(Cucumber.class)
	public class stepDefination {
	    @Given("^User is on NetBanking landing page$")
	    public void user_is_on_netbanking_landing_page() throws Throwable {   
	    	//Code to navigate to the login url
	    	System.out.println("User is on NetBanking landing page");
	    }
	    @When("^User login into application with username and password$")
	    public void user_login_into_application_with_username_and_password() throws Throwable {
	       	//Code to login with username and password
	    	System.out.println("User login into application with username and password");
	    }
	    @Then("^Home page is populated$")
	    public void home_page_is_populated() throws Throwable {   
	    	// Home page validation
	    	System.out.println("Home page is populated");
	    }
	    @And("^Cards are displayed$")
	    public void cards_are_displayed() throws Throwable {   
	    	// Validating the cards
	    	System.out.println("Cards are displayed");
	    }
	
}