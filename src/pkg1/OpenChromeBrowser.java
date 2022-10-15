package pkg1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "F:\\s_w_driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.get("https://www.flipkart.com/");
driver.navigate().refresh();
driver.navigate().to("https://www.redbus.in/");
driver.navigate().back();
driver.navigate().forward()	;

	String title = driver.getTitle();
	System.out.println(title);
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	
	driver.manage().window().maximize();
	driver.manage().window().minimize();
	
	driver.close();
	driver.quit();
	}

}
