package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffLoginPage
{
	
	WebDriver driver;

	
	public RediffLoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	By username=By.id("login1");
	By Password=By.name("passwd");
	By go=By.name("proceed");
	By skip=By.className("skiplink");
	
 public WebElement EmailId()
 {
	 return driver.findElement(username);
 }
 
 public WebElement Password()
 {
	 return driver.findElement(Password);
 }
 
 public WebElement submit()
 {
	 return driver.findElement(go);
 }
 
 public WebElement skip_link()
 {
	 return driver.findElement(skip);
 }
}
