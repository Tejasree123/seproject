package pack6;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Autoituploadfile {

	public static void main(String[] args) throws IOException, InterruptedException   {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.testingmasters.com/hrm/symfony/web/index.php/auth/login");
		//driver.get("http://www.zamzar.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("user02");
		driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("pass1234");
		driver.findElement(By.xpath(".//*[@id='btnLogin']")).click();
		
		driver.findElement(By.xpath(".//*[@id='menu_pim_viewMyDetails']/b")).click();
		driver.findElement(By.xpath(".//*[@id='btnAddAttachment']")).click();
		driver.findElement(By.xpath(".//*[@id='ufile']")).click();
		
		//calling autoit code to select file:
		Runtime.getRuntime().exec("C:\\Users\\admin\\Desktop\\File Upload.exe");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='btnSaveAttachment']")).click();

		
		//driver.findElement(By.xpath(".//*[@id='inputFile']")).click();
		//Runtime.getRuntime().exec("C:\\Users\\tm\\Desktop\\File.exe");
		

	}

}
