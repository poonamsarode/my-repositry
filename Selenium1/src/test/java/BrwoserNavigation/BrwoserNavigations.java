package BrwoserNavigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrwoserNavigations {

public static void main(String[] args) throws InterruptedException {
	
	
 WebDriver driver = new ChromeDriver();

 driver.manage().window().maximize();
 driver.manage().deleteAllCookies();
 
 
 driver.get("https://www.google.co.in/");

 System.out.println(" the page title first time opened brwoser -> " + driver.getTitle());
 
 //.............................................................................................................................................
 
 Thread.sleep(2000);
 
 driver.navigate().to("https://www.facebook.com/");
 
 System.out.println("the page title after geting over from google -> " + driver.getTitle());
 
 Thread.sleep(2000);      // its from java it is running process 
 
 driver.navigate().back();
 System.out.println(" the page title after making a back -> " + driver.getTitle());
 
 Thread.sleep(2000);

 driver.navigate().forward();
 System.out.println(" The page title after making a forword -> " + driver.getTitle());
 
 Thread.sleep(2000);
 
 driver.navigate().refresh();
 System.out.println(" The page title after making a refresh -> " + driver.getTitle());
 
 Thread.sleep(2000);
 
 driver.quit();
 
 

	
	
	
	
	
}	
	
	
	
	
	
	
}
