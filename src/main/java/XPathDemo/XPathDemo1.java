package XPathDemo;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class XPathDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//XPath with a single attribute
		//driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("t-shirts");
		
		//XPath with multiple attributes
		//driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("t-shirts");
		
		//XPath with and operator
		driver.findElement(By.xpath("input[@name='search' and @placeholder='Search']")).sendKeys("t-shirts");

	}

}
