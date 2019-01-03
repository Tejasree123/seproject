package pack6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearch {

	String s;
	int i;
	String str;
	
	public void search() throws InterruptedException, IOException {
		
		FileInputStream fi = new FileInputStream("C:\\Users\\admin\\Documents\\Gsearch.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet sh = wb.getSheet("Sheet1");
		
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div/div[1]/div/div[1]/input")).sendKeys("c");
		Thread.sleep(2000);
		List <WebElement> count = driver.findElements(By.xpath("//*[starts-with(text(),'c')]"));
		int a = count.size();
		System.out.println(a);
		for(i=0;i<=a-1;i++)
		{
			
			s = count.get(i).getText();
			System.out.println(s);
			sh.createRow(i).createCell(0).setCellValue(s);
			
			
		}
		
	
		FileOutputStream out = new FileOutputStream("C:\\Users\\admin\\Documents\\Gsearch.xlsx");
		wb.write(out);
		out.flush();
		out.close();
		
		str = sh.getRow(2).getCell(0).getStringCellValue();
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.co.in");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div/div[1]/div/div[1]/input")).sendKeys(str);
		Thread.sleep(3000);
		driver.findElement(By.name("btnK")).click();
		System.out.println(driver.getTitle());
			
	}
	

	public static void main(String[] args) throws Exception, IOException  {
		// TODO Auto-generated method stub
		GoogleSearch gs= new GoogleSearch();
		gs.search();
		
		
		
		
	}
}
