package com.hrms.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class BaseClass {
	//Driver
   public static WebDriver driver;
   //open Application
   public static void openApplication() {
	   System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver_win32\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	   Reporter.log("Open Application");
   }
   public static void closeApllication() {
	   driver.quit();
	   Reporter.log("Close Application");
   }

}

