package pack2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scrollpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.jqueryui.com");
		
		//ScrollPage
		JavascriptExecutor j = (JavascriptExecutor)driver;
		
		j.executeScript("window.scrollBy(0,1200)");    //ScrollDown
		Thread.sleep(2000);
		j.executeScript("window.scrollBy(0,-500)");   //ScrollUp
		j.executeScript("window.scrollBy(100,0)");    //ScrollRight
		j.executeScript("window.scrollBy(-100,0)");   //ScrollLeft
		
	
		//ScrollToWebElement
	   /*JavascriptExecutor j = (JavascriptExecutor)driver;
		WebElement w = driver.findElement(By.linkText("Selectmenu"));
		Thread.sleep(4000);
		j.executeScript("arguments[0].scrollIntoView();", w);
		Thread.sleep(2000);   
		j.executeScript("arguments[0].click();", w);*/
		
		
		driver.quit();
		
		

	}

}
