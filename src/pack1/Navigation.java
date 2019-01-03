package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		WebDriver driver  = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://testingmasters.com/hrm");
		driver.findElement(By.id("txtUsername")).sendKeys("user02");
		String  s1 = driver.findElement(By.id("txtUsername")).getAttribute("value");
		System.out.println(s1);
		
		driver.findElement(By.id("txtPassword")).sendKeys("pass1234");
		String str = driver.findElement(By.id("txtPassword")).getTagName();
		System.out.println(str);
		Thread.sleep(3000);
		String  s = driver.findElement(By.partialLinkText("OrangeHRM, Inc")).getAttribute("href");
		System.out.println(s);	
		
		driver.findElement(By.id("btnLogin")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.com");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.close();
		
		
       
	}

}
