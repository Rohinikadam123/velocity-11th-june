package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mouse_action {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\s_w_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
	//	Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(50,1200)");
	//	Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-500)");
		WebElement aboutUs=driver.findElement(By.xpath("//a [text()='About Us']"));
		try {
			aboutUs.click();
		}catch(Exception e) {
			js.executeScript("arguments[0].scrollIntoView(true);", aboutUs);
			//Thread.sleep(2000);
			aboutUs.click();
		}


	}

}
