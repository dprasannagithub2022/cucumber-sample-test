package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackGroundSteps {
// Hi this is comments for git usage

@Given("Launch browser")
public void launch_browser() {
    System.out.println("Launch browser");
 
}

@When("User Enter Login")
public void user_enter_login() {
    
   System.out.println("Enter UserName"); 
}

@When("User Enter Password")
public void user_enter_password() {
    
    System.out.println("Enter Password");
}

@Then("User Click on Login button")
public void user_click_on_login_button() {
    System.out.println("click on Login button");
   
}

@Then("Navigate to Order")
public void navigate_to_order() {
   System.out.println("Click on orders and Launched in Orders Page"); 
   
}

@Given("Click on Previous Orders Link")
public void click_on_previous_orders_link() {
 System.out.println("Click on Previous Orders  Link ");   
   
}

@When("I complete action")
public void i_complete_action() {
    System.out.println(" Check Complete Action");
   
}

@Then("I validate the outcomes")
public void i_validate_the_outcomes() {
    
  System.out.println(" check out comes"); 
}

@Given("Click on Cancell Orders Link")
public void click_on_cancell_orders_link() {
	 System.out.println(" Clcik on Cancel Orders");
	   
    
}

@Then("Cancel Order Page should displayed")
public void cancel_order_page_should_displayed() {
    
	System.out.println("Cancelled Orders page should display");
}

}
