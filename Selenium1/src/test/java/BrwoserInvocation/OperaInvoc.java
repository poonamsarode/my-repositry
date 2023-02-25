package BrwoserInvocation;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.opera.OperaDriver;

public class OperaInvoc {
	
public static void main(String[] args) {
	             
	
	
System.setProperty("webdriver.opera.driver", System.getProperty(" user.dir") + " C:\\Users\\Dell\\eclipse-workspace\\Demoproject\\Selenium1\\nulloperadriver.exe\r\n"
		+ "");

WebDriver driver = new OperaDriver(); 

 driver.get("https://www.Google.co.in");
 	
	
	
}
	
	
	
}	
	
	
	


