package locaters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocaters {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		System.out.println(" The title of landing page is - " + driver.getTitle());
		
		WebElement FirstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		
		Thread.sleep(2000);
		
		if(FirstName.isDisplayed())
		{	
			FirstName.sendKeys("Tom");
			
		}
		
		else
		{
			System.out.println(" WebElement with name FirstName is not found");
		}
		
		Thread.sleep(2000);
		
		WebElement LastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		
		if (LastName.isDisplayed())
		{
			LastName.sendKeys("XYZ");
			
		}
		
		
		else
		{
			System.out.println(" WebElement with name LastName is not found ");
		}
		
		Thread.sleep(2000);
		
		WebElement AddressBox = driver.findElement(By.xpath("//textarea [@ng-model='Adress']"));
		
		if (AddressBox.isDisplayed())
		{
			AddressBox.sendKeys("pune");
		}
		
		else 
		{
			System.out.println(" WebElement with AddressBox is not found");
		}
		
		WebElement genderRadioButton = driver.findElement(By.xpath("//input[@value=	'FeMale']"));
		
		if(genderRadioButton.isEnabled())
			
		{
			genderRadioButton.click();
		}

		else 
		{
			System.out.println("WebElement with name genderRadioButton is not found");
		}
		
		
		
		Thread.sleep(3000);
		
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
