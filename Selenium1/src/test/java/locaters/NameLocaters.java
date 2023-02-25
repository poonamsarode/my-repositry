package locaters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocaters {

public static void main(String[] args) {

	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.get("https://www.google.com/");
	
	String PageTitle = driver.getTitle();
	
	System.out.println(" The page title is - " + PageTitle);
	
	
	WebElement searchBox = driver.findElement(By.name("q"));
	
	searchBox.sendKeys("Selenium Automation");
	
	WebElement SearchBtn = driver.findElement(By.name("btnK"));
	
	SearchBtn.click();
	
	String nextPageTitle = driver.getTitle();
	
	System.out.println(" the next page title is - " + nextPageTitle);
	
	//Validation ...........................................................................................................................
	
	if(nextPageTitle.equals(" Selenium Automation  -Google Search "))
		
	{
		System.out.println(" Usear is an search result page ");
	}
	
	
	else
	{
		System.out.println(" User is not on search result page ");
	}

driver.quit();


 
	
	
	
	
	
	
	
	
	
	
	
}	
	
	
	
	
	
}
