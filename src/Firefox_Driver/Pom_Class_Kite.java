package Firefox_Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Class_Kite {
	
	
	@FindBy(xpath = "//input[@id='userid']") private WebElement UN;
	@FindBy(xpath = "//input[@id='password']") private WebElement PWD;
	@FindBy(xpath = "//button[@class=\"button-orange wide\"]")private WebElement loginbutton;
	
	
	
	public Pom_Class_Kite( WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver,this );
	}
	public void sendun(String username) {
		UN.sendKeys(username);
	}
public void sendpwd(String password) {
		PWD.sendKeys(password);
	}
public void login(String clic) {
	loginbutton.click();
}
}
