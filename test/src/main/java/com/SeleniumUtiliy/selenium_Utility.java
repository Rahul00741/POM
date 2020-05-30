package com.SeleniumUtiliy;

import java.io.File;
import java.io.IOException;
//import java.text.SimpleDateFormat;
///import java.util.Date;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



public class selenium_Utility {
	static WebDriver driver;
	public void Selenium_Utility(WebDriver ldriver)
	{
		driver = ldriver;
		PageFactory.initElements(ldriver, this);
	}
	public void Selectdrop(WebElement element, String value)
	{
		Select dropdown = new Select(element);
		dropdown.selectByValue(value);
	}
	
	public static void to_take_screenshot(String path)
	{
		TakesScreenshot ss=(TakesScreenshot)driver;
		File src=ss.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
//	public static void to_take_screenshot(WebDriver driver)
//	{
//		TakesScreenshot ss = (TakesScreenshot)driver;
//		File src = ss.getScreenshotAs(OutputType.FILE);
//		String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
//		//File target = new File(System.getProperty("user.dir") +timestamp+ "/Screenshot/" + ".png");
//		File target = new File("C:\\new eclipse\\test\\Screenshot\\Login_Page.png");
//		try{
//			FileUtils.copyFile(src, target);
//			System.out.println("Screenshot taken");
//		}
//		
//		catch(Exception e)
//		{
//			System.out.println("Exception while taking screenshot: "+e.getMessage());
//		}
//		catch(IOException e)
//		{
//			e.printStackTrace();
//		}
//		catch(WebDriverException e)
//		{
//			e.printStackTrace();
//		}
	
				
//	}
//	public void to_take_screenshot(String path) throws IOException
//	{
//		TakesScreenshot ss= (TakesScreenshot)driver;
//		File source = ss.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyDirectory(source, new File(path));
//	}
	public void getTitle(){
		System.out.println(driver.getTitle());
	}
	public void verfiTitle(boolean logoPresent){
		Assert.assertEquals(logoPresent, true);
	}

}
