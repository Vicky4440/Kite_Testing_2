package kite_withxl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page_with_Xl {
	//1. data members/variables
	@FindBy(id = "userid") private WebElement UN;
	@FindBy(id = "password") private WebElement PWD;
	@FindBy(xpath = "//button[@type='submit']") private WebElement loginButton;
	//2. constructor
	public Login_page_with_Xl(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	//3.method
	public String getActulUserID()
	{
	String actualUserID = UN.getText();
	return actualUserID;
	}
	public void validateUserID(String expectedUsername)
	{
	String actualUserID = UN.getText();
	String expetctedUserID = "ELR321";
	if(actualUserID.equals(expetctedUserID))
	{
	System.out.println("User ID matching TC is Passed");}
	else {
		System.out.println("User ID not matching TC is Failed");
		}}
	
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
