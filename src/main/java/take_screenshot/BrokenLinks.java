package take_screenshot;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

    public static void main(String[] args) {
        // Set ChromeDriver path (replace with your actual path if needed)
        
        WebDriver driver = new ChromeDriver();
        try {
            // Configure WebDriver
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://www.deadlinkcity.com/");
            driver.manage().window().maximize();

            // Find all links on the page
            List<WebElement> links = driver.findElements(By.tagName("a"));
            System.out.println("Total links found: " + links.size());

            // Loop through each link
            for (WebElement linkElement : links) {
                String hrefValue = linkElement.getAttribute("href");
                if (hrefValue == null || hrefValue.isEmpty()) {
                    System.out.println("Link is empty or null: " + linkElement.getText());
                    continue;
                }

                // Validate the link
                try {
                    URL linkURL = new URL(hrefValue);
                    HttpURLConnection conn = (HttpURLConnection) linkURL.openConnection();
                    conn.setConnectTimeout(5000); // Set timeout
                    conn.connect();
                    if (conn.getResponseCode() >= 400) {
                        System.out.println("Broken link: " + hrefValue + " - " + conn.getResponseMessage());
                    } else {
                        System.out.println("Valid link: " + hrefValue + " - " + conn.getResponseMessage());
                    }
                    conn.disconnect();
                } catch (IOException e) {
                    System.out.println("Error checking link: " + hrefValue + " - " + e.getMessage());
                }
            }
        } finally {
            // Quit the browser
            driver.quit();
        }
    }
}
