package factorytestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import factoryobject.FactoryObjectClass;

public class FactoryLogin 
{
	@Test
	public void login_rediff() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Shubha\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com");
		FactoryObjectClass fc=new FactoryObjectClass(driver);
		fc.click_signin().click();
		Thread.sleep(3000);
		fc.username().sendKeys("damusept1990");
		fc.password().sendKeys("Damu@1990");
		fc.proceed().click();
		fc.logout().click();
	}

}
