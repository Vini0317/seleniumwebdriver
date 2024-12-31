package annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//Login                            @BeforeMethod
//Search			  @Test
//Logout			  @AfterMethod
//Login
//Advance Search            @Test
//Logout


public class annotationdemo_1 
{
	@BeforeMethod
	void login() {
		System.out.println("This is login");

	}
	@Test(priority=1)
	void search() {
		System.out.println("This is search");
	}
	@Test(priority=2)
	void advsearch() {
		System.out.println("This is advanced seacrh");
	}
	@AfterMethod
	void logout() {
		System.out.println("This is logout");
	}

}
