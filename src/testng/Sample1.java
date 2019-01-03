package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Sample1 {
	@Test
	public void TC1()
	{
		System.out.println("TC1 execution");
	}
	
	@Test
	public void TC2()
	{
		System.out.println("TC2 execution");
	}
		
	@BeforeMethod
	public void m1()
	{
		System.out.println("Login in Sample1");
	}
	
	@AfterMethod
	public void m2()
	{
		System.out.println("Logout in Sample1");
	}
	
	@BeforeClass
	public void BC()
	{
		System.out.println("Home Page in Sample1");
	}


}
