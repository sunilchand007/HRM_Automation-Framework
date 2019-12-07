package com.Testrunner;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Fwcommanmethods.Baseclass;
import com.Testcases.Hrmtestcls;

public class Testexecutionwithtestng extends Baseclass{
	@Test
	public static void overalltest() {
		Baseclass.getbrowser("chrome");
		
		 Hrmtestcls hrm = PageFactory.initElements(driver, Hrmtestcls.class);
		 hrm.useremailorphonenumber();
		 hrm.userpassword();
		 hrm.mousehoveraction();
		
	}

}
