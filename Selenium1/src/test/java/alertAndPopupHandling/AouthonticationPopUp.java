package alertAndPopupHandling;

import static org.junit.Assert.assertArrayEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AouthonticationPopUp {
	
	WebDriver driver;
	
  @Before
public void setup ()
	
	{
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	   								
	}
	
 /*@Test
public void AuthHandling() throws InterruptedException
{

	String username = "admin";		
	String password = "admin";
	
	String URL = "https://" + username +":" + password + "@" + "the-internet.herokuapp.com/basic_auth";
	
	driver.get(URL);
    
	Thread.sleep(2000);
}*/

@Test
public void AuthHandling_2_() throws InterruptedException
{

	String username = "admin";		
	String password = "admin";
	
	String URL = "https://" + username +":" + password + "@" + "the-internet.herokuapp.com/digest_auth";
	
	driver.get(URL);
    
	Thread.sleep(2000);
	
	WebElement authSuccsesEle = driver.findElement(By.xpath("//p[contains(text(), 'Congratulations! You must have the proper credentials.')]"));
	
	System.out.println("After Auth succsess the text is -> " + authSuccsesEle.getText() );
	
	Assert.assertEquals("Congratulations! You must have the proper credentials.", authSuccsesEle.getText());
	
}



@After
	public void tearDown()
	{
		
	 driver.quit();
		
	}



}


