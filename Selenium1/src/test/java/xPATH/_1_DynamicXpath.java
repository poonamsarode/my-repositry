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

public class _1_DynamicXpath {

	
WebDriver driver ;

String textToBeSearch = "pepe";
String textToBeclick = "Pepe Jeans Sweatshirt";

@Before
public void setup ()
{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	
	driver.get("https://www.myntra.com/");	
	
  }
	@Test
	public void SearchBoxText ()
	{
	
		WebElement searchBox = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		
		searchBox.sendKeys("pepe");
		
	List <WebElement> Searchlist = driver.findElements(By.xpath("//ul[@class='desktop-group']//li[@class='desktop-suggestion null']"));

	System.out.println("The searched list count is : " + Searchlist.size());
	
	for (int i=10; i<Searchlist.size(); i++)
	{
		
	//	System.out.println(Searchlist.get(i).getText());
		
	if(Searchlist.get(i).getText().equals(textToBeclick))
	{
		Searchlist.get(i).click();
		
	}
		
		
	}
	
	
		
	
	
	}
		
		
		
				

	
	
	
	
	@After
	public void tearDwon()
	
	{
		
		driver.quit();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
