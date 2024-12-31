package Conditional;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		
		//isDisplayed()
		WebElement logo= driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println(logo.isDisplayed());
		
		//isEnabled()
		boolean status=driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		System.out.println(status);
		
		//isSelected()
		WebElement md= driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement fd= driver.findElement(By.xpath("//input[@id='gender-female']"));
		//Before Selection
		System.out.println(md.isSelected());
		System.out.println(fd.isSelected());
		//After Selection
		fd.click();
		System.out.println(md.isSelected());
		System.out.println(fd.isSelected());
		
		

	}

}
