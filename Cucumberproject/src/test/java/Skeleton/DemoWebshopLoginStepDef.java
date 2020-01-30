package Skeleton;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DemoWebshopLoginStepDef {
	WebDriver driver;
	public DemoWebshopLoginStepDef()
	
	{
		 System.setProperty("webdriver.chrome.driver","src/test/resources/project/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		PageFactory.initElements(driver,DemowebshopLoginpage.class);
		
	}
	@Given("The URL of the demo WebShop {string}")
	public void the_URL_of_the_demo_WebShop(String url) {
		driver.get(url);
	   
	}

	@When("User enters {string} as uSername")
	public void user_enters_as_uSername(String username) {
		DemowebshopLoginpage.email.sendKeys(username);
	  
	}

	@When("User enters {string} as pAssword")
	public void user_enters_as_pAssword(String password) {
		DemowebshopLoginpage.password.sendKeys(password);
	}
	@When("User clicks on login bUtton")
	public void user_clicks_on_login_bUtton() {
		DemowebshopLoginpage.Login.click();
	   
	}

	@Then("User is in a Valid Page")
	public void user_is_in_a_Valid_Page() {
		Assert.assertTrue(DemowebshopLoginpage.Logout.isDisplayed());
		DemowebshopLoginpage.Logout.click();
	    	
	}

}