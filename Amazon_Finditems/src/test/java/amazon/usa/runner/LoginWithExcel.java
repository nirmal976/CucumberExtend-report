package amazon.usa.runner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginWithExcel {
	@Test
	public void PassingDataFromExcel() throws IOException {
	
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='Hello, Sign in']")).click();
		
		
		
		ArrayList<String> userName= readExcelData(0);
		for(int i = 0;i<userName.size();i++) {
			
		
		
		driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys();
		driver.findElement(By.xpath("(//*[@id='continue'])[2]")).click();
		driver.findElement(By.xpath("//*[@id='ap_password']")).sendKeys("Kanchijully1971");
		driver.findElement(By.xpath("//*[@id='signInSubmit']")).click();
		driver.quit();
		
		
}
	
	public ArrayList<String>readExcelData()) throws IOException{
		FileInputStream file = new FileInputStream("./TestData/Test Daa.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file );
		
		XSSFSheet sheet = workbook.getSheet("data");
		Iterator<Row> rowiterator =sheet.iterator();
		rowiterator.next();
		ArrayList <String> list = new ArrayList<>();
		while(rowiterator.hasNext()) {
			list.add(rowiterator.next().getCell(1).getStringCellValue());
		}
	System.out.println("List of Data : "+ list);
		return null;
	}
	
	
}}
