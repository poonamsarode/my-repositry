package BrwoserInvocation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromInvoc {	
	
	
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Demoproject\\Selenium1\\brwoserDrivers\\chromedriver.exe");

	WebDriver driver = new ChromeDriver(); 

	 driver.get("https://www.google.co.in");
	 
	 driver.manage().window().maximize();
	 
	 String pageTitle = driver.getTitle();
	// System.out.println("the page title is - " + pageTitle );
	 
	 System.out.println("the page title is - " + driver.getTitle());
	 
	 //.............................................................................................................................
	 String CurrentPageUrl = driver.getCurrentUrl();
	// System.out.println(" The current page Url after opeaning chrome is - " + CurrentPageUrl );

	 
	 //Validation ...........................................................................
	 
	 
	  if(pageTitle.equals("Google"))
	  {
		  System.out.println(" Test is paas,title is matching ");
	  }
	 
	  else 
	    {
		 System.out.println("test is fail , title not matching");
	    }
	 
	 
	 if (CurrentPageUrl.equals("https://www.google.co.in"));
	 
	 {
		 System.out.println("test is pass,Url is matching ");
	 }
	 
	 
	     
	 
	 
	driver.quit();	
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	
		
	
	
}




