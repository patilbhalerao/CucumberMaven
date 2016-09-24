package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//return required browser//

public class BrowserManager 
{
	static WebDriver driver;
	public static WebDriver getBrowser(String string) {
		// TODO Auto-generated method stub
		driver=new FirefoxDriver();
		return driver;
		
		
	}
	private BrowserManager()
	{
		
		
	}
	
	
	
}
