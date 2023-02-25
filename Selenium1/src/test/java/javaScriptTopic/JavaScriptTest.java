package javaScriptTopic;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScriptTest {

		
	 WebDriver driver ;
		
		WebDriverWait Wait;
		JavaScriptUtilits javaScriptUtilits;
		String URL = "https://www.google.com/";
		
		@Before
		public void setup ()
		{
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
			driver.get(URL);
			Wait = new WebDriverWait(driver,15);
			javaScriptUtilits = new JavaScriptUtilits(driver);
		}
		
		@Test
		public void tc_2_()
		{
			
			WebElement searchBox  = driver.findElement(By.xpath("//input[@name='q']"));
			javaScriptUtilits.drawBorder(searchBox);
			 searchBox  .sendKeys("Appium");
			 
			 WebElement searchBtn  = driver.findElement(By.xpath("(//input[@name='btnK'])[1]"));
			 searchBtn.click();

			 Wait.until(ExpectedConditions.titleContains("Appium"));
			//capture the page ScreenShot
			
			
		}
		

		@After
	   	public void tearDown()
	   	{
	   		
	   	 driver.quit();
	   		
	   	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
}
