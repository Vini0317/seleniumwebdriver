package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	//constructors

		
		LoginPage (WebDriver driver){
			this.driver=driver;
			
		}
		
	
	//locators
		By txt_username=By.xpath("//input[@placeholder='Username']");
		By txt_password=By.xpath("//input[@placeholder='Password']");
		By txt_login=By.xpath("//button[normalize-space()='Login']");
		

	//action methods
		
		public void setUserName(String user) {
			driver.findElement(txt_username).sendKeys(user);
		}
		
		public void setPassword(String pwd) {
			driver.findElement(txt_password).sendKeys(pwd);
		}
		public void clickLogin() {
			driver.findElement(txt_login).click();
		}
	

}
