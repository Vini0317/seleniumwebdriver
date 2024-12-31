package dynamictablewithpagination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamictablewithpagination {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo3x.opencartreports.com/admin/");
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.xpath("//input[@id='input-username']"));
        username.clear();
        username.sendKeys("demo");

        WebElement password = driver.findElement(By.xpath("//input[@id='input-password']"));
        password.clear();
        password.sendKeys("demo");

        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
        driver.findElement(By.xpath("//ul[@id='collapse5']//a[contains(text(),'Customers')]")).click();
        
        String text=driver.findElement(By.xpath("//div[contains(text(),'Showing')]")).getText();
        int total_pages=Integer.parseInt(text.substring(text.indexOf("(")+1), text.indexOf("Pages")-1); 
        //repeating pages
        for(int p=1;p<=total_pages;p++) {
        	if(p>1) {
        		
        	}
        }
    }
    
}
