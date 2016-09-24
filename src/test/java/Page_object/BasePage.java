package Page_object;

import org.openqa.selenium.WebDriver;

import Utility.BrowserManager;

public class BasePage
{
	WebDriver browser;
	
	public BasePage()
	{
		browser=BrowserManager.getBrowser("firefox");
	}

}
