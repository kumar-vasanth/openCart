package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	public HomePage(WebDriver driver)
	{
		super(driver);
		// super keyword will directly call the parent class constructor 
	}
	
	//By xpath we should find elements and we use annotation directly it will 
	// gives  webelememnt values 
	
@FindBy(xpath="//span[normalize-space()='My Account']") 
WebElement lnkMyaccount;

@FindBy(xpath="//a[normalize-space()='Register']") 
WebElement lnkRegister;

@FindBy(linkText = "Login")   // Login link added in step5
WebElement linkLogin;

// For action we should seperate method for each action

public void clickMyAccount()
{
	lnkMyaccount.click();
}

public void clickRegister()
{
	lnkRegister.click();
}

public void clickLogin()    // added in step5
{
	linkLogin.click();
}


}
