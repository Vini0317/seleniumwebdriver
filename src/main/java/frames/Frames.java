package frames;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

    public static void main(String[] args) {
        // Create a new ChromeDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Navigate to the URL
        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();

        // Locate and switch to Frame 1
        WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
        driver.switchTo().frame(frame1);

        // Interact with the input field in Frame 1
        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome");
        driver.switchTo().defaultContent(); // Go back to the main page

        // Locate and switch to Frame 2
        WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
        driver.switchTo().frame(frame2);

        // Interact with the input field in Frame 2
        driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Selenium");
        driver.switchTo().defaultContent(); // Go back to the main page

        // Close the browser
        //driver.quit();
        
        //Frame 3
        WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Java");
        //inner iframe- part of frame 3
        driver.switchTo().frame(0);//switching through index
        
        WebElement rdbtn=driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']")).click();
        driver.switchTo().defaultContent();
        
    }
}
