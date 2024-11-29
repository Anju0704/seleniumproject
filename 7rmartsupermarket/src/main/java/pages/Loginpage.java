package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class Loginpage {
public	 WebDriver driver;
	public Loginpage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@placeholder='Username']")WebElement username;
	@FindBy(xpath="//input[@placeholder='Password']")WebElement password;
	@FindBy(xpath="//button[@type='submit']")WebElement signin;
	@FindBy(xpath="//p[text()='Dashboard']")WebElement dashboard;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")WebElement alert;
	
	public Loginpage enterUsernameField(String usernamefield)
	{
		username.sendKeys(usernamefield);
		return this;
	}
	public Loginpage enterpasswordField(String passwordfield)
	{
		password.sendKeys(passwordfield);
		return this;
	}
	public Homepage clickSigninButton()
	{
		WaitUtility wait=new WaitUtility();
		wait.waitForVisibilityOfElementLocated(driver, signin);
		signin.click();
		return new Homepage(driver);
	}
	public boolean isDashboardload()
	 {
		 return dashboard.isDisplayed();
	 }
	public boolean isAlertloaded() {
		return alert.isDisplayed();
	}
	

}
