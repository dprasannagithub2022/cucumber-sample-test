package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHrmLoginSteps {

	@Given("^User already in the OrangeHrm Login page.$")
	public void user_already_in_the_orange_hrm_login_page() {

		
	}
	//regular expression
	//1. \"(.*)\"
	// \"([^\"]*)\ 

	@When("^I enter \"(.*)\" and \"(.*)\".$")
	public void i_enter_user_name_and_password(String username, String password) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\laksh\\Downloads\\chromedriver_win32_new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement txtusername = driver.findElement(By.id("txtUsername"));
		txtusername.sendKeys(username);

		WebElement txtpassword = driver.findElement(By.id("txtPassword"));
		txtpassword.sendKeys(password);

		WebElement btnlogin = driver.findElement(By.id("btnLogin"));
		btnlogin.click();
		driver.close();
	}

	@Then("^check user succesfully login and came to home page.$")
	public void check_user_succesfully_login_and_came_to_home_page() {
		System.out.println("orange hrm given");
	}
	
	@Given("^User already in Orange HRM$")
	public void user_already_in_orange_hrm() {
	    
	}
	@When("^I enter user name  for the \"(.*)\" and \"(.*)\" in step$")
	public void i_enter_user_name_for_the_admin_and_admin123_in_step(String username,String password) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\laksh\\Downloads\\chromedriver_win32_new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement txtusername = driver.findElement(By.id("txtUsername"));
		txtusername.sendKeys(username);

		WebElement txtpassword = driver.findElement(By.id("txtPassword"));
		txtpassword.sendKeys(password);

		WebElement btnlogin = driver.findElement(By.id("btnLogin"));
		btnlogin.click();
		driver.close();
		System.out.println(" Data from scenario out line.");

		
	}
	@Then("^I verify  step$")
	public void i_verify_step() {
	   System.out.println("orange hrm usign outline scenario");
	}

}
