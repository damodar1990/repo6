package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomePage 
{
	WebDriver driver;
	
	
	public RediffHomePage(WebDriver driver) 
	{
		this.driver=driver;
	}


	By Enter=By.id("srchword");
	
	

	
	public WebElement search()
	{
		return driver.findElement(Enter);
	}
	

}
