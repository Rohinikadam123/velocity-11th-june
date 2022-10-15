package a_poi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_dataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\s_w_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		//String expectedData=driver.getTitle();
		FileInputStream file=new FileInputStream("F:\\Book2.xlsx");
		Workbook work=WorkbookFactory.create(file);
		Sheet sheet = work.getSheet("Sheet1");
		
		Row row=sheet.getRow(0);
		Cell cell=row.getCell(0);
		String expectedData = cell.getStringCellValue();
		System.out.println(expectedData);
	}

}
