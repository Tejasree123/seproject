package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class1 {
public WebDriver driver;
	
	@BeforeMethod
	public void m1()
	{
		driver = new FirefoxDriver();
	}
	
	@Test
	public void TC2()
	{
		driver.get("http://testingmasters.com/hrm/");
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println("HRM Login page opened successfully");
		driver.findElement(By.id("txtUsername")).sendKeys("user02");
		driver.findElement(By.id("txtPassword")).sendKeys("pass1234");
		driver.findElement(By.name("Submit")).click();
	}	
	
	
	@AfterMethod
	public void m2()
	{
		
		driver.quit();
		System.out.println("Quit");
	}


}
