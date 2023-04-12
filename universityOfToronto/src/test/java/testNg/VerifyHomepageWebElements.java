package testNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import browserSetUP.Base;

import page.Home_Page_uni;



public class VerifyHomepageWebElements extends Base{
	WebDriver driver;
	Home_Page_uni homePage;
	SoftAssert asser;
	Base base;
	@Parameters("browser")
	@BeforeTest
	public void openBrowserlauch(String browserName) {
		System.out.println("Before Test");
       base=new Base();
		driver=base.openBrowser(browserName);
//		if (browserName.equals("Chrome")) {
//			driver=openEdgeBrowser();
//			}
//			if (browserName.equals("Edge")) {
//				driver=openEdgeBrowser();
//				}
		driver.get("https://slp.utoronto.ca/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@BeforeClass
	public void pomPageLaunch() {
		homePage=new Home_Page_uni(driver);
	}
	@Test
	public void verifyToTopisDisplayed() {
		
		boolean ToTopDisplayDecision=homePage.toTopisDisplayed();
		asser= new SoftAssert();
		asser.assertEquals(ToTopDisplayDecision, true, "To Top button not dispalyed after scrolling down");
        asser.assertAll();
	}
	@Test
	public void verify() {
		
		boolean ToTopDisplayDecision=homePage.toTopisDisplayed();
		asser= new SoftAssert();
		asser.assertEquals(ToTopDisplayDecision, true, "To Top button not dispalyed after scrolling down");
        asser.assertAll();
	}
	@AfterClass
	public void objectClear() {
		homePage=null;
		
	}
	@AfterTest
	public void closeBrowser() {
		driver.close();
		driver=null;
		System.gc();
	}
}
