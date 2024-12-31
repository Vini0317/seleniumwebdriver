package cssSelectors;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class cssLocatorsCustomize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		//ChromeDriver driver= new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		//tag#id where tag is optional
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("t-shirts");
		
		//tag.className
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("t-shirts");

		//tag[attribute='value']
		//driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("t-shirt");
		
		//tag class attribute
		//driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("t-shirts");
		
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("q");
		
		//XPath with text()- innertext
		//driver.findElement(By.xpath("//*[text()='MacBook']")).click();
		
		//isDisplayed() method
		//boolean displaystatus=driver.findElement(By.xpath("//*[text()='Featured products']")).isDisplayed();
		//System.out.println(displaystatus);
		
		//String value= driver.findElement(By.xpath("//*[text()='Featured products']")).getText();
		//System.out.println(value);
		
		//XPath with contains()
		//driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')])")).sendKeys("q");
		
		//XPath with starts-with()
		//driver.findElement(By.xpath("//*input[starts-with(@placeholder,'')])")).sendKeys("q");
		
		//chained XPath
		boolean display=driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
		System.out.println(display);
		
		
	
	}

}
