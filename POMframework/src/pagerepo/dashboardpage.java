package pagerepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class dashboardpage
{
	WebDriver driver;    			
	public dashboardpage(WebDriver driver)		//calling constructor to get the drivers
	{
		this.driver=driver;
	}
	public boolean getusernamelink()
	{
		WebElement username=driver.findElement(By.id("welcome"));
		boolean res=username.isDisplayed();				//display result
		return res;
	}
	
	public String getusernametext()
	{
		WebElement username= driver.findElement(By.id("welcome"));
		String text=username.getText(); 			//gettext is use to get the text in middle of tag
		return text;
		
	}
}
