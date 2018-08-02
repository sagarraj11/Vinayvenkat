
package org.example.PNVC;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utility.WebdriverFactory;
import page.Loginpageobjecct;

public class Login {
	
	private WebDriver driver;
	
  @Test(dataProvider="userandpwd", description = "fewsgr")
  public void login(String us, String pw) {
	 // Loginpageobjecct.uname.clear();
	  Loginpageobjecct.uname.sendKeys(us);
	 // Loginpageobjecct.pass.clear();
	  Loginpageobjecct.pass.sendKeys(pw);
	  Loginpageobjecct.log_button.click();
	  driver.navigate().forward();
	  driver.navigate().back();
  }
  
  @DataProvider(name = "userandpwd")
  public String[] [] credentials(){
	  return new String [] [] {
		  
		  new String [] {"invalidUN", "invalidPW"},
		  new String [] {"dp5804", "123456789"},
		  new String [] {"vinay","venkat"},
		   
	  };
	  
  
 /* @Test(priority = 2)
  public void bookflight() {
	  
	  driver.findElement(By.cssSelector("input[value='roundtrip'")).click();
	  
	  Select passcount = new Select(driver.findElement(By.name("passCount")));
	  passcount.selectByIndex(2);
	  
	  Select fromPort = new Select(driver.findElement(By.name("fromPort")));
	  fromPort.selectByValue("London");
	  
	  Select fromMonth = new Select(driver.findElement(By.name("fromMonth")));
	  fromMonth.selectByIndex(1);
	  
	  Select fromDay = new Select(driver.findElement(By.name("fromDay")));
	  fromDay.selectByValue("15");
	  
	  Select toPort = new Select(driver.findElement(By.name("toPort")));
	  toPort.selectByIndex(4);
	  
	  Select toMonth = new Select(driver.findElement(By.name("toMonth")));
	  toMonth.selectByValue("8");
	  
	  Select toDay = new Select(driver.findElement(By.name("toDay")));
	  toDay.selectByIndex(25);
	  
	  driver.findElement(By.cssSelector("input[value='Business']")).click();
	  
	  driver.findElement(By.name("findFlights")).click(); 

*/  }
  @BeforeTest
  public void beforeTest() {
	driver = WebdriverFactory.createdriver();
	driver.manage().window().maximize();
	driver.navigate().to("http://newtours.demoaut.com/");
	PageFactory.initElements(driver,  Loginpageobjecct.class);
	
  }

  @AfterTest
  public void afterTest() {
  }

}
