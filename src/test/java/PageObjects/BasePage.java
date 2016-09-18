package PageObjects;

import org.openqa.selenium.WebDriver;

import utility.BrowserManager;


public class BasePage 
{
    WebDriver browser;
	
	public BasePage()
	{
		browser=BrowserManager.getBrowser("Chrome");
		
	}
}
