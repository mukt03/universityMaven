package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page_uni {
@FindBy(xpath="//a[@id='dynamic-to-top']")
private WebElement toTop;
private WebDriver driver;
private JavascriptExecutor jvScrptExectr;
public Home_Page_uni(WebDriver driver) {
	PageFactory.initElements(driver, this);
	this.driver=driver;
	jvScrptExectr=(JavascriptExecutor)driver;
}
public boolean toTopisDisplayed() {
	jvScrptExectr.executeScript("window.scrollBy(0,600)");
	return(toTop.isDisplayed());
	
	
}

}