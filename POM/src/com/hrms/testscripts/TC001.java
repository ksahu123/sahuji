package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.page.LoginPage;
import com.hrms.page.LogoutPage;
import com.hrms.page.VerifyPage;
import com.hrms.utility.BaseClass;

public class TC001 {
	@Test
	public static void tc001() {
		BaseClass.openApplication();
		VerifyPage.verifTitle("HRMS");
		LoginPage.login("nareshit", "nareshit");
		VerifyPage.verifTitle("OrangeHRMS");
		LogoutPage.logout();
		BaseClass.closeApllication();
	}

}
