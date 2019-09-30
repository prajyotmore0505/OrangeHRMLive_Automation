package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import helper.browseroperations;
import pagerepo.Addvacency;
import pagerepo.OrangeHRMmenu;
import pagerepo.addvacencypage;
import pagerepo.loginpage;

public class Addvacencytest
{

	public static void main(String[] args) throws Exception 
	{
		
		browseroperations browseroperationsObj= new browseroperations();
		WebDriver driver=browseroperationsObj.LaunchApplication();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginpage lgobj=new loginpage(driver);
		lgobj.Enterusername();
		lgobj.Enterpassword();
		lgobj.clicklogin();
		Thread.sleep(4000);
		
		OrangeHRMmenu ohr = new OrangeHRMmenu(driver);
		ohr.recruitment();
		
		
		Addvacency add = new Addvacency(driver);
		add.addvacency();
		
		
		
		addvacencypage ap = new addvacencypage(driver);
		ap.jobtitle();
		ap.VacancyName();
		ap.hiringManager();
		ap.NumberPositions();
		ap.DeselectActivecheckbox();
		//ap.selectedcheckbox();
		ap.SaveButton();
		
		
		
		
		
		
	
	}

}
