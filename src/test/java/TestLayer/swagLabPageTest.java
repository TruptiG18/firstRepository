package TestLayer;

//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.swagLabPage;

public class swagLabPageTest extends BaseClass{

	
	//@BeforeTest
    //public void setUp()	
    //{
		//initalization();
    //}
	
	@Test
	public void ValidateswagLabPageFunctionality() throws InterruptedException
	{
		 swagLabPage s1=new swagLabPage();
		 s1.swagLabFunctionality("Price (low to high)");
	}
	
}
