package testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Sample2 {
	@Test
	public void TC3()
	{
		System.out.println("TC3 execution");
	}
	
	@Test
	public void TC4()
	{
		System.out.println("TC4 execution");
	}
	
	@Test(enabled=false)
	public void TC5()
	{
		System.out.println("TC5 execution");
	}
	
	@BeforeTest
	public void BT()
	{
		System.out.println("Firefox in Sample2 class");
	}
	
	@BeforeSuite
	public void BS()
	{
		System.out.println("Launch Browser in Sample2");
	}


}
