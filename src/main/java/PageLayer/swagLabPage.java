package PageLayer;

import static UtilsLayer.utillsLogin.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static UtilsLayer.HandleDropDown.*;
import BaseLayer.BaseClass;

public class swagLabPage extends BaseClass {
	
	@FindBy(name="add-to-cart-sauce-labs-backpack")
	WebElement backPack;
	@FindBy(name="add-to-cart-sauce-labs-bike-light")
	WebElement bikeLight;
	@FindBy(name="add-to-cart-sauce-labs-bolt-t-shirt")
	WebElement Tshirt;
	@FindBy(name="add-to-cart-sauce-labs-fleece-jacket")
	WebElement fleeceJacket;
	@FindBy(name="add-to-cart-sauce-labs-onesie")
	WebElement oneSie;
	@FindBy(name="add-to-cart-test.allthethings()-t-shirt-(red)")
	WebElement TshirtRed;
	
	
	@FindBy(xpath="//select[@class='product_sort_container']")
	WebElement NamedropDown;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	WebElement cartBadge;
	
	
	public swagLabPage() {
	
		PageFactory.initElements(driver, this);
	}
	
	public void swagLabFunctionality(String namedropdown) throws InterruptedException
	{
		Thread.sleep(3000);
		click(backPack);
		click(bikeLight);
		click(Tshirt);
		click(fleeceJacket);
		click(oneSie);
		click(TshirtRed);
		selectByVisibleText(NamedropDown,namedropdown);
		click(cartBadge);
	}
	
	
	

}
