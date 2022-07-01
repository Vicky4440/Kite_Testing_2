package framework;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FB_Login_page {
	
@FindBy(xpath = "//input[@id='email']")private WebElement UN;
@FindBy(xpath = "//input[@id='pass']")private WebElement PS;
@FindBy(xpath = "//button[@value='1']") private WebElement login;



 public FB_Login_page (WebDriver driver) {
	 PageFactory.initElements(driver, this);
 }
 
 public void usrename(String value) {
	 UN.sendKeys("8459221031");
 }
 public void password() {
	 PS.sendKeys("8552990932@@");
 }
 public void clickbutton() {
	 login.click();
 }

}
