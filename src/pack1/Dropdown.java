package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver d =  new FirefoxDriver();
	d.manage().window().maximize();
	d.get("https://www.facebook.com/");
	//Day
	Select a = new Select(d.findElement(By.id("day")));
	a.selectByVisibleText("16");
	//Month
	Select b = new Select(d.findElement(By.id("month")));
	b.selectByVisibleText("Dec");
	//Year
	Select c = new Select(d.findElement(By.id("year")));
	c.selectByVisibleText("2018");
	String s1 =b.getFirstSelectedOption().getText();
	System.out.println(s1);
	
	

	
	}

}
