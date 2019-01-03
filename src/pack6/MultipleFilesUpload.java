package pack6;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleFilesUpload {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zamzar.com/");
		driver.findElement(By.id("inputFile")).click();
		Runtime.getRuntime().exec("C:\\Users\\admin\\Desktop\\File Upload.exe");
		
		//AutoIT Script
		/*WinWait("File Upload","",10)
			ControlFocus("[Class:#32770]","","Edit1")
			send('"C:\Users\tm\Desktop\Hello.txt" "C:\Users\tm\Desktop\Hi.txt" "C:\Users\tm\Desktop\Test.xlsx"')
			ControlClick("[Class:#32770]","","Button1")
		 */

	}

}
