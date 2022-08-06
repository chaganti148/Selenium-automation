package com.hrms.lib;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.hrms.utility.Log;

public class General extends Global{
	//Re-usebillty fution and methods
	public void openApllication() {
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to(url);
		System.out.println("Application open");
		Reporter.log("URL: "+driver.getCurrentUrl());
		Log.info("URL: "+driver.getCurrentUrl());
		Reporter.log("Application opening");
		Log.info("Application opening");
	}
	public void closeApplication() {
		driver.close();
		System.out.println("Application close");
		Reporter.log("Application close");
		Log.info("Application close");
	}
	public void login() {
		driver.findElement(By.name(txt_loginname)).sendKeys(username);
		driver.findElement(By.name(btn_login)).click();
		//Alert messages
		Alert a=driver.switchTo().alert();
		a.accept();
		driver.findElement(By.name(txt_password)).sendKeys(Password);
        //using javascriptExecuter to click on login
		WebElement loginbtn = driver.findElement(By.name(btn_login));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", loginbtn);
		Reporter.log("User Name: "+username);
		Reporter.log("Password: "+Password);
		Log.info("User Name: "+username);
		Log.info("Password: "+Password);
		System.out.println("Login Completed");
		Reporter.log("Login Completed");
		Log.info("Login Completed");
	}
	public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout Completed");
		Reporter.log("Logout Completed");
		Log.info("Logout Completed");
	}
	public void EnterFrame() {
		driver.switchTo().frame(frm_Frame);
		System.out.println("enter into frame");
		Reporter.log("enter into frame");
		Log.info("enter into frame");
	}
	public void ExitFrame() {
		driver.switchTo().defaultContent();
		System.out.println("exit into frame");
		Reporter.log("exit into frame");
		Log.info("exit into frame");
	}
	public void Addemp() {
		driver.findElement(By.xpath(btn_Add)).click();
		driver.findElement(By.xpath(txt_EN)).sendKeys(LastName);
		driver.findElement(By.xpath(txt_FN)).sendKeys(FirstName);
		//photo choosen
		WebElement fileinput= driver.findElement(By.xpath(selectimg));
		fileinput.sendKeys(img);
		driver.findElement(By.xpath(Submit)).click();
		driver.findElement(By.xpath(btn_back)).click();
		Reporter.log("LasTName: "+LastName);
		Reporter.log("FirstName: "+FirstName);
		Reporter.log("ImagePath: "+img);
		Log.info("LasTName: "+LastName);
		Log.info("FirstName: "+FirstName);
		Log.info("ImagePath: "+img);
		System.out.println("Add Emp");
		Reporter.log("Add Emp");
		Log.info("Add Emp");
	}
	public void DeleteEmp() {
		Select st=new Select(driver.findElement(By.name(Sele)));
		st.selectByIndex(2);
		driver.findElement(By.name(Searchfor)).sendKeys(Search1);
		driver.findElement(By.xpath(btn_Search)).click();
		driver.findElement(By.name(Select)).click();
		driver.findElement(By.xpath(btn_Delete)).click();
		Reporter.log("Search to select: "+Search1);
		Log.info("Search to select: "+Search1);
		Reporter.log("Emp deleted");
		System.out.println("DeleteEMP");
		Log.info("DeleteEMP");
	}

}
