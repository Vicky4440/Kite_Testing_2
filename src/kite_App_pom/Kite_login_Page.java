package kite_App_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_login_Page {
	//1. data members/variables
		@FindBy(id = "userid") private WebElement UN;
		@FindBy(id = "password") private WebElement PWD;
		@FindBy(xpath = "//button[@type='submit']") private WebElement loginButton;
		@FindBy(xpath = "//sapn[@class='user_id']")private WebElement Userid;
		//2. constructor
		public Kite_login_Page(WebDriver driver)
		{
		PageFactory.initElements(driver, this);
		}
		//3.method
		
		
		public void sendUserName(String Username)
		{
		UN.sendKeys(Username);
		}
		public void sendPassword(String Password)
		{
		PWD.sendKeys(Password);
		}
		public void clickOnLoginButton()
		{
		loginButton.click();
		}
		
		


}
