package pack4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class XpathBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.testingmasters.com/hrm");
		
		driver.findElement(By.xpath("/html/body/div/div/div/form/div[2]/input")).sendKeys("user02");    //i am absolute xpath
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("");    // i am relative xpath
		
		//driver.findElement(By.xpath("//input[@id='FirstName' or @name='tName']")).sendKeys("");    //i am relative xpath
		//driver.findElement(By.xpath("//input[@id='irstName' and @name='FirstName']")).sendKeys("");  // i am relative xpath
		//driver.findElement(By.xpath("//input[contains(@id,'First')]")).sendKeys("");      // i am relative xpath
		//driver.findElement(By.xpath("//input[starts-with(@id,'First')]")).sendKeys("");     //i am relative xpath
		
		//driver.findElement(By.xpath("//a[text()='Log in']")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Log')]")).click();
		//driver.findElement(By.xpath("//*[@id='FirstName']")).sendKeys("");      //i am relative xpath
		//driver.findElement(By.xpath("//input[@*='FirstName']")).sendKeys("");   //i am relative xpath
		//driver.findElement(By.xpath("//*[@*='FirstName']")).sendKeys("");       //i am relative xpath

	}

}
