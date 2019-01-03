package pack1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Getvalue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.testingmasters.com/hrm");
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		if(URL.contains("login"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		driver.findElement(By.id("txtUsername")).sendKeys("user01");
		driver.findElement(By.id("txtPassword")).sendKeys("pass1234");
		
		String un = driver.findElement(By.id("txtUsername")).getAttribute("value");
		System.out.println(un);
		
		/*driver.get("https://www.google.co.in/");
	//	driver.manage().window().maximize();
		String s = driver.findElement(By.xpath(".//*[@id='gbw']/div/div/div[1]/div[1]/a")).getText();
		System.out.println(s);*/
		driver.close();	

	}

}