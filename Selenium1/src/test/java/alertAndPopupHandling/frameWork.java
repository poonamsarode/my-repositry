package alertAndPopupHandling;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameWork {

	
WebDriver driver;
	
	@Before
	public void setup ()
	
	{
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	    driver.get("https://demo.automationtesting.in/Frames.html");
						
		
	}
	
	@Test
	public void frameWorkHandling() throws InterruptedException
	{
	
		WebElement frameEle = driver.findElement(By.xpath("//iframe[@name='SingleFrame']"));
	
		driver.switchTo().frame(frameEle);
	
		
		WebElement textBox = driver.findElement(By.xpath("//input[@type='text']"));
	
		textBox.sendKeys("test test test");
	
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		WebElement pageHeader = driver.findElement(By.xpath("//h1[text()='Automation Demo Site ']"));
		System.out.println(pageHeader.getText());
		
}

	@After
   	public void tearDown()
   	{
   		
   	 driver.quit();
   		
   	}
	
}	
	
	
	
	
	
	
	
	
	
	