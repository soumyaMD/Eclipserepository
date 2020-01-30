package Skeleton;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class DemowebshopLoginpage {
	@FindBy(how=How.ID,using ="Email")
	static public WebElement email;
	@FindBy(how=How.ID,using ="Password")
	static public WebElement password;
	@FindBy(how=How.CSS,using="input[value='Log in']")
	
	static public WebElement Login;
@FindBy(how=How.CSS.LINK_TEXT,using="Log out")
	
	static public WebElement Logout;
	

}
