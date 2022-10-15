package pkg1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childbrowser_popup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\s_w_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("realme");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
//		driver.findElement(By.xpath("//button[text()='"));
//		
		List<WebElement> productList=driver.findElements(By.xpath("//div[@class='_10UF8M _3LsR0e']"));
	System.out.println(productList.size());
		for(int i=0;i<3;i++) {
			productList.get(i).click();
			}
		String mainPageAddres=driver.getWindowHandle();
		System.out.println("main page address:"+mainPageAddres);
		Set<String>allAddresses=driver.getWindowHandles();
		List<String> allAddressList = new ArrayList<>(allAddresses);
		System.out.println("All page address:"+ allAddressList);
		for(int i=0;i<allAddressList.size();i++) {
			driver.switchTo().window(allAddressList.get(i));
			System.out.println(driver.getTitle());
			System.out.println();
		//	if(i==3) {
			//	driver.findElement(By.xpath);
			//}
		}
	}

}
