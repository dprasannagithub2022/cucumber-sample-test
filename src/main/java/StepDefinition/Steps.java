package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

	@Given("^Open the Firefox and launch the application$")
	public void open_the_Firefox_and_launch_the_application() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("This Step open the Firefox and launch the application.");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\laksh\\Downloads\\chromedriver_win32_new\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://facebook.com");
		driver.close();
	}

	@When("^Enter the Username and Password$")
	public void enter_the_Username_and_Password() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("This step enter the Username and Password on the login page.");
       // write logic for login button. this msg is for git push testing.
	}

	@Then("^Reset the credential$")
	public void reset_the_credential()  {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("This step click on the Reset button.");
		
	}

}
