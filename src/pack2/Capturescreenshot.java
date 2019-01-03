package pack2;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Capturescreenshot {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		WebDriver  driver = new FirefoxDriver();
   	  driver.manage().window().maximize(); 
   	 driver.get("http://www.google.com");
   	  
   	  File sf = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(sf, new File("C:\\Users\\admin\\Desktop\\Googe.jpeg"));

	}

}
