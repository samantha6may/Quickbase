package quickBase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

	/****************************
	 * http://webdriver.io (WebdriverIO web page)
	 */
public class WebdriverIOPage {
	
	public static WebElement element = null;
	
	public static WebElement APILink(WebDriver driver){
		element = driver.findElement(By.xpath("//a[@ href='/api.html']"));
	return element;
	}
	/*
	 * this method returns APILink Element
	 */

	public static void clickAPILink(WebDriver driver){
		element = APILink(driver);
		element.click();
		
	}
	
	/*
	 * this method clicks on APILink
	 */

}
	
