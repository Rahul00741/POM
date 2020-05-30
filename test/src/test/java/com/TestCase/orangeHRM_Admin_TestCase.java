package com.TestCase;

import java.io.IOException;

//import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BaseClass.Library;
import com.SeleniumUtiliy.selenium_Utility;
import com.Test.orangeHRM_Admin_Page;
import com.Test.orangeHRM_Login_Page;

public class orangeHRM_Admin_TestCase extends Library {
	
	orangeHRM_Login_TestCase login;
	orangeHRM_Admin_Page admin;
	
	@BeforeClass
	public void start() throws IOException
	{
		launchApp();
	}
	
	
	@Test(priority=2)
	
	public void Login()
	{
		orangeHRM_Login_Page login = new orangeHRM_Login_Page(driver);
		login.userName(prop.getProperty("uname"));
		login.psssWord(prop.getProperty("pwd"));
		login.Login();		
	}
	
	@Test(dependsOnMethods="Login")
	public void admin()
	{
		admin = new orangeHRM_Admin_Page(driver);
		admin.Admin_adminlink();
		admin.AdminAdminuserName(prop.getProperty("Auname"));
		admin.Admin_AdminuserRole(prop.getProperty("Role"));
		admin.Admin_AdminempName(prop.getProperty("Employeename"));
		admin.Admin_Adminstatus(prop.getProperty("Status"));
		admin.Admin_search();
	}
	@AfterClass
	public void close() throws IOException
	{
		selenium_Utility.to_take_screenshot(prop.getProperty("AdminScreen"));
		selenium_Utility.to_take_screenshot(prop.getProperty("LoginScreen"));
		//selenium_Utility.to_take_screenshot(driver);
		tearDown();
	}
	
	
}
