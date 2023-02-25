package brwoserPopUp;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1_tabHandling {

WebDriver driver;
	
	@Before
	public void setup ()
	
	{
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	    driver.get("https://demoqa.com/browser-windows");
						
		
	}
	@Ignore
	@Test
	public void TabHandlingUsinSet() throws InterruptedException
	{
		
	System.out.println("orignal window title -" + driver.getTitle());
		
		WebElement newTabEle = driver.findElement(By.xpath("//button[@id='tabButton']"));
		newTabEle.click();
		
		Thread.sleep(2000);
		
	Set<String> handless = driver.getWindowHandles();
	
	Iterator<String> it = handless.iterator();
		
	String parrentWindowID = it.next();	
	String childWindowID = it.next();	
	
	System.out.println("parent WindowId - " + parrentWindowID );
	System.out.println("child WindowId - " + childWindowID  );
	
	driver.switchTo().window(childWindowID);
	
	WebElement newTabPageTextEle = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
    System.out.println(" The new tab page text - " + newTabPageTextEle.getText());
	
	System.out.println("new tab title -" + driver.getTitle());
		

   	Thread.sleep(2000);
   	
   	
  	driver.close();    // interview questions close and quit
        	
  	driver.switchTo().window(parrentWindowID);
  	
  	System.out.println("orignal window title -" + driver.getTitle());
  	
}

	@Test
	public void newWinEleUsigSet() throws InterruptedException
	{
		
	System.out.println("orignal window title -" + driver.getTitle());
		
		WebElement newWinOpean = driver.findElement(By.xpath("//button[@id='windowButton']"));
		newWinOpean.click();
	
		Thread.sleep(2000);
		
	Set<String> handless = driver.getWindowHandles();
	
	Iterator<String> it = handless.iterator();
		
	String parrentWindowID = it.next();	
	String childWindowID = it.next();	
	
	System.out.println("parent WindowId - " + parrentWindowID );
	System.out.println("child WindowId - " + childWindowID  );
	
	driver.switchTo().window(childWindowID);
	
	WebElement newTabPageTextEle = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
    System.out.println(" The new tab page text - " + newTabPageTextEle.getText());
	
	System.out.println("new tab title -" + driver.getTitle());
		

   	Thread.sleep(2000);
   	
   	
  	driver.close();    // interview questions close and quit
        	
  	driver.switchTo().window(parrentWindowID);
  	
  	System.out.println("orignal window title -" + driver.getTitle());
  	
}

	@Test
	public void newWinEleUseArrayList() throws InterruptedException
	{
		
	System.out.println("orignal window title -" + driver.getTitle());
		
		WebElement newWinOpean = driver.findElement(By.xpath("//button[@id='windowButton']"));
		newWinOpean.click();
	
		Thread.sleep(2000);
		
	Set<String> handless = driver.getWindowHandles();
	
	Iterator<String> it = handless.iterator();
		
	String parrentWindowID = it.next();	
	String childWindowID = it.next();	
	
	System.out.println("parent WindowId - " + parrentWindowID );
	System.out.println("child WindowId - " + childWindowID  );
	
	driver.switchTo().window(childWindowID);
	
	WebElement newTabPageTextEle = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
    System.out.println(" The new tab page text - " + newTabPageTextEle.getText());
	
	System.out.println("new tab title -" + driver.getTitle());
		

   	Thread.sleep(2000);
   	
   	
  	driver.close();    // interview questions close and quit
        	
  	driver.switchTo().window(parrentWindowID);
  	
  	System.out.println("orignal window title -" + driver.getTitle());
  	
}


	
	@After
   	public void tearDown()
   	{
   		
   	 driver.quit();
   		
   	}
	

	

	
	
	
}
