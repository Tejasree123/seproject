package pack6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageNavigation {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://testingmasters.com/hrm");
		driver.findElement(By.id("txtUsername")).sendKeys("user02");
		driver.findElement(By.id("txtPassword")).sendKeys("pass1234");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
		driver.findElement(By.id("menu_leave_viewMyLeaveList")).click();
		
		Thread.sleep(2000);
		
		int i=1;
		while(i<=10)
		{
		String str =driver.findElement(By.xpath("//form/div/ul/li")).getText();
		System.out.println(str);
		String[] arr = str.split(" ");
		System.out.println("After the split the length is: "+arr.length);
		String s = arr[0];
		System.out.println("Page number " +i+ " is: "+s);
		System.out.println("##########################################");
			if(s.contains(arr[2]))
			{
				System.out.println("Successfully verified");
				break;
			}
			else
			{
				driver.findElement(By.xpath("//a[text()='Next']")).click();
				i++;		
			}
	
		}

	}

}
