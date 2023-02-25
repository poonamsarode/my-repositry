package captureScreenShot.screenshots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FilenameUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _1_CapScreenShot {

	 private static final String FileUtils = null;

    WebDriver driver ;
	
	WebDriverWait Wait;
	
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
	}
	
	@Test
	public void tc_1_()
	{
	
		WebElement searchBox  = driver.findElement(By.xpath("//input[@name='q']"));
		 searchBox  .sendKeys("selenium");
		 
		 WebElement searchBtn  = driver.findElement(By.xpath("(//input[@name='btnK'])[1]"));
		 searchBtn.click();

		 Wait.until(ExpectedConditions.titleContains("Selenium"));
		//capture the page ScreenShot
		
		screenshotscapt(driver, "seleniumSearchResult");
			
	}
	
	
	@Test
	public void tc_2_()
	{
		
		WebElement searchBox  = driver.findElement(By.xpath("//input[@name='q']"));
		 searchBox  .sendKeys("Appium");
		 
		 WebElement searchBtn  = driver.findElement(By.xpath("(//input[@name='btnK'])[1]"));
		 searchBtn.click();

		 Wait.until(ExpectedConditions.titleContains("Appium"));
		//capture the page ScreenShot
		
		screenshotscapt(driver, "AppiumSearchResult");
			
	}
	

	
	@After
	public void tearDown()
	{
		
	 driver.quit();
		
	}

	public static void screenshotscapt(WebDriver Driver,String filenameToBe) 
	{
		
	      File file =((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
		  
	    try {
			org.apache.commons.io.FileUtils.copyFile(file, new File("C:\\Users\\Dell\\eclipse-workspace\\Demoproject\\Selenium1\\src\\test\\java\\captureScreenShot\\screenshots\\"+filenameToBe+".jpg"));
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	    
	      
	      
	      
	      
	      
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
}	
	

