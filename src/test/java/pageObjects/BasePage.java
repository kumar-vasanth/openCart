package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

	WebDriver driver;

	public BasePage(WebDriver driver)
	{
		this.driver = driver;
		
		// this takes the class level driver variable 
		//normal driver represents the constructor parameter value
		// when calling constructor we should provide values that is taken to
		// normal driver.
		PageFactory.initElements(driver, this);
	}

}
