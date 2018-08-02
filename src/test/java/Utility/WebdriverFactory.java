package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebdriverFactory {
	
	public static WebDriver createdriver() {
		
		String webdriver = System.getProperty("browser", "ie");
				
		switch (webdriver) {
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium_Driver\\geckodriver.exe");
			return new FirefoxDriver();
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Driver\\chromedriver.exe");
			return new ChromeDriver();
		case "ie":
			System.setProperty("webdriver.ie.driver", "C:\\Selenium_Driver\\IEDriverServer.exe");
			return new InternetExplorerDriver();
		default:
			
			throw new RuntimeException("Unsupported "+ webdriver);
			
		
		}
	}

}
