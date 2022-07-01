package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pinclick {
	
	
	@FindBy(id = "pin") private WebElement pin1;
	@FindBy(xpath = "//button[@type='submit']") private WebElement clickbutton;
	
	public Pinclick(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void sendpin()
	{
		pin1.sendKeys("982278");
	}
	 public void click() {
		 clickbutton.click();
	 }

}
