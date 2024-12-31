package testng_day2_package;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependency_methods {
	
	@Test(priority=1)
	void openApp() {
		//Assert.assertTrue(false);//Fail the test case
		Assert.assertTrue(true);
		
		
	}
	@Test(priority=2, dependsOnMethods= {"openApp"})
	void login() {
		//Assert.assertTrue(true);//Pass the test case
		Assert.assertTrue(true);
		
	}
	@Test(priority=3, dependsOnMethods= {"login"})
	void search() {
		
		//Assert.assertTrue(true);//Pass the test case
		Assert.assertTrue(false);
	}
	@Test(priority=4, dependsOnMethods= {"login","search"})
	void advsearch() {
		Assert.assertTrue(true);//Pass the test case
	}
	@Test(priority=5, dependsOnMethods= {"login"})
	void logout(){
		Assert.assertTrue(true);//Pass the test case
	}
}
