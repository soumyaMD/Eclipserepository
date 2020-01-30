package Skeleton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class progam2 {
	WebDriver driver;
	@Given("The URL of demo WebShop {string}")
	public void the_URL_of_demo_WebShop(String url) {
		
	  System.setProperty("webdriver.chrome.driver","src/test/resources/project/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get(url);
	  driver.manage().window().maximize();
	}

	@When("User enters {string} as username")
	public void user_enters_askmail_email_com_as_username(String username) {
		driver.findElement(By.id("Email")).sendKeys(username);
	    
	}

	@When("User enters {string} as password")
	public void user_enters_as_password(String password) {
		driver.findElement(By.id("Password")).sendKeys(password);
	    
	   
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
	    
	   
	}

	@Then("User is in a valid page")
	public void user_is_in_a_valid_page() {
		Assert.assertTrue(driver.findElement(By.linkText("Log out")).isDisplayed());
		driver.findElement(By.linkText("Log out")).click();
	   
	}



}
