package baseclass;



	import java.time.Duration;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterTest;

	public class BaseClass1 {
		
		static WebDriver driver;

		public static WebDriver getDriver(String browser) {
			
			
			if(driver == null) {
				
				if(browser.equals("chrome")) {
					System.setProperty("webdriver.chrome.driver", "F:\\s_w_driver\\chromedriver.exe");
					WebDriver driver = new ChromeDriver();}
//				else {
//					System.setProperty("webdriver.gecko.driver", "D:\\Forst folder\\geckodriver.exe");
//					driver = new FirefoxDriver();
//				}
			
				driver.get("https://www.flipkart.com/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					
				
			}	
			return driver;
		}
		
		
		public static void unloadDriver() {
			driver = null;
		}
		


	}



