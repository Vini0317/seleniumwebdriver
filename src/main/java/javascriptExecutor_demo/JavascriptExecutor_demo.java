package javascriptExecutor_demo;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class JavascriptExecutor_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement input_box=driver.findElement(By.xpath("//input[@id='name']"));
		
		//passing the text into input box- alternate of sendkeys method
		JavascriptExecutor js= (JavascriptExecutor)driver;//typecasting
		js.executeScript("arguments[0].setAttribute('value', 'demo')", input_box);

	}

}
