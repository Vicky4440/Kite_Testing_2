package kite_withxl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pin_with_Xl {
	@FindBy(id = "pin") private WebElement pin1;
	@FindBy(xpath = "//button[@type='submit']") private WebElement clickbutton;
	
	public pin_with_Xl(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void sendpin(String pin)
	{
		pin1.sendKeys(pin);
	}
	 public void click() {
		 clickbutton.click();
	 }

	 
	 
	 
}
