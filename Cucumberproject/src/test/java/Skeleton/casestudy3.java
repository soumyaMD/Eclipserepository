package Skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class casestudy3 {
	WebDriver driver;
	
	
	@Given("The URL of testme App {string}")
	public void the_URL_of_testme_App(String url) {
		 System.setProperty("webdriver.chrome.driver","src/test/resources/project/chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get(url);
		  driver.manage().window().maximize();
	  
	}


	@When("User enters {string} as UserName")
	public void user_enters_as_UserName(String username) {
		driver.findElement(By.id("userName")).sendKeys(username);
	   
	}

	@When("User enters {string} as PassWord")
	public void user_enters_as_PassWord(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}
	@Then("User clicks on search bar")
	public void user_clicks_on_search_bar() {
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	}   

	@Then("clicks on searchbar")
	public void clicks_on_searchbar() {
		
		driver.findElement(By.xpath("//*[@id=\"myInput\"]")).click();
	}
	@Then("click on dropbar")
	public void click_on_dropbar() {
		driver.findElement(By.xpath("//*[@id=\"myInputautocomplete-list\"]/div")).click();

	}
	@Then("click on finddetails")
	public void click_on_finddetails() {
		
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}

	@Then("display that Product details")
	public void display_that_Product_details() {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/img")).click();
	 	}

}
