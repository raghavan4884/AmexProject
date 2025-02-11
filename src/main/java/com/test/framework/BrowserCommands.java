package com.test.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserCommands {
	
	public static WebDriver driver;
	
	public WebDriver OepnBrowser(String browser)
	{
		switch(browser)
		{
		case "chrome":
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		}
		case "edge":
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
		}
		case "firefox":
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
		}
		default:
		{
			System.out.println("please enter the valid browser");
			break;
		}
		}
		
		return driver;
	}

	public void openURL(String url,String option)
	{
		switch(option)
		{
		case "getUrl":
		{
			driver.get(url);
			break;
		}
		case "navigateUrl":
		{
			driver.navigate().to(url);
			break;
		}
		default:
		{
			System.out.println("Please enter valid option");
			break;
			
		}
		}
		
	}
	public String getBrowserValue(String option)
	{
		String value="";
		switch(option)
		{
		case "title":
		{
			value=driver.getTitle();
			break;
		}
		case "currentUrl":
		{
			value=driver.getCurrentUrl();
			break;
		}
		default:
		{
			System.out.println("Please enter valid option");
			break;
		}
		}
		return value;
	}
	
	
	public void navigateOption(String option)
	{
		switch(option)
		{
		case "back":
		{
			driver.navigate().back();
			break;
		}
		case "forward":
		{
			driver.navigate().forward();
			break;
		}
		case "refresh":
		{
			driver.navigate().refresh();
			break;
		}
		default:
		{
			System.out.println("please enter correct option");
			break;
		}
		}
		
	}
	
	public void maxOrMinWindow(String option)
	{
		switch(option)
		{
		case "max":
		{
			driver.manage().window().maximize();
			break;
		}
		case "min":
		{
			driver.manage().window().minimize();
			break;
		}
		case "fullscreen":
		{
			driver.manage().window().fullscreen();
			break;
		}
		default:
		{
			System.out.println("please enter correct option");
			break;
		}
		}
		
	}
	
	public void closeWindow(String option)
	{
		switch(option)
		{
		case "close":
		{
			driver.close();
			break;
		}
		case "quit":
		{
			driver.quit();
			break;
		}
		}
	}
	
	
}
