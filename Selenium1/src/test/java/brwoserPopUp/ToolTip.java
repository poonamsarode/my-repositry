package brwoserPopUp;

import java.util.Iterator;
import java.util.Set;
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

public class ToolTip {

WebDriver driver;
	
	@Before
	public void setup ()
	
	{
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	    driver.get("https://demoqa.com/tool-tips");
						
		
	}

	@Test
	public void ToolTip() throws InterruptedException
	{
		WebElement hoverMetoSeeBtn = driver.findElement(By.xpath("//button[@id='toolTipButton']"));
		Actions act = new Actions(driver);
        act.moveToElement(hoverMetoSeeBtn).build().perform();
		
		WebElement toolTipEle = driver.findElement(By.xpath("//div[@class='tooltip-inner']"));
		System.out.println(toolTipEle.getText());
		
		Assert.assertEquals("You hovered over the Button",toolTipEle.getText() );
		
	}
	
	@Test
	public void ToolTip_2() throws InterruptedException
	{
		WebElement hoverMetoSeeBox = driver.findElement(By.xpath("//input[@id='toolTipTextField']"));
		Actions act = new Actions(driver);
        act.moveToElement( hoverMetoSeeBox).build().perform();
		
		WebElement toolTipEle = driver.findElement(By.xpath("//div[@class='tooltip-inner']"));
		System.out.println(toolTipEle.getText());
		
		Assert.assertEquals("You hovered over the text field",toolTipEle.getText() );
		
	}
	
	
	@After
   	public void tearDown()
   	{
   		
   	 driver.quit();
   		
   	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
