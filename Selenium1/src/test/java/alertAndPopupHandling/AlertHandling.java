package alertAndPopupHandling;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {


	WebDriver driver;
	
	String alertText = "Aleshia";
	
	@Before
	public void setup ()
	
	{
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	    driver.get("https://demo.automationtesting.in/Alerts.html");
						
		
	}
	
/*	@Test
	public void alertHandling_1_() throws InterruptedException
	
	{
		WebElement alertGenBtnEle =driver.findElement(By.xpath("//button[contains(text(),'click the button to display an  alert box:')]"));
		
		alertGenBtnEle.click();
		
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println("Alert text is -> " + alert.getText());
		
		Assert.assertEquals("Alert text is not matching", "I am an alert box!",alert.getText());     // when the assertion get faild text is printing 
		
		
		alert.accept();
		
		Thread.sleep(2000); 
		
	}*/
	
	//@Test
/*	public void alertHandling_2_() throws InterruptedException
	
	{
		
         WebElement doubleGenBtnEle =driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		
         doubleGenBtnEle.click();
		
		
		WebElement alertGenBtnEle =driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']"));
		
		alertGenBtnEle.click();
		
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println("Alert text is -> " + alert.getText());
		
		Assert.assertEquals("Alert text is not matching", "Press a Button !",alert.getText());     // when the assertion get faild text is printing 
		
		alert.accept();
		
		WebElement alertAccptElement = driver.findElement(By.xpath("//p[@id='demo' and text()='You pressed Ok']"));
		
		Assert.assertEquals("The press Okay functionallity is broken","You pressed Ok", alertAccptElement.getText());
		
		
		Thread.sleep(2000);
		
	}*/
	
/*	@Test
	public void alertHandling_3_() throws InterruptedException
	
	{
		
         WebElement doubleGenBtnEle =driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		
         doubleGenBtnEle.click();
		
		
		WebElement alertGenBtnEle =driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']"));
		
		alertGenBtnEle.click();
		
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println("Alert text is -> " + alert.getText());
		
		Assert.assertEquals("Alert text is not matching", "Press a Button !",alert.getText());     // when the assertion get faild text is printing 
		
		alert.dismiss();
		
		WebElement alertdissmissElement = driver.findElement(By.xpath("//p[@id='demo' and text()='You Pressed Cancel']"));
		
		Assert.assertEquals("The press Okay functionallity is broken","You Pressed Cancel", alertdissmissElement.getText());
		
		
		Thread.sleep(2000);
		
	}*/
	
	@Test
	public void alertHandling_4_() throws InterruptedException
	
	{
		
         WebElement alertWithTextEle =driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		
         alertWithTextEle.click();
		
		
		WebElement alertGenBtnEle =driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		
		alertGenBtnEle.click();
		
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println("Alert text is -> " + alert.getText());
		
	alert.sendKeys(alertText);
		
	Thread.sleep(2000);
		
	alert.accept();
	
	WebElement alrtAfterTextEle = driver.findElement(By.xpath("//p[text()='Hello "+alertText+" How are you today']"));
	
		Assert.assertEquals("Hello "+alertText+" How are you today", alrtAfterTextEle.getText());
		
		Thread.sleep(2000);
		
	}
	
	
	
	@After
   	public void tearDown()
   	{
   		
   	 driver.quit();
   		
   	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
