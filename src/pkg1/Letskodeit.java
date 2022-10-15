package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Letskodeit {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\s_w_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//driver.get("https://www.flipkart.com/");
		driver.get("https://courses.letskodeit.com/practice");
		driver.manage().window().maximize();
		
		WebElement bmwRadioBtn=driver.findElement(By.xpath("//input[@id='bmwradio']"));
		bmwRadioBtn.click();
		WebElement inputField=driver.findElement(By.xpath("(//input[@id='name'])[1]"));
		inputField.sendKeys("velocity class");
		// getText method
		WebElement text = driver.findElement(By.xpath("//h1[text()='Practice Page']"));
		System.out.println(text.getText());
		//multipletext from child
		WebElement multipleText=driver.findElement(By.xpath("(//fieldset)[1]"));
		System.out.println(multipleText.getText());
		WebElement getAttribute=driver.findElement(By.xpath("//input[@id='bmwradio']"));
		System.out.println(getAttribute.getAttribute("type"));
		
		System.out.println(bmwRadioBtn.isSelected());
		WebElement benzRadioBtn = driver.findElement(By.xpath("//input[@id='benzradio']"));
		System.out.println(benzRadioBtn.isSelected());
		// is enabled
		WebElement inputFieldForEnabled = driver.findElement((By.xpath("//input[@id='enabled-button']")));
		System.out.println("input field is:"+inputFieldForEnabled.isEnabled());
		WebElement dBtn = driver.findElement(By.xpath("//input[@id='disabled-button']"));
		dBtn.click();
		System.out.println("Input field is:"+ inputFieldForEnabled.isEnabled());
		//is selected method 
		//System.out.println(bmwRadioBtn.isSelected());
		//WebElement benzRadioBtn=driver.findElement(null);
		
		

	}

}
