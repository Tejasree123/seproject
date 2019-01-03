package testng;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample3 {
	@Test
	public void TC6()
	{
		System.out.println("TC6 execution");
	}
	
	@BeforeTest
	public void BT()
	{
		System.out.println("URL in Sample3");
	}


}
