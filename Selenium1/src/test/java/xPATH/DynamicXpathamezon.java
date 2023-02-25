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

public class DynamicXpathamezon {
	
	
	WebDriver driver ;
	
	String Searchtext = "Kurti";
	String ClickText = "Kurti palazzo";
	
	@Before
	public void setup ()
	{
		
	   driver = new ChromeDriver ();
	   driver.manage().window().maximize();
	   driver.manage().deleteAllCookies();
	   driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	   driver.get("https://www.meesho.com/");   			
		
	}
	@Test
	public void searchProdct () throws InterruptedException
	{
		WebElement Searchtext = driver.findElement(By.xpath("//input[@type='text']"));
		
		Searchtext.sendKeys("Kurti");
		
		
		Thread.sleep(2000);
		
	
		
		List <WebElement> searchList = driver.findElements(By.xpath("//div[class='search-results']//div[class='search-results']//p[class='sc-dkrFOg eNGmxU sc-lbVpMG fUgglx sc-lbVpMG fUgglx']"));
		
		System.out.println("The search list count is : " + searchList.size());
		
		{
		for (int i=0; i<searchList.size(); i++);
		
		{
	
	System.out.println(searchList.get(2).getText());
	
		}

		}		
			
			
			
		if(searchList.get(5).getText().equals("kurti"));
	
	
	
	
	
		
		searchList.get(2).click();
			
		
		
		
		}
	
	
	
	@After
	
	
	public void tearDwon ()
	
	 {
		driver.quit();
						
	   }
	
	

	
	
	
	
	
	

}
