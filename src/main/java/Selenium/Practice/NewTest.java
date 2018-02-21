package Selenium.Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() throws InterruptedException {
	  System.out.println("hiiii");

	   // WebDriver driver= new HtmlUnitDriver();
		//WebDriver driver = new SafariDriver();
	    System.setProperty("webdriver.chrome.driver", "/Users/rdatla/Downloads/chromedriver 2"); // path of chromedriver 
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(10000);
		driver.findElement(By.name("email")).sendKeys("7416783307");
		driver.findElement(By.name("pass")).sendKeys("123456");
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(3000);
		System.out.println("Control entered here...");
		System.out.println("Title of the Searched Page===="+driver.getTitle());
		Thread.sleep(3000);
		Thread.sleep(2000);
		//driver.quit();//ogt it
		driver.close();//it is
		//added comment
  }
}
