package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	WebDriver driver;
	String title;
	@Given("^Login application should be availale$")
	public void login_application_should_be_availale(){
	    // Write code here that turns the phrase above into concrete actions
		driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^Validate login application$")
	public void validate_login_application(){
	    // Write code here that turns the phrase above into concrete actions
		title=driver.getTitle();
		System.out.println(title);
		System.out.println("the title is"+title);
	}

	@Then("^Login should be successful$")
	public void login_should_be_successful(){
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals("OrangeHRM", title);
	}

}
