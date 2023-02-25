package fileUploadAndUI;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class _2_dimentionClass {

	
	WebDriver driver ;
	
		@Before
		public void setup ()
		{
		   Dimension d = new Dimension(490, 700);      //create dimension object 
		   driver = new ChromeDriver();
		   driver.manage().window().setSize(d);   // set window size  
		   driver.manage().deleteAllCookies();
		   driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		   driver.get("https://www.facebook.com/");	
		  
		}
		@Test
		public void dimentionClass () throws InterruptedException
		{
			// objectRef.rgbaTaHexVal(rgbaValue);
			
			System.out.println("facebok is invoked ");
			
		}
			

		@After
	   	public void tearDown()
	   	{
	   		
	   	 driver.quit();
	   		
	   	}
		

}
	
	
	
	

