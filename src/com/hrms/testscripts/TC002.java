package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC002 {
	
	@Test
	public  void TC002() {
	
		DOMConfigurator.configure("log4j.xml");
	General g=new General();
	g.openApllication();
	g.login();
	g.EnterFrame();
	g.Addemp();
	g.ExitFrame();
	g.logout();
	g.closeApplication();
	
	}
}
