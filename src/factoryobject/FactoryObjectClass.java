
package factoryobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FactoryObjectClass {
	WebDriver driver;

	public FactoryObjectClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(className="signin")
	WebElement login;

	@FindBy(id = "login1")
	WebElement username;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(name = "proceed")
	WebElement submit;
	
	@FindBy(className="rd_logout")
	WebElement signout;

	public WebElement click_signin() {
		return login;
	}

	public WebElement username() {
		return username;
	}

	public WebElement password() {
		return password;
	}

	public WebElement proceed() {
		return submit;
	}
	
	public WebElement logout()
	{
		return signout;
	}
	

}
