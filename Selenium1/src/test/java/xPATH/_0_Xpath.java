package xPATH;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _0_Xpath {
	
	
	public static  void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	
	driver.get("https://www.amazon.com/");
		
	
	
	WebElement searchBox = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input"));
		
	searchBox.sendKeys("iphone");
	
	Thread.sleep(2000);
	
	WebElement searchBtn = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[3]/div/span/input"));
	
	searchBtn.click();
	
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
