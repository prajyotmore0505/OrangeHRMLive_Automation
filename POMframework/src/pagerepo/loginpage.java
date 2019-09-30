package pagerepo;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage
{
	WebDriver driver;
	public loginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void Enterusername()
	{
		WebElement textboxusername=driver.findElement(By.id("txtUsername"));
		textboxusername.sendKeys("Admin");
		
	}
	public void Enterpassword()
	{
		WebElement password= driver.findElement(By.name("txtPassword"));
				password.sendKeys("admin123");
	}
	public void clicklogin()
	{
		WebElement login=driver.findElement(By.id("btnLogin"));
		login.click();
	}
/*	public void clicklogout()
	{
		WebElement welcome=driver.findElement(By.id("welcome"));
		welcome.click();
		WebElement logout=driver.findElement(By.linkText("Logout"));
		logout.click();*/
	}
