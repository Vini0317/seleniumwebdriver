package Locators;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BasicLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoblaze.com/");
		driver.manage().window().maximize();
		
		//name
		//driver.findElement(By.name("search")).sendKeys("Macs");
		
		//id
		//boolean logoDisplayStatus=driver.findElement(By.id("logo")).isDisplayed();
		//System.out.print(logoDisplayStatus);
		
		//linkText
		//driver.findElement(By.linkText("list-group-item")).click();
		
		//partialLinkText
		//driver.findElement(By.partialLinkText("Table")).click();
		
		//className
		//List<WebElement> headerLinks= driver.findElements(By.className("list-inline-item"));
		//System.out.println("Total no.of links" +headerLinks.size());
		
		//tagName
		//List<WebElement> links= driver.findElements(By.tagName("a"));
		//System.out.println("Total no. of links" +links.size());
		List<WebElement> images= driver.findElements(By.tagName("img"));
		System.out.println("Total no. of images" +images.size());
		

	}

}
