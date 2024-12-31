package First;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Launch browser(chrome)
		//WebDriver driver =new ChromeDriver();
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--headless=new"); 

		WebDriver driver =new ChromeDriver(options);
		
		
		//2 Open Url 
		driver.get("https://www.nopcommerce.com/en");
		
		//3 Validate title
		String act_title= driver.getTitle();
		if(act_title.equals("nopCommerce demo store"))
		{
			System.out.println("Test case passsed");
		}
		else {
			System.out.println("Test case failed");
		}

		//4 Close Browser
		//driver.close();
		driver.quit();
	}

}