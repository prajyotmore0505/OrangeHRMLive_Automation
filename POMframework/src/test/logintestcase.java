package test;

import org.openqa.selenium.WebDriver;

import helper.browseroperations;
import pagerepo.dashboardpage;
import pagerepo.loginpage;

public class logintestcase {

	public static void main(String[] args) 
	{
		//1.Launch application
		browseroperations browseroperationsObj= new browseroperations();
		WebDriver driver=browseroperationsObj.LaunchApplication();
		
		//2.verify application is launched sucessfully
		//verify title is orangeHRM
		
		String actualTitle=browseroperationsObj.GettitleofBrowser();   //obj of browseroperationsobj.gettitle will check the title of browser and convert in string variable
		//String title="OrangeHRM";
		System.out.println(actualTitle);
		if(actualTitle.equals("OrangeHRM"))		//check the condition by using .equals 
		{
			System.out.println("Launch successfully");
		}
		loginpage lgobj = new loginpage(driver);
		lgobj.Enterusername();
		lgobj.Enterpassword();
		lgobj.clicklogin();
//		lgobj.clicklogout();
	
		dashboardpage dbpage=new dashboardpage(driver);
		boolean resdis=dbpage.getusernamelink();
		if(resdis==true)
		{
			System.out.println("verification is true");
		}
		else
		{
			System.out.println("not verified");
		}
		
		String textdis=dbpage.getusernametext();
		if(textdis.contains("Welcome Admin"))
		{
			System.out.println("username is login successfull");
		}
		else
		{
			System.out.println("username is not login");
		}
		}
		
		
	}


