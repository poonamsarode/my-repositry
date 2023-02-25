package fileUploadAndUI;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {

	WebDriver driver ;
	
	@Before
	public void setup ()
	{
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().deleteAllCookies();
	   driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	   driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");	
		
	}
	
	@Test
	public void fileUpload () throws InterruptedException
	{
		
		WebElement chooseFileBtn  = driver.findElement(By.xpath("//input[@type='file']"));
		 
		chooseFileBtn  .sendKeys("C:\\Users\\Dell\\eclipse-workspace\\Demoproject");
	
        Thread.sleep(2000);
		
		WebElement pressBtn  = driver.findElement(By.xpath("//input[@type='submit']"));
		pressBtn .click();
		
		 Thread.sleep(2000);
			
	}
	
	
	@After
   	public void tearDown()
   	{
   		
   	 driver.quit();
   		
   	}
	
	
	
	
	
	
	
	
}
