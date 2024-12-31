package testng_day2_package;

import org.testng.annotations.Test;

public class SignUp_test {
	@Test(priority=1, groups={"regression"})
	void SignUpByEmail() {
		System.out.println("This is sign up by email");
		
	}
	@Test(priority=2,groups={"regression"})
	void SignUpByFacebook() {
		System.out.println("This is sign up by Facebook");
		
	}
	@Test(priority=3,groups={"regression"})
	void SignUpByTwitter() {
		System.out.println("This is sign up by Twitter");
		
	}

}
