package pack2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.jqueryui.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
		 WebElement c = driver.findElement(By.partialLinkText("Droppable"));
		 c.click();
		
		 driver.switchTo().frame(driver.findElement(By.className("demo-frame")));	
		 
		 WebElement source = driver.findElement(By.id("draggable"));
		 WebElement target = driver.findElement(By.id("droppable"));
		
		// Thread.sleep(2000);
	Actions obj = new Actions(driver);
	obj.dragAndDrop(source, target).build().perform();
		 	
		//Actions obj = new Actions(driver);
		//obj.clickAndHold(source).moveToElement(target).build().perform();
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("Datepicker")).click();
	}

}

