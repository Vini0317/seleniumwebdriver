package slider;
import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class slider_mouseaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		Actions act= new Actions(driver);
		//Minimum Slider
		WebElement min_slider=driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
		System.out.println("Location of the minimum slider before moving"+min_slider.getLocation());//(58, 288)
		act.dragAndDropBy(min_slider, 100, 288).perform();
		System.out.println("Location of the minimum slider after moving:"+min_slider.getLocation());//(158, 288)
		
		//Maximum Slider
		WebElement max_slider=driver.findElement(By.xpath("//span[2]"));
		System.out.println("Location of the maximum slider before moving"+max_slider.getLocation());//(612,288)
		act.dragAndDropBy(max_slider, -12, 288).perform();
		System.out.println("Location of the minimum slider after moving:"+max_slider.getLocation());//(601,250)
	}

}
 