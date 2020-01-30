package Skeleton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class casestudy2 {
	WebDriver driver;
	@Given("User opens login page")
	public void user_opens_login_page() {
		 System.setProperty("webdriver.chrome.driver","src/test/resources/project/chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://10.232.237.143:443/TestMeApp/loginhere.htm");
		  driver.manage().window().maximize();
	  
		
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String username, String password) {
		driver.findElement(By.id("userName")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.name("Login")).click();
	    
	    
	}

	@Then("user will be Login Home page")
	public void user_will_be_Login_Home_page() {
		Assert.assertEquals(driver.getTitle(),"Login");
		System.out.println(driver.getTitle());

	    
	}

}
