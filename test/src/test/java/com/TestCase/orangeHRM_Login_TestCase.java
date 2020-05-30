package com.TestCase;

import java.io.IOException;

//import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BaseClass.Library;
import com.SeleniumUtiliy.selenium_Utility;
import com.Test.orangeHRM_Login_Page;

public class orangeHRM_Login_TestCase extends Library {
	
	@BeforeTest
	public void start() throws IOException
	{
		launchApp();
	}
	
	
	@Test
	
	public void Login_Page()
	{
		orangeHRM_Login_Page login = new orangeHRM_Login_Page(driver);
		login.userName(prop.getProperty("uname"));
		login.psssWord(prop.getProperty("pwd"));
		login.Login();		
	}
	
	@AfterClass
	public void close() throws IOException
	{
		selenium_Utility.to_take_screenshot(prop.getProperty("LoginScreen"));
		tearDown();
	}
	
	
}
