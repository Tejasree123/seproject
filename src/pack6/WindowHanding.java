package pack6;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHanding {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://testingmasters.com/hrm");
		String s = driver.getWindowHandle();
		System.out.println(s);
		driver.findElement(By.partialLinkText("OrangeHRM, Inc")).click();
		Set<String> str = driver.getWindowHandles();
		System.out.println(str);
		int a = str.size();
		System.out.println(a);
		for(String s1:str)
		{
			if(!s.equals(s1))
			{
				driver.switchTo().window(s1);
				//driver.close();
				driver.findElement(By.partialLinkText("Privacy Policy")).click();
				
       Set<String> s2 = driver.getWindowHandles();
       System.out.println(s2);
       int b = s2.size();
       System.out.println(b);
       for(String s3:s2)
       {
    	   if(!s2.equals(s3))
    	   {
    		   driver.switchTo().window(s3);
    	   }
       }
       driver.close();
					}
				}
	    driver.switchTo().window(s);
		Thread.sleep(2000);
		driver.findElement(By.id("txtUsername")).sendKeys("user02");
		driver.findElement(By.id("txtPassword")).sendKeys("pass1234");
		driver.findElement(By.id("btnLogin")).click();
		driver.close();

	}

}
