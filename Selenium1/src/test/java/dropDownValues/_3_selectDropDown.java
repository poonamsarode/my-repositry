package dropDownValues;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _3_selectDropDown {

	
	WebDriver driver;
	@Before
	public void setup ()
	
	{
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	    driver.get("https://demo.automationtesting.in/Register.html");
						
		
	}
	
	@Test
	public void dropDownSelect() throws InterruptedException
	{
		
	
//	WebElement yearDropDwn = driver.findElement(By.xpath("//select[@placeholder='Year']"));
	
//	WebElement bMonthDropDwn = driver.findElement(By.xpath("//select[@placeholder='Month']"));
	
//	WebElement DayDropDwn = driver.findElement(By.xpath("//select[@placeholder='Day']"));
	
//	Thread.sleep(2000);
	
//	Select year = new Select(yearDropDwn);
//	year.selectByVisibleText("1996");
	
//	Select month = new Select (bMonthDropDwn);
//	month.selectByVisibleText("January");
	
//	Select Day = new Select( DayDropDwn);
//	 Day.selectByVisibleText("25");
	

//		List <WebElement> optionMonthEle = driver.findElements(By.xpath("//select[@placeholder='Month']//option"));
		
//		for(int i=0; i<optionMonthEle.size(); i++)
//		{
//			System.out.println( optionMonthEle.get(i).getText());
			
		Thread.sleep(2000);
		}
	
	
	@After
   	public void tearDown()
   	{
   		
   	 driver.quit();
   		
   	}
	
	
	
	
	
	
	
	
}
