package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.RediffHomePage;
import objectrepository.RediffLoginPage;

public class Loginapplication 
{


	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shubha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLoginPage rd=new RediffLoginPage(driver);
		rd.EmailId().sendKeys("damusept1990");
		rd.Password().sendKeys("Damu@");
		rd.submit().click();
		rd.skip_link().click();
		RediffHomePage rh=new RediffHomePage(driver);
		rh.search().sendKeys("hello");
		
	}
}
