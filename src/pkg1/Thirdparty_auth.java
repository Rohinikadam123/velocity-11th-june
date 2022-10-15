package pkg1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Thirdparty_auth {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\s_w_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//i[@id='i-icon-profile']")).click();
		driver.findElement(By.xpath("//li[@id='signInLink']")).click();
		driver.findElement(By.xpath("//span[text()='Sign in with Google']")).click();
	Set<String> windowSet= driver.getWindowHandles();
	List<String> windowList=new ArrayList<>(windowSet);
	driver.switchTo().window(windowList.get(1));
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("rkadam153@gmail.com");
	}

}
