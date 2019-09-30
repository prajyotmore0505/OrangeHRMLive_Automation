package pagerepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrangeHRMmenu 
{
	WebDriver driver;
	public OrangeHRMmenu(WebDriver driver)
	{
		this.driver=driver;
	}
	public void recruitment()
	{
		WebElement recruitment=driver.findElement(By.id("menu_recruitment_viewRecruitmentModule"));
		recruitment.click();
		
		WebElement vacency=driver.findElement(By.id("menu_recruitment_viewJobVacancy"));
		vacency.click();
	}
//	public void vacency()
//	{
//		WebElement vacency=driver.findElement(By.id("menu_recruitment_viewJobVacancy"));
//		vacency.click();
//
//		
//	}
	
	
	
}
