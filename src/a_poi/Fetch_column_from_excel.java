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

public class Fetch_column_from_excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\s_w_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		//String expectedData=driver.getTitle();
		FileInputStream file=new FileInputStream("F:\\Book3.xlsx");
		Workbook work=WorkbookFactory.create(file);
		Sheet sheet = work.getSheet("Sheet1");
		
		int lastRowNumber = sheet.getLastRowNum();
		System.out.println(lastRowNumber);
		String data="";
		for(int i=0;i<=lastRowNumber;i++) {
			Row row = sheet.getRow(i);
			Cell cell = null;
			try {
				cell=row.getCell(0);
				try {
					data=cell.getStringCellValue();
					}
				catch(Exception e) {
					data=String.valueOf(cell.getNumericCellValue());
				}	
				}
				catch(Exception e) {
			System.out.println("cell is null");
			}}
			System.out.println(data);
		}
	}

	



