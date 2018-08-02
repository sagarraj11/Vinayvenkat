
package org.example.PNVC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login_DurgaPrasad {
	
	private WebDriver driver;
  @Test
  public void gsearch() {
	  driver.findElement(By.name("q")).clear();
	  driver.findElement(By.name("q")).sendKeys("newtours demaout");
	  driver.findElement(By.name("btnk")).click();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Driver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com/");
  }

  @AfterTest
  public void afterTest() {
	  //driver.close();
  }

}
