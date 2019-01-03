package pack2;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyactions {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver(); 
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		Thread.sleep(3000);
		
		WebElement linkGmail = driver.findElement(By.partialLinkText("Gmail"));  
		Actions Act = new Actions(driver); 
		//Open gmail page in new window	
		Thread.sleep(3000);
		Act.contextClick(linkGmail).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		// Tab to Apps
		//Act.contextClick(linkGmail).sendKeys(Keys.ESCAPE).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		
		//Google search
		/*driver.findElement(By.xpath("html/body/div/div[3]/form/div[2]/div[2]/div/div/div[2]/div/div/div[2]/div/input[1]")).sendKeys("j");
		Actions Act = new Actions(driver); 

		Act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
		System.out.println(driver.getTitle());*/

	}

}
