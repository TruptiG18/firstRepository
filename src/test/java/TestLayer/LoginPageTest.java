package TestLayer;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;

public class LoginPageTest extends BaseClass {
	
	@BeforeTest
	public void SetUp()
	{
		initalization();
		
	}
	
	@Test
	public void validateLoginPageFunctionality() 
	{
		LoginPage l1= new LoginPage();
		l1.loginPageFunctionality("standard_user", "secret_sauce");
		
	}
}
