package dropDownValues;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class _1_SelectClassDropDown {
	
	
	WebDriver driver;
	@Before
	public void setup ()
	
	{
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	    driver.get("https://www.facebook.com/");
						
		
	}
	
	@Test
	public void dropDownSelect() throws InterruptedException
	{
		
	WebElement accountCreateBtn = driver.findElement(By.xpath("//a[text()='Create New Account']"));
	
	accountCreateBtn.click();
	
	WebElement birthDayDropDwn = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	
	WebElement bMonthDropDwn = driver.findElement(By.xpath("//select[@id='month']"));
	
	WebElement bYerDropDwn = driver.findElement(By.xpath("//select[@name='birthday_year']"));
	
	Thread.sleep(2000);
	
	Select DayDropDwn = new Select(birthDayDropDwn);
  //  DayDropDwn.selectByVisibleText("25");
    DayDropDwn.selectByValue("25");
    
    Thread.sleep(2000);
    
	Select MonthDropDwn = new Select(bMonthDropDwn);
	// DayDropDwn.selectByVisibleText("Jan");
	MonthDropDwn.selectByValue("1");
	
	Thread.sleep(2000);
	
	Select YearDropDwon = new  Select (bYerDropDwn) ;
	//YearDropDwon.selectByVisibleText("1996"); 
	YearDropDwon.selectByValue("1996");
			
	Thread.sleep(2000);
	
	}

 	@After
   	public void tearDown()
   	{
   		
   	 driver.quit();
   		
   	}
   	
		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


