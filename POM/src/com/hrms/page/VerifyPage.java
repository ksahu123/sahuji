package com.hrms.page;

import org.testng.Reporter;

import com.hrms.utility.BaseClass;

public class VerifyPage extends BaseClass{
	//verify fun
	public static void verifTitle(String title) {
	  if(driver.getTitle().equals(title)) {
		  Reporter.log("Title matched");  
	  }
	  else {
		  Reporter.log("Title not matched");
		  Reporter.log(driver.getTitle());
	  }
	}
	

}
