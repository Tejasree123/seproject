package pack1;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Location {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://testingmasters.com/hrm");
		/*WebElement element = driver.findElement(By.id("btnLogin"));

		//Get the particular Element Location
		Point p = element.getLocation();
		System.out.println("X-coordinate:  "+p.getX()+"pixels");
		System.out.println("Y-coordinate:  "+p.getY()+"pixels");
		*/
		//----------------------------------------------------------------------------------
		
		//Navigate to another application
		driver.navigate().to("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.name("firstname"));
		System.out.println(ele.getCssValue("background-color"));
		
		//Get particular Element height & width 
		Dimension d = ele.getSize();
		System.out.println("Element height is: "+d.getHeight()+"px");
		System.out.println("Element width is: "+d.getWidth()+"px");

	}

}
