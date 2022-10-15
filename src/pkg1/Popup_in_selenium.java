package pkg1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_in_selenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\s_w_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
driver.get("https://demoqa.com/alerts");
driver.manage().window().maximize();

	driver.findElement(By.xpath("//button[@id='promtButton']")).click();	
	Alert alert = driver.switchTo().alert();	
	//Thread.sleep(2000);	
	System.out.println(alert.getText());
//	Thread.sleep(2000);	
	alert.sendKeys("rannvijay");
	Thread.sleep(2000);	
	alert.accept();
	//alert.dismiss();	
	}

	}
