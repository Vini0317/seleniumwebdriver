package statictable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class statictable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//1. find total no.of rows in a table
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();//multiple tables
		//int rows=driver.findElements(By.tagName("tr")).size();//use when you have single web table in your web page
		System.out.println("No.of rows:"+rows);
		
		//2 Find total no.of columns in a table
		int columns=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("No.of columns" +columns);
		
		//3. Read data from specific row and column(5th row 1st column)
		String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		System.out.println(bookname);
		
		//4. Read data from all the rows and columns
		/*for(int r=2; r<=rows;r++) {
			for(int c=1;c<=columns;c++) {
				String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.println(value+"\t");
			}
			System.out.println(" ");
		}*/
		//5. Print booknames whose author is Mukesh
		/*for(int r=2;r<=rows;r++) {
			String auth=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			//System.out.println(auth);
			if(auth.equals("Mukesh")) {
				String BookName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				System.out.println(BookName +"\t"+ auth);
			}
		}*/
		int total=0;
		for(int r=2;r<=rows;r++) {
			String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
			total=total+Integer.parseInt(price);
			
		}
		System.out.println(total);

		
		

	}
		
}
