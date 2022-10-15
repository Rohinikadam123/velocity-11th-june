package pkg1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Normal_auth {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\s_w_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url=("https://the-internet.herokuapp.com/basic_auth");
		String userName="admin";
		String password="admin";
		String newUrl1="https://"+userName+":"+password+"@the-internet.herokuapp.com/basic_auth";
		driver.get(newUrl1);
		

	}

}
