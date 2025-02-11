package com.test.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends BrowserCommands{
	
	private WebElement element;
	
	public void setElmnt(String locator,String locatorValue)
	{
		switch(locator)
		{
		case "id":
		{
			driver.findElement(By.id(locatorValue));
			break;
		}
		case "name":
		{
			driver.findElement(By.name(locatorValue));
			break;
		}
		case "className":
		{
			driver.findElement(By.className(locatorValue));
			break;
		}
		case "tagName":
		{
			driver.findElement(By.tagName(locatorValue));
			break;
		}
		case "linkText":
		{
			driver.findElement(By.linkText(locatorValue));
			break;
		}
		case "partialLinkText":
		{
			driver.findElement(By.partialLinkText(locatorValue));
			break;
		}
		case "xpath":
		{
			driver.findElement(By.xpath(locatorValue));
			break;
		}
		case "cssSelector":
		{
			driver.findElement(By.cssSelector(locatorValue));
			break;
		}
		default:
		{
			System.out.println("please enter the valid locator");
			break;
		}
		}
		
		
	}

	public WebElement getElmnt()
	{
		return element;
	}
	public WebElement getElement(String locator,String locatorValue)
	{
		this.setElmnt(locator, locatorValue);
		return this.getElmnt();

	}
	public void elementActions(WebElement element,String option)
	{
		switch(option)
		{
		case "clear":
		{
			element.clear();
			break;
		}
		case "click":
		{
			element.click();
			break;
		}
		case "submit":
		{
			element.submit();
			break;
		}
		default:
		{
			System.out.println("please enter the valid option");
			break;
		}
		}
	}
	public void enterValue(WebElement element,String value)
	{
		element.sendKeys(value);
	}
	
	public String getValues(WebElement element)
	{
		return element.getText();
	}
	public String getAtribute(WebElement element,String attribute)
	{
		return element.getDomAttribute(attribute);
	}
	public String getCssProperty(WebElement element,String property)
	{
		return element.getCssValue(property);
	}
}
