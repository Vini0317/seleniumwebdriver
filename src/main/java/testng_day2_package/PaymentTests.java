package testng_day2_package;

import org.testng.annotations.Test;

public class PaymentTests {
	@Test(priority=1,groups={"sanity","regression","functional"})
	void paymentinRupees() {
		System.out.println("Payment in Rupees");
		
	}
	@Test(priority=1,groups={"sanity","regression","functional"})
	void paymentinDollars() {
		System.out.println("Payment in Dollars");
		
	}


}
