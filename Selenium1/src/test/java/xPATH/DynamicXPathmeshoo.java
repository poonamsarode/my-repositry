package xPATH;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXPathmeshoo {
	
	WebDriver driver ;
	
	String SearchBoxText = "titan";
	String ClickOnText = "titan watches for women";
	
	@Before
	public void setup ()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");		
		
   	}
	
	@Test
	public void search () throws InterruptedException
	{
		
		WebElement SearchBoxText = driver.findElement(By.xpath("//input[@type='text']"));
		
 	SearchBoxText.sendKeys("titan");
		
		
	Thread.sleep(3000);	
		
	
	List <WebElement> ClickOnText = driver.findElements(By.xpath("//div[@class='autocomplete-results-container']//div[@class='s-suggestion-container']"));
	
	System.out.println("The searched list count is : " + ClickOnText.size());
	
	for (int i=10; i<ClickOnText.size(); i++)
	{
	
	//	if(ClickOnText.get(i).getText().equals("puma jacket"))
	//	{
	//		ClickOnText.get(i).click();
			
	//	}
			
	}
		
	}
	
	@After

	public void tearDwon ()
	
	{
		
		driver.quit();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
