package GetMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

import org.openqa.selenium.By;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		//get() opens the url on the browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		
		//getTitle() returns the title of the web page
		System.out.println(driver.getTitle());
		
		//getCurrentUrl() returns the url of the page
		System.out.println(driver.getCurrentUrl());
		
		//getPageSource() returns the source code of the page
		System.out.println(driver.getPageSource());
		
		//getWindowHandle() returns ID of single browser window
		String windowid= driver.getWindowHandle();
		System.out.println(windowid);
		
		//getWindowHandles() returns the ID's of multiple browsers
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();// this will open new browser window
		Set<String> windowids=driver.getWindowHandles();
		System.out.println(windowids);
		

	}

}
