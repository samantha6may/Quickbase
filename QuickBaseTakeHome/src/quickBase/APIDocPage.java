package quickBase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

	/****************************
	 * http://webdriver.io/api.html  (API Documentation web page)
	 */
public class APIDocPage {

	public static WebElement element = null;
	
	public static WebElement searchBox(WebDriver driver){
		
			element = driver.findElement(By.xpath("//section[@ class = 'inner searchbar']/input"));
		
		return element;
		
	}
	/*
	 * method returns search box element
	 */

	public static void clickSearchBox(WebDriver driver){
		element = searchBox(driver);
		element.click();
		
	}
	/*
	 * method clicks on search box element
	 */
	public static void fillSearch(WebDriver driver, String searchText){
		element = searchBox(driver);
		element.sendKeys(searchText);
	}
	
	/*
	 * Fills Search Tab
	 */
	public static boolean isElementPresent(WebDriver driver,By ByXPath){
	    try {
	    	element = driver.findElement(ByXPath);
	    	if(element.isDisplayed()){
	    		System.out.println("Element "+ ByXPath + "is displayed");
	    	}
	    	else if (!element.isDisplayed())
	    	{
	    		System.out.println("Element "+ ByXPath + "is not displayed");
	    	}
	        return true;
	    }
	    catch (org.openqa.selenium.NoSuchElementException e){
	    	
	        return false;
	    }
	    /*
	     * Checks if the element is displayed.
	     */
	}
}