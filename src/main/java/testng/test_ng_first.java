package testng;

import org.testng.annotations.Test;

//open app
//login to an app
//logout from an app

public class test_ng_first 
{
	@Test(priority=1)
	void openApp() {
		System.out.println("Opening an application");
		
	}
	@Test(priority=2)
	void loginApp() {
		System.out.println("Login");
		
	}
	@Test(priority=3)
	void logoutApp() {
		System.out.println("Logout");
		
	}

}
