package javascriptExecutor_demo;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolling_page {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//1.scroll down the page by pixel number
		//js.executeScript("window.scrollBy(0,1500)", "");
		//System.out.println(js.executeScript("return window.pageYOffset;", ""));//returns exact position where scrollbar is stopped
		
		//2.Scroll the page till element is displayed
		WebElement ele=driver.findElement(By.xpath("//strong[normalize-space()='Community poll']"));
		js.executeScript("arguments[0].scrollIntoView();",ele);
		System.out.println(js.executeScript("return window.pageYOffset;", ""));//1935.199951171875
		
		//3. Scroll page till end of the document
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");// end of document
		System.out.println(js.executeScript("return window.pageYOffset;", ""));//2476
		Thread.sleep(5000);
		
		//scrolling up to initial position
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");// end of document
	
		
		

	}

}
