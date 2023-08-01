package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import static UtilsLayer.utillsLogin.*;

public class LoginPage extends BaseClass {
	
	@FindBy(name="user-name")
	WebElement user;
	
	@FindBy(name="password")
	WebElement pass;
	
	@FindBy(name="login-button")
	WebElement login;
	
	public LoginPage()
	{
	
		PageFactory.initElements(driver, this);
	}
	
	public void loginPageFunctionality(String uname,String password)
	{
		sendKeys(user,uname);
		sendKeys(pass, password);
		click(login);
	}
	
	
	

}
