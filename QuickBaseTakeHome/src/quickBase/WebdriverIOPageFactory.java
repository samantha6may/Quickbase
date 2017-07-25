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
	 * http://webdriver.io (WebdriverIO web page)
	 */
public class WebdriverIOPageFactory {
	
	WebDriver driver;
	
	@FindBy(xpath="//a[@ href='/api.html']")
	WebElement apiLink;
	
	@FindBy(xpath="//nav[@ class='mainnav']/ul/li[2]/a")
	WebElement homeLink;
	
	public WebdriverIOPageFactory(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);  //initiates all the elements
	}
	
	public void clickAPILink(){
			apiLink.click();
	}
	//clicks on the APILink
	
}
	
