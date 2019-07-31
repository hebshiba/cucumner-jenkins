package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdef2 {
	WebDriver driver;
	@When("user opens chrome")
	public void user_opens_chrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumdrivers\\chromedriver.exe");
		driver= new ChromeDriver();
		 		driver.get("http://newtours.demoaut.com");
	}

	@When("user entering valid username as {string} And password as {string}in field")
	public void user_entering_valid_username_as_And_password_as_in_field(String string, String string2) {
		driver.findElement(By.name("userName")).sendKeys(string);
		driver.findElement(By.name("password")).sendKeys(string2);
	}

	@When("user clicks login")
	public void user_clicks_login() {
		driver.findElement(By.name("login")).click();
	}

	@Then("verify login")
	public void verify_login() {
		Assert.assertTrue(driver.getTitle().contains("Flight"));
		 
		driver.close();

	}


}
