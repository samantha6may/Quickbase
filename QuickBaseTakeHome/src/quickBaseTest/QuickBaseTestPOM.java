package quickBaseTest;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import quickBase.APIDocPage;

public class QuickBaseTestPOM {
	WebDriver driver; 
	String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver(); 
		baseUrl = "http://webdriver.io";//assigned baseUrl to http://webdriver.io (WebdriverIO website)  
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //implicit wait time 10 seconds
		driver.manage().window().maximize();// maximizes the window
		driver.get(baseUrl);//opens the baseUrl on the browser
	}

	
	@Test
	public void test1() {
		quickBase.WebdriverIOPage.clickAPILink(driver); 
		/*
		 * Loads API documentation (http://webdriver.io/api.html_)	
		 */
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		quickBase.APIDocPage.clickSearchBox(driver);
		/*
		 * clicks the search box
		 */
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		quickBase.APIDocPage.fillSearch(driver, "click");
		/*
		 * searches with "click"
		 */
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		assertTrue(APIDocPage.isElementPresent(driver, By.xpath("//a[@ href = '/api/action/click.html']")));  
		/*
		 * verifies if click element is present and prints the result.
		 */
		assertTrue(APIDocPage.isElementPresent(driver, By.xpath("//a[@ href = '/api/action/doubleClick.html']")));
		/*
		 * verifies if doubleClick element is present and prints the result.
		 */
		assertTrue(APIDocPage.isElementPresent(driver, By.xpath("//a[@ href = '/api/action/leftClick.html']")));
		/*
		 * verifies if leftClick element is present and prints the result.
		 */
		assertTrue(APIDocPage.isElementPresent(driver, By.xpath("//a[@ href = '/api/action/middleClick.html']")));
		/*
		 * verifies if middleClick element is present and prints the result.
		 */
		assertTrue(APIDocPage.isElementPresent(driver, By.xpath("//a[@ href = '/api/action/rightClick.html']")));
		/*
		 * verifies if rightClick element is present and prints the result.
		 */
//		assertTrue(APIDocPage.isElementPresent(driver, By.xpath("//a[@ href = '/api/action/dragAndDrop.html']")));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		
	}
	
	@Test
	public void test2() {
		quickBase.WebdriverIOPage.clickAPILink(driver); 
		/*
		 * Loads API documentation (http://webdriver.io/api.html_)	
		 */
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		quickBase.APIDocPage.clickSearchBox(driver);
		/*
		 * clicks the search box
		 */
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		quickBase.APIDocPage.fillSearch(driver, "select");
		/*
		 * searches with "select"
		 */
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		assertTrue(APIDocPage.isElementPresent(driver, By.xpath("//a[@ href = '/api/action/selectByAttribute.html']")));  
		/*
		 * verifies if selectByAttribute element is present and prints the result.
		 */
		assertTrue(APIDocPage.isElementPresent(driver, By.xpath("//a[@ href = '/api/action/selectByIndex.html']")));
		/*
		 * verifies if selectByIndex element is present and prints the result.
		 */
		assertTrue(APIDocPage.isElementPresent(driver, By.xpath("//a[@ href = '/api/action/selectByValue.html']")));
		/*
		 * verifies if selectByValue element is present and prints the result.
		 */
		assertTrue(APIDocPage.isElementPresent(driver, By.xpath("//a[@ href = '/api/action/selectByVisibleText.html']")));
		/*
		 * verifies if selectByVisibleText element is present and prints the result.
		 */
		assertTrue(APIDocPage.isElementPresent(driver, By.xpath("//a[@ href = '/api/action/selectorExecute.html']")));
		/*
		 * verifies if selectorExecute element is present and prints the result.
		 */
		assertTrue(APIDocPage.isElementPresent(driver, By.xpath("//a[@ href = '/api/action/selectorExecuteAsync.html']")));
		/*
		 * verifies if selectorExecuteAsync element is present and prints the result.
		 */
//		assertTrue(APIDocPage.isElementPresent(driver, By.xpath("//a[@ href = '/api/action/dragAndDrop.html']")));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit(); //quits the browser
	}

}
