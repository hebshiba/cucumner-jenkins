package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdef {
	WebDriver driver;

	
	@When("user opens chrome browser and opens application")
	public void user_opens_chrome_browser_and_opens_application() {
	   
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumdrivers\\chromedriver.exe");
		driver= new ChromeDriver();
		 		driver.get("http://newtours.demoaut.com");
	}

	@When("user entering username as {string} And password in field")
	public void user_entering_username_as_And_password_as(String string) {
	   		driver.findElement(By.name("userName")).sendKeys(string);
				driver.findElement(By.name("password")).sendKeys("mercury");
	    
	}
	@When("user entering invalid username as {int} And password in field")
	public void user_entering_invalid_username_as_And_password_in_field(Integer int1) {
		driver.findElement(By.name("userName")).sendKeys();
		driver.findElement(By.name("password")).sendKeys("mercury");
	}


	@When("user clicks on signin button")
	public void user_clicks_on_signin_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("login")).click();
	   
	}

	@Then("verify login result")
	public void verify_login_result() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(driver.getTitle().contains("Flight"));
		 
		driver.close();

	    
	}
}
