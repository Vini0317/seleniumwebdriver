package dynamicautosuggestion;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class dynamicautosuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(2000);
		List <WebElement> list= driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equals("selenium")) {
				list.get(i).click();
				break;
			}
		}
		
		

	}

}
