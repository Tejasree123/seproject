
package pack1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Mypractice {
	public static void main (String args[]) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("womans wear");
		driver.findElement(By.className("nav-input")).click();
		
		driver.close();
		
	}

}
