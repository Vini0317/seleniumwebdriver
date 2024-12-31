package datepickerdemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepickerdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.get("https://jqueryui.com/datepicker/");
	        driver.manage().window().maximize();
	        
	        //switch to the frame
	        driver.switchTo().frame(0);
	        
	        //Method 1:using sendkeys
	        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/05/2024");
	        
	        //Method 2: using date picker
	        String year="2025";
	        String month="May";
	        String date="20";
	        driver.findElement(By.xpath("//input[@id='datepicker']")).click();//opens date picker
	        
	        //selects month and year
	        while(true) {
	        	String current_month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
	        	String current_year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
	        	if(current_month.equals(month) && current_year.equals(year)) {
	        		break;
	        	}
	        	 driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();//Next
	 	        
	        		
	        	}
	        List<WebElement> alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"))
	       
	        for(WebElement dt:alldates) {
	        	if(dt.getText().equals(date)) {
	        		dt.click();
	        		break;
	        	}
	        }
	        

	}

}
