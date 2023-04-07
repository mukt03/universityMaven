package browserSetUP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base {
	WebDriver driver;
	public WebDriver openBrowser(String browserName) {
		
		if (browserName.equals("Chrome")) {
			//driver=openChromeBrowser();
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUKTA\\Documents\\velocity testing12 nov\\Selenium\\selenium installation\\chromedriver_win32\\chromedriver.exe");
			driver =new ChromeDriver();
			}
			if (browserName.equals("Edge")) {
				//driver=openEdgeBrowser();
				System.setProperty("webdriver.edge.driver", "C:\\Users\\MUKTA\\Documents\\velocity testing12 nov\\Selenium\\selenium installation\\edgedriver_win64\\msedgedriver.exe");
				driver =new EdgeDriver();
				}
		return driver;
	}	
//	public static WebDriver openChromeBrowser() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUKTA\\Documents\\velocity testing12 nov\\Selenium\\selenium installation\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver =new ChromeDriver();
//		return driver;
//	}
//	public static WebDriver openEdgeBrowser() {
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\MUKTA\\Documents\\velocity testing12 nov\\Selenium\\selenium installation\\edgedriver_win64\\msedgedriver.exe");
//		WebDriver driver =new EdgeDriver();
//		return driver;
//	}
}

