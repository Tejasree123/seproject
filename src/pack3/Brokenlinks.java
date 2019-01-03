package pack3;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Brokenlinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://testingmasters.com/hrm");
		driver.findElement(By.id("txtUsername")).sendKeys("user02");
		driver.findElement(By.id("txtPassword")).sendKeys("pass1234");
		driver.findElement(By.id("btnLogin")).click();
		
		List<WebElement> links = driver.findElements(By.xpath("/html/body/div[1]/div[2]/ul/li/a"));
		for(int i=0;i<links.size();i++)
		{
			String taburl = links.get(i).getAttribute("href");
			//System.out.println(taburl);
			
			if(taburl !=null)
			{
			URL url = new URL(taburl);
			HttpURLConnection connection = (HttpURLConnection)url.openConnection();
			connection.connect();
			
			// Get response code of URL
			int responsecode = connection.getResponseCode();
			System.out.println(links.get(i).getText()+ " url responsecode is: "+responsecode);
			
			// Link URL Is valid If found response code = 200.
			// Link URL Is Invalid If found response code = 404 or 505.
			//(responsecode == 404) || (responsecode == 505)
			if(responsecode==200)
			{
				System.out.println(links.get(i).getText()+ " url is not broken");
			}
			else
			{
				System.out.println(links.get(i).getText()+ " url broken");
			}
			}
			else
			{
				System.out.println("taburl is null");
			}
		}

	}

}
