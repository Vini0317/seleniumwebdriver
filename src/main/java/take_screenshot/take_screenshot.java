package take_screenshot;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class take_screenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//1. Capture Full page Screenshot
		//TakesScreenshot ts= (TakesScreenshot)driver;
		//File source_file=ts.getScreenshotAs(OutputType.FILE);//return file type of variable or object
		//File target_file=new File(System.getProperty("user.dir")+"\\screenshots\\fullpage.png");
		//source_file.renameTo(target_file);// copy source file to target file
		
		//2. Specific part of web page
		//WebElement featured_product=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		//File source_file=featured_product.getScreenshotAs(OutputType.FILE);// calling from web element interface
		//File target_file=new File(System.getProperty("user.dir")+"\\screenshots\\featuredproduct.png");
		//source_file.renameTo(target_file);
		//driver.quit();
		
		//3. web element
		WebElement logo= driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File source_file=logo.getScreenshotAs(OutputType.FILE);
		File target_file=new File(System.getProperty("user.dir")+"\\screenshots\\logo.png");
		source_file.renameTo(target_file);
		driver.quit();
		

	}

}