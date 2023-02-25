package day1st;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.crom.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32" );
		
		
		
	WebDriver driver = new ChromeDriver ();
		
		driver.get("http://selenium.dev");
		System.out.println(driver.getTitle());
		
		

	}

}
