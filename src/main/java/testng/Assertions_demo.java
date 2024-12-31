package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions_demo {
	@Test
	void testTitle()
	{
		String exp_title="Opencart";
		String actual_title="Openshop";
		/*if(exp_title.equals(actual_title)) {
			System.out.println("Test is passed");
		}
		else {
			System.out.println("Test is failed");
		}*/
		Assert.assertEquals(exp_title, actual_title);
	}

}
