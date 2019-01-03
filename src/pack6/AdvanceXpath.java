package pack6;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdvanceXpath {
public static int i;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://testingmasters.weebly.com/webtables.html");
		driver.manage().window().maximize();
		
		//Click on the checkboxes of the records whose Designation is Analyst.
		List<WebElement> analyst = driver.findElements(By.xpath("//table/thead/tr/th[text()='Designation']/parent::tr/parent::thead/following::tbody/tr/td[text()='Analyst']"));
		int a= analyst.size();
		System.out.println(a);
		for(i=0;i<=a-1;i++)
		{
			String s = analyst.get(i).getText();
			System.out.println(s);
			
			if(s.contains("Analyst"))
			{
				//String str =id.get(i).getText();
				//System.out.println(str);
				List<WebElement> c =driver.findElements(By.xpath("//table/thead/tr/th[text()='Designation']/parent::tr/parent::thead/following::tbody/tr/td[text()='Analyst']/preceding::td[4]/input"));
				c.get(i).click();
			
			}
			
		}

		
		
		//Print the employee ID's of the candiates whose designation is Analyst.
	/*	List<WebElement> analyst = driver.findElements(By.xpath("//table/thead/tr/th[text()='Designation']/parent::tr/parent::thead/following::tbody/tr/td[text()='Analyst']"));
		int a= analyst.size();
		System.out.println(a);
		for(i=0;i<=a-1;i++)
		{
			String s = analyst.get(i).getText();
			
			if(s.contentEquals("Analyst"))
			{
				List<WebElement> id = driver.findElements(By.xpath("//table/thead/tr/th[text()='Designation']/parent::tr/parent::thead/following::tbody/tr/td[text()='Analyst']/preceding::td[3]"));
				String str =id.get(i).getText();
				System.out.println(str);
				
			}
			else
			{
				System.out.println("Not printed");
			}
			
		}*/
		
		
		//Click on the checkboxes of the records whose username is Vinod and Designation is analyst.
		List<WebElement> vinod = driver.findElements(By.xpath("//table/thead/tr/th[text()='Designation']/parent::tr/parent::thead/following::tbody/tr/td[text()='Analyst']/preceding::td[2][text()='Vinod']"));
		int b= vinod.size();
		System.out.println(b);
		for(i=0;i<=a-1;i++)
		{
			String s = vinod.get(i).getText();
			System.out.println(s+""+i);
			
			if(s.contentEquals("Vinod"))
			{
				List<WebElement> id = driver.findElements(By.xpath("//table/thead/tr/th[text()='Designation']/parent::tr/parent::thead/following::tbody/tr/td[text()='Analyst']/preceding::td[2][text()='Vinod']/preceding::td[2]/input"));
				id.get(i).click();
				
			}
			
		}
		
		
	}

}
