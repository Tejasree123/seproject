package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Verifyelement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement gender = driver.findElement(By.id("u_0_9"));
		Thread.sleep(2000);
		gender.click();
		
		//Verify radio button is displayed
		boolean a = gender.isDisplayed();
		if(a)
		{
			System.out.println("Gender Radio button is displayed");
		}
		else
		{
			System.out.println("Gender Radio button is not displayed");
		}
		
		//Verify button enabled
		boolean b = gender.isEnabled();
		if(b)
		{
			System.out.println("Gender Radio button is enabled");
		}
		else
		{
			System.out.println("Gender Radio button is not enabled");
		}
		
		//Verify button selected
		boolean c = gender.isSelected();		
		if(c)
		{
			System.out.println("Gender Radio button is Selected");
		}
		else
		{
			System.out.println("Gender Radio button is not Selected");
		}
		driver.close();

	}

}
