import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _0_XpathJunit {
	
	WebDriver driver ; 
	
	@Before
	public void setup()
	{

    driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);	
	driver.get("https://www.amazon.com/");
	
	}
	
	@Test
	public void validateTitle ()
	{
		
	  String actualTitle = driver.getTitle();	
	  Assert.assertEquals("Amazon.com. Spend less. Smile more.", actualTitle );
	  	  	   
	}
	
	@Test
	public void search () throws InterruptedException
	{
		
		WebElement searchBox = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input"));
		
		searchBox.sendKeys("iphone");
		
		Thread.sleep(2000);
		
		
		WebElement searchBtn = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form"));
		searchBtn.click();
		
		Thread.sleep(2000);
		
    	WebElement comodityName = driver.findElement(By.xpath("//div/span[contains(text(),'iphone')][1]"));
    	
    	Assert.assertEquals("\"iphone\"",comodityName.getText() );
    	
    	
    	
	 //  	String resultText = comodityName.getText();
	   	 	
		//System.out.println(resultText);
		
	   	
		
	//	if (resultText.contains("iphone")) 
	//	{
			//Assert.assertTrue(true);
    //   	}
		
		//else 
		//{
			//Assert.fail();
	//	}
	}
		
	
	@After
	public void tearDwon()
	
	{
		
		driver.quit();
		
	}
	
	
	

	
	
}
