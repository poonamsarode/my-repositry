package moudeActions;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {
	


		WebDriver driver ;
		
		@Before
		public void setup ()
		{
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		    driver.get("https://demo.guru99.com/test/simple_context_menu.html");
					
		}
		
		@Test
		public void rightclik() throws InterruptedException
		{
			
		WebElement rightClicEle = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Thread.sleep(2000);
		
       Actions act = new Actions (driver);
       
       act.contextClick(rightClicEle).build().perform();
       
       Thread.sleep(2000);
	
		}
	
		@Test
		public void doubbleClick() throws InterruptedException
		{
			
		WebElement doubbleClikEle = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		Thread.sleep(2000);
		
       Actions act = new Actions (driver);
       
       act.doubleClick(doubbleClikEle).build().perform();
       
       Thread.sleep(2000);
	
		}
	

   	@After
   	public void tearDown()
   	{
   		
   	 driver.quit();
   		
   	}
   	
		}
		
	

	
	
	


