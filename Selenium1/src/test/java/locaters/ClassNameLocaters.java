package locaters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocaters {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
        driver.get("http://zero.webappsecurity.com/");
        
        System.out.println("The title of landing page is - " + driver.getTitle());
        
     WebElement singInBtn = driver.findElement(By.className("signin"));
    
     Thread.sleep(3000);
     
    if ( singInBtn.isDisplayed()) 
    {
    	 singInBtn.click(); 
 		
	}
	
    else 
    {
    	System.out.println(" The singInBtn is not Displayed on the landing page ");
    	
    }
		
	System.out.println(" The title of login page is - " + driver.getTitle());
	
	Thread.sleep(3000);		
	
	WebElement logInText = driver.findElement(By.id("user_login"));
	WebElement passwordText = driver.findElement(By.name("user_password"));
	
	if (logInText.isEnabled())
	{
		logInText.sendKeys(" username");
	}
	
	else 
	{
		System.out.println(" The login text field is not enabled");
	}
	
	if (passwordText.isEnabled())
		
	{
		passwordText.sendKeys("password");
	}
	
	else 
		
	{
		System.out.println(" The password text field is not enabled");
	}
	
	WebElement logInBtn = driver.findElement(By.name("submit"));
	
	if(logInBtn.isEnabled())
	{
		logInBtn.click();
	}
	
	else 
	{
		System.out.println(" The signin button on landing page is not enabled ");
	}
	
	System.out.println(" The title after login page is - " + driver.getTitle());
	
	Thread.sleep(3000);
	
	driver.quit();	
		
		
		
	}
	
	
	
	
	
	
}
