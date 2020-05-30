package com.BaseClass;

//import java.io.File;
//import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

//import com.SeleniumUtiliy.selenium_Utility;

public class Library {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public void launchApp() throws IOException  
	{
		FileInputStream fileIS = new FileInputStream("C:\\new eclipse\\test\\src\\test\\resources\\Config Properties\\config.properties");
		prop = new Properties();
		prop.load(fileIS);
		if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", prop.getProperty("chromePath"));
			driver = new ChromeDriver();
			
		}
		
		else if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.geko.driver", prop.getProperty("firefoxPath"));
			driver = new ChromeDriver();
		}
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	
	}
	
//	public void to_take_screenshot(String path)
//	{
//		TakesScreenshot ss = (TakesScreenshot)driver;
//		File src = ss.getScreenshotAs(OutputType.FILE);
//		//String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
//		File target = new File(System.getProperty("user.dir") + "/Screenshot/" + ".png");
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


	
	public void tearDown()
	{
		driver.close();
	}
	
	
	
	
	
}
