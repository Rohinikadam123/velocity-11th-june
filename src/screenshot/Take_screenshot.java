package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Take_screenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\s_w_driver\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.flipkart.com/");
		
		getScreenshot(driver1,"verifyUserLaunchWebsite");
		
		WebElement entermobile=driver1.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));
		entermobile.sendKeys("9822094763");
		WebElement password=driver1.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("Rohinikadam153@");
		WebElement login=driver1.findElement(By.xpath("(//button[@type='submit'])[2]"));
		login.click();
		getScreenshot(driver1,"verifyUserCanLogin");
	}
		public static void getScreenshot(WebDriver driver1, String testcaseName) throws IOException {
			TakesScreenshot k=(TakesScreenshot)driver1;
			File source = k.getScreenshotAs(OutputType.FILE);
			File destination = new File("F:\\screenshot2"+testcaseName+".png");
			FileHandler.copy(source,destination);
		}
		}

	


