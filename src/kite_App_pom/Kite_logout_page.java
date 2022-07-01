package kite_App_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_logout_page {
	@FindBy(xpath = "//span[@class='user-id']")private WebElement id;
@FindBy(xpath = "//a[@target='_self']")private WebElement logout2;


public Kite_logout_page(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
}

public void clik() {
	id.click();
}
public void logout() {
	logout2.click();
}


}
