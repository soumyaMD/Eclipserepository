package Skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class program1 {
	
	Person Sean=new Person();
	@Given("Sean is {int} meters away from Lucia")
	public void sean_is_meters_away_from_Lucia(Integer dis) {
	    // Write code here that turns the phrase above into concrete actions
		Sean.setDistance(dis);
	   
	}

	@When("Sean shouts {string}")
	public void sean_shouts(String msg) {
	    // Write code here that turns the phrase above into concrete actions
	   Sean.setMessage(msg);
	}

	@Then("Lucia hears the message {string}")
	public void lucia_hears_the_message(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    String message=Sean.getMessage();
	    Assert.assertEquals("Free coffee",message);
	}
	@Then("Lucia hears no messaage")
	public void lucia_hears_no_messaage() {
	    // Write code here that turns the phrase above into concrete actions
	   String message=Sean.getMessage();
	   Assert.assertEquals(null,message);
	}



}
