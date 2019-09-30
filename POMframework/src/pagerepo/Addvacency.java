package pagerepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Addvacency 
{
	WebDriver driver;
	public Addvacency(WebDriver driver)
	{
		this.driver=driver;
	}

	public void addvacency()
	{
		WebElement add = driver.findElement(By.id("btnAdd"));
		add.click();
	}
	
	
	
}
