package slider;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class openLinkinNewTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		WebElement regLink=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		Actions act= new Actions(driver);
		
		//ctrl+regLink
		act.keyDown(Keys.CONTROL).click(regLink).keyDown(Keys.CONTROL).perform();
		
		//Switching gto Registration page
		List<String>ids=new ArrayList(driver.getWindowHandles());
		driver.switchTo().window(ids.get(1));//switch to registration page
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("demo");
		
		//Home page
		driver.switchTo().window(ids.get(0));//switch to home page
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("T-shirts");
		

		
		
		

	}

}
