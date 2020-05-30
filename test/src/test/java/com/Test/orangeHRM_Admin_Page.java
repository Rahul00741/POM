package com.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class orangeHRM_Admin_Page {
	
	WebDriver driver;
	public orangeHRM_Admin_Page(WebDriver ldriver){
		driver = ldriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(id="menu_admin_viewAdminModule")
	WebElement adminLink;
	
	@FindBy(id="searchSystemUser_userName")
	WebElement AdminuserName;
	
	@FindBy(id="searchSystemUser_userType")
	WebElement AdminuserRole;
	
	@FindBy(id="searchSystemUser_employeeName_empName")
	WebElement AdminempName;
	
	@FindBy(id="searchSystemUser_status")
	WebElement Adminstatus;
	
	@FindBy(id="searchBtn")
	WebElement searchButton;
	
	
	public void selectDrop(WebElement element, String value)
	{
		Select s = new Select(element);
		s.selectByValue(value);
	}
	
	public void Admin_adminlink()
	{
		adminLink.click();
	}
	
	public void AdminAdminuserName(String Auname)
	{
		AdminuserName.sendKeys(Auname);
		
	}
	
	public void Admin_AdminuserRole(String text)
	{
		selectDrop(AdminuserRole, text);
	}
	
	public void Admin_AdminempName(String ename)
	{
		AdminempName.sendKeys(ename);
	}
	
	public void Admin_Adminstatus(String Dstatus)
	{
		selectDrop(Adminstatus, Dstatus);
		
	}
	public void Admin_search(){
		searchButton.click();
	}

}
