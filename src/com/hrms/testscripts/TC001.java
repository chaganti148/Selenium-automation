package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.TestNG;

import com.hrms.lib.General;

public class TC001 {

	
	@Test
	public  void TC001() {
		DOMConfigurator.configure("log4j.xml");
		// TODO Auto-generated method stub
		General g=new General();
		g.openApllication();
		g.login();
		g.logout();
		g.closeApplication();
	}

}
