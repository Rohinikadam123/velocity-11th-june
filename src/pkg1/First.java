package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "F:\\s_w_driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.flipkart.com/");
WebElement entermobile=driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));
entermobile.sendKeys("9822094763");
WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
password.sendKeys("Rohinikadam153@");
WebElement login=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
login.click();
}
}
