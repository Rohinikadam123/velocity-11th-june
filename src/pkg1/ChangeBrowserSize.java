package pkg1;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChangeBrowserSize {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\s_w_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		int x=driver.manage().window().getSize().getWidth();
	int y=driver.manage().window().getSize().getWidth();
	
	System.out.println("width is:"+"height is:"+y);
	// x=1000px
	//y==500px
	Dimension p=new Dimension(1000,500);
	driver.manage().window().setSize(p);
	 
	int x1=driver.manage().window().getSize().getWidth(); //x axis
	int y1=driver.manage().window().getSize().getHeight();
	
	System.out.println("new width is:"+x1+"new height is:"+y1);
	}

}
