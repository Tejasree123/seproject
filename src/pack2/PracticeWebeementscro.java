package pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeWebeementscro {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://jqueryui.com/");
		driver.manage().window().maximize();
		JavascriptExecutor j = (JavascriptExecutor)driver;
		WebElement w = driver.findElement(By.linkText("Easing"));
		j.executeScript("arguments[0].scrollIntoView();", w);
		Thread.sleep(2000);		
		j.executeScript("arguments[0].click();", w);
		//driver.close();
	}

}
