package PracticePacage;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class messhooJunit {

WebDriver driver ; 
	
String textToBeSearchBox = "mobiles";
	
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
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		searchBox.sendKeys(textToBeSearchBox);
		
		Thread.sleep(2000);
		
		
		WebElement searchBtn = driver.findElement(By.xpath("//input[@type='submit'and @value='Go']"));
		searchBtn.click();
		
		Thread.sleep(2000);
		
    	WebElement comodityName = driver.findElement(By.xpath("//div/span[contains(text(),'\"mobiles\"')]"));
    	
    	Assert.assertEquals("\"mobiles\"",comodityName.getText() );
	
	}
	
	public void teardwon()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}




