package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
	public  WebDriver driver;
	//TeatData
			public String url="http://183.82.103.245/nareshit/login.php";
			public String username="nareshit";
			public String Password="nareshit";
			public String LastName ="hi";
			public String FirstName ="hello";
			public String img="F:\\flower.jpg";
			public String Search1="hello";
			
	//Object
			public String txt_loginname = "txtUserName";
			public String txt_password  = "txtPassword";
			public String btn_login     = "Submit";
			public String link_logout   = "Logout";
			public String frm_Frame     ="rightMenu";
			public String btn_Add       ="//input[@value='Add']";
			public String btn_Delete    ="//input[@value='Delete']";
			public String btn_Search    ="//input[@value='Search']";
			public String btn_back      ="//input[@value='Back']";
			public String txt_EN        ="//*[@id='txtEmpLastName']";
			public String txt_FN        ="//*[@name='txtEmpFirstName']";
			public String selectimg     ="//*[@type='file'][@id='photofile']";
			public String Submit        ="//*[@id='btnEdit']";
			public String Sele        ="loc_code";
			public String Searchfor     ="loc_name";
			public String Search        ="btn_Search";
			public String Select        ="chkLocID[]";
			
			
			
			
}
