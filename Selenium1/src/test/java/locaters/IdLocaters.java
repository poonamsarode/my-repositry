package locaters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocaters { 
	
public static void main(String[] args) throws InterruptedException {
	
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.get("https://demo.automationtesting.in/Index.html");
    
	String PageTitle = driver.getTitle();
	
	System.out.println(" Page title is - " + PageTitle);
	
	WebElement userEmailField = driver.findElement(By.id("email"));
	
	userEmailField.sendKeys("abcd@gmail.com");
	
	Thread.sleep(3000);
	
	WebElement ProccedBtn = driver.findElement(By.id("enterimg"));
	
	ProccedBtn.click();
	
	Thread.sleep(3000);
	
String nextPageTitle = driver.getTitle();

System.out.println("The next page title is - " + nextPageTitle);

//Validation .............................................................................................................


if (nextPageTitle.equals("Register"))
	
{
	System.out.println(" User is able to direct the next page for Register");
}
	
else
{
	System.out.println("User is not able to direct the next page for Register");
	
}
	
	
	
	driver.quit();
	
	
	
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	
	
	
	
	
	

}
