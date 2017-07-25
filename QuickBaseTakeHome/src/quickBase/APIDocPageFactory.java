package quickBase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	/****************************
	 * http://webdriver.io/api.html  (API Documentation web page)
	 */
public class APIDocPageFactory {
	
	WebDriver driver;
	
	@FindBy(xpath="//section[@ class = 'inner searchbar']/input")
	WebElement searchBox;
	
	@FindBy(xpath="//section [@ class = 'content']//a [@ class = 'icon icon-remove']")
	WebElement removeIcon;
	
	@FindBy (xpath="//a[@ href = '/api/action/click.html']")
	public WebElement click;
	
	@FindBy (xpath="//a[@ href = '/api/action/doubleClick.html']")
	public WebElement doubleClick;
	
	@FindBy (xpath="//a[@ href = '/api/action/leftClick.html']")
	public WebElement leftClick;
	
	@FindBy (xpath="//a[@ href = '/api/action/middleClick.html']")
	public WebElement middleClick;
	
	@FindBy (xpath="//a[@ href = '/api/action/rightClick.html']")
	public WebElement rightClick;
	
	@FindBy (xpath="//a[@ href = '/api/action/selectByAttribute.html']")  
	public WebElement selectByAttribute;
	
	@FindBy (xpath="//a[@ href = '/api/action/selectByIndex.html']")
	public WebElement selectByIndex;
	
	@FindBy (xpath="//a[@ href = '/api/action/selectByValue.html']")
	public WebElement selectByValue;
	
	@FindBy (xpath="//a[@ href = '/api/action/selectByVisibleText.html']")
	public WebElement selectByVisibleText;
	
	@FindBy (xpath="//a[@ href = '/api/action/selectorExecute.html']")
	public WebElement selectorExecute;

	@FindBy (xpath="//a[@ href = '/api/action/selectorExecuteAsync.html']")
	public WebElement selectorExecuteAsync;
	
	
	public APIDocPageFactory(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);  //initiates all the elements
	}
	
	public void clickSearchBox(){
		searchBox.click();
	}
	//clicks on Search Box
	
	public void fillSearch(String keyword){
		searchBox.sendKeys(keyword);
	}
	//Enters Search text in Search Box
	
	public String getSearchText(){
		return searchBox.getAttribute("value");
	}
	//Gets the value inside the Search Box
	
	public void clickRemoveSearch(){
		removeIcon.click();
	}
	//Clicks on the remove search button (cross present on the right corner of search box) to clear search box
	
	public boolean isElementPresent (WebElement elementName){
		try{
			if (elementName.isDisplayed())
			{
				System.out.println("Element "+ elementName +" is displayed");
			}
			else {
				System.out.println("Element "+ elementName +" is not displayed");
			}
			 return true;
		}
		catch (org.openqa.selenium.NoSuchElementException e){
			 return false;
		}
	}
	//Verifies if the element is displayed after performing a search
	

	}
