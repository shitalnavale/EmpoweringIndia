package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*Returns required browser instance*/
public class BrowserManager 
{

private static WebDriver driver;
	
	public static WebDriver getBrowser(String string) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Set Up\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
}
