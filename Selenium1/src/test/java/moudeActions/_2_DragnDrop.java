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

public class _2_DragnDrop {


	WebDriver driver ;
	@Before
	public void setup ()
	{
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
				
	}
	
	@Test
	public void dragndrop() throws InterruptedException
	{
		
	WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	
	driver.switchTo().frame(iframe);
	
	
	WebElement ele1 = driver.findElement(By.xpath("//div[@id='draggable']"));	
		
	WebElement ele2 = driver.findElement(By.xpath("//div[@id='droppable']"));
	
	Thread.sleep(2000);
	
	Actions act = new Actions(driver);
	
	act.clickAndHold(ele1).moveToElement(ele2).release(ele1).build().perform();
		
	Thread.sleep(2000);
		
	}
	

	@After
	public void tearDown()
	{
		
	 driver.quit();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
