package kite_App_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Home_Page {
@FindBy(xpath = "//span[@class='user-id']") private WebElement Userid;
	
	public Kite_Home_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	public String getActulUserID()
	{
	String actualUserID = Userid.getText();
	return actualUserID;
	}

	
	public void UserIdValidation( String ExpecxtedUsername)
	{
		String ActualUserid = Userid.getText();
				
		String ExpecxtedUserid=ExpecxtedUsername;
		
		if(ActualUserid.equals(ExpecxtedUserid))
			
		{
			System.out.println("TC passed user id is matching");
		}
		else {
			System.out.println("TC failed user id is not-matching");
			
		}
	}


}
