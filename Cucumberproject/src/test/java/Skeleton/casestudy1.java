package Skeleton;



import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class casestudy1 {
	WebDriver driver;
	@Given("The URL of Testme App {string}")
	public void the_URL_of_Testme_App(String url) {
		 System.setProperty("webdriver.chrome.driver","src/test/resources/project/chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get(url);
		  driver.manage().window().maximize();
	}
	@When("User enters {string} as userName")
	public void user_enters_as_userName(String username) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("userName")).sendKeys(username);
	}


	@When("User enters {string} as firstname")
	public void user_enters_as_firstname(String firstname) {
		driver.findElement(By.id("firstName")).sendKeys(firstname);
	    
	}

	@When("User enters {string} as lastname")
	public void user_enters_as_lastname(String lastname) {
		driver.findElement(By.id("lastName")).sendKeys(lastname);
	   
	}
	@When("User enters {string} as Password")
	public void user_enters_as_Password(String password) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("password")).sendKeys(password);
	    
	}


	@When("User enters {string} as confirmpassword")
	public void user_enters_as_confirmpassword(String confirmpassword) {
		driver.findElement(By.id("pass_confirmation")).sendKeys(confirmpassword);
	   
	}

	@When("User enters {string} as gender")
	public void user_enters_as_gender(String gender) {
		driver.findElement(By.xpath("//*[@id=\"gender\"][2]")).click();
	  
	}

	@When("User enters {string} as E-mail")
	public void user_enters_as_E_mail(String email) {
		driver.findElement(By.id("emailAddress")).sendKeys(email);
	  
	}

	@When("User enters {string} as Mobilenumber")
	public void user_enters_as_Mobilenumber(String mb) {
		driver.findElement(By.id("mobileNumber")).sendKeys(mb);
	    
	}

	@When("User enters {string} as DOB")
	public void user_enters_as_DOB(String  dob) {
		driver.findElement(By.xpath("//*[@id=\"dob\"]")).sendKeys(dob);
	   
	}

	@When("User enters {string} as Address")
	public void user_enters_as_Address(String address) {
		driver.findElement(By.id("address")).sendKeys(address);
	   
	}

	@When("User enters {string} as SecurityQuestion")
	public void user_enters_as_SecurityQuestion(String sq) {
		driver.findElement(By.xpath("//*[@id=\"securityQuestion\"]")).sendKeys(sq);
	   
	}

	@When("User enters {string} as Answer")
	public void user_enters_as_Answer(String ans) {
		driver.findElement(By.id("answer")).sendKeys(ans);
	   
	}

	@When("User clicks on register button")
	public void user_clicks_on_register_button() {
		driver.findElement(By.cssSelector("body > main > div > div > form > fieldset > div > div:nth-child(14) > div > input.btn.btn-lg.btn-success.col-xs-3.col-md-offset-0")).click();
	    
	}
	@Then("User is in a valid Page")
	public void user_is_in_a_valid_Page() {
		Assert.assertEquals(driver.getTitle(),"Login");
		System.out.println(driver.getTitle());


	    
	}


}
