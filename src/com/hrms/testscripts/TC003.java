package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC003 {
	

	@Test
	public  void TC003() {
	
		DOMConfigurator.configure("log4j.xml");
	   General g=new General();
		g.openApllication();
		g.login();
		g.EnterFrame();
		g.DeleteEmp();
		g.ExitFrame();
		g.logout();
		g.closeApplication();
	}

}
