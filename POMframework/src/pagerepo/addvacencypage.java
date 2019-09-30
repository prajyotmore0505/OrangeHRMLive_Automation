package pagerepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class addvacencypage {
	
	WebDriver driver;
	public addvacencypage(WebDriver driver)
	{
		this.driver=driver;
	}

		public void jobtitle()
	{
		WebElement dropdown = driver.findElement(By.id("addJobVacancy_jobTitle"));
		Select dropdowneleselect=new Select(dropdown);
		dropdowneleselect.selectByIndex(7);
		
//		dropdowneleselect.selectByValue("5");
//		dropdowneleselect.selectByVisibleText("IT Manager");
	}
	public void VacancyName()
	{
		driver.findElement(By.id("addJobVacancy_name")).sendKeys("Software Testing");
	}
	
	public void hiringManager()
	{
		driver.findElement(By.id("addJobVacancy_hiringManager")).sendKeys("pratik");
		
	
	}
	
	public void NumberPositions()
	{
		driver.findElement(By.id("addJobVacancy_noOfPositions")).sendKeys("50");
	}
	public void DeselectActivecheckbox()
	{
		WebElement checkbox = driver.findElement(By.id("addJobVacancy_status"));
		if(checkbox.isSelected()==true)
		{
			checkbox.click();
		}
	}

	
	public void selectedcheckbox()
	{
		WebElement checkbox = driver.findElement(By.id("addJobVacancy_status"));
		if(checkbox.isSelected()==false)
		{
			checkbox.click();
		}
	}
	
	public void SaveButton()
	{
		driver.findElement(By.id("btnSave")).click();
	}
	
}
