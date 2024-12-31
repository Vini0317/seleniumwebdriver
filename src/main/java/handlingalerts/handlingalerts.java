package handlingalerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingalerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		//1. Normal alert with OK button
		//driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		//Thread.sleep(5000);
		//driver.switchTo().alert().accept();//retuns alert window then accepting it
		//Alert myalert= driver.switchTo().alert();
		//System.out.println(myalert.getText());
		//myalert.accept();//close alert window
		
		//2. Confirmation alert
		/*driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(4000);
		
		driver.switchTo().alert().dismiss();*/
		
		//3. Prompt alert
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		Alert myalert=driver.switchTo().alert();
		myalert.sendKeys("HELLO");
		myalert.accept();

	}

}
