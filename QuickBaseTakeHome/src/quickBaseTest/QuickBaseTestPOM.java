package quickBaseTest;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import quickBase.APIDocPageFactory;
import quickBase.WebdriverIOPageFactory;

public class QuickBaseTestPOM {
	private WebDriver driver; 
	private String baseUrl;
	APIDocPageFactory APIDocPage;
	WebdriverIOPageFactory WebdriverIOPage;
	
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver(); 
		baseUrl = "http://webdriver.io";//assigned baseUrl to http://webdriver.io (WebdriverIO website)  
		APIDocPage = new APIDocPageFactory(driver);
		WebdriverIOPage = new WebdriverIOPageFactory (driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //implicit wait time 10 seconds
		driver.manage().window().maximize();// maximizes the window
		driver.get(baseUrl);//opens the baseUrl on the browser
	}
	/*
	 * Runs before every Test Case
	 */
	
	@Test
	public void test1() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		WebdriverIOPage.clickAPILink();
		APIDocPage.clickSearchBox();
		APIDocPage.fillSearch("click");
		assertTrue(APIDocPage.isElementPresent(APIDocPage.click));
		assertTrue(APIDocPage.isElementPresent(APIDocPage.doubleClick));
		assertTrue(APIDocPage.isElementPresent(APIDocPage.leftClick));
		assertTrue(APIDocPage.isElementPresent(APIDocPage.middleClick));
		assertTrue(APIDocPage.isElementPresent(APIDocPage.rightClick));
		APIDocPage.clickRemoveSearch();
	}
	/*
	 * Test Case 1: Verifies that the 5 action results are returned and displayed for the text 'click'
	 *(click, doubleClick, leftClick, middleClick, rightClick)
	 */
	
	
	@Test
	public void test2() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		WebdriverIOPage.clickAPILink();
		APIDocPage.clickSearchBox();
		APIDocPage.fillSearch("select");
		assertTrue(APIDocPage.isElementPresent(APIDocPage.selectByVisibleText));
		assertTrue(APIDocPage.isElementPresent(APIDocPage.selectByValue));
		assertTrue(APIDocPage.isElementPresent(APIDocPage.selectByIndex));
		assertTrue(APIDocPage.isElementPresent(APIDocPage.selectByAttribute));
		assertTrue(APIDocPage.isElementPresent(APIDocPage.selectorExecute));
		assertTrue(APIDocPage.isElementPresent(APIDocPage.selectorExecuteAsync));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		APIDocPage.clickRemoveSearch();
	}
	/*
	 * Test Case 2: Verifies that the 6 action results are returned and displayed for the text 'select'
	 *(selectByVisibleText, selectByValue, selectByIndex, selectByAttribute, selectorExecute, selectorExecuteAsync)
	 */
	
		
	@Test
	public void test3() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		WebdriverIOPage.clickAPILink();
		APIDocPage.clickSearchBox();
		String urlBeforeEvent = driver.getCurrentUrl();
		APIDocPage.fillSearch("add");
		String urlAfterEvent = driver.getCurrentUrl();
		assertEquals(urlBeforeEvent, urlAfterEvent);
	}
	/*
	 * Test Case 3: Verifies that the page URL has not changed after a search event.
	 */
	
	
	@Test
	public void test4() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		WebdriverIOPage.clickAPILink();
		APIDocPage.clickSearchBox();
		String urlBeforeEvent = driver.getCurrentUrl();
		APIDocPage.fillSearch("xyz");
		APIDocPage.clickRemoveSearch();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		assertEquals(APIDocPage.getSearchText(),"");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	/*
	 * Test Case 4: Verifies if the remove search button (cross on the right hand side of the search bar) 
	 * is clearing searched text from the search field.
	 */
		
	
	@After
	public void tearDown() throws Exception {
		driver.quit(); //quits the browser
	}
	/*
	 * Runs after every Test Case
	 */

}
