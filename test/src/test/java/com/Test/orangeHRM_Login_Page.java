package com.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orangeHRM_Login_Page {
	
	WebDriver driver;
	public orangeHRM_Login_Page(WebDriver ldriver){
		driver = ldriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(id="txtUsername")
	WebElement unames;
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(id="btnLogin")
	WebElement login;
	
	public void userName(String uname)
	{
		unames.sendKeys(uname);
	}
	
	public void psssWord(String pwd)
	{
		password.sendKeys(pwd);
		
	}
	
	public void Login()
	{
		login.click();
	}
	

}
