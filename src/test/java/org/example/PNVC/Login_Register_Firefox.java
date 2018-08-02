

package org.example.PNVC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login_Register_Firefox {
	
	private WebDriver driver;
	
  @Test
  public void login() {
	  
	  driver.findElement(By.linkText("REGISTER")).click();
	  driver.findElement(By.name("firstName")).sendKeys("Vinay");
	  driver.findElement(By.cssSelector("input[name='address1']")).sendKeys("Accenture");
	  
	  Select country = new Select(driver.findElement(By.name("country")));
	  country.selectByIndex(58);	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.gecko.driver", "C:\\Selenium_Driver\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("http://newtours.demoaut.com/");
  }

  @AfterTest
  public void afterTest() {
  }

}
