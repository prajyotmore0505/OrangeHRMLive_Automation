package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browseroperations 
{
	WebDriver driver;
	public WebDriver LaunchApplication()
	{
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		 driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		return driver;
	}
	
	public String GettitleofBrowser()
	{
		String title=driver.getTitle();
		return title;
		
	}
}