package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResetAdminUser {
	public WebDriver driver;
	public ResetAdminUser(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@class='btn btn-rounded btn-warning']")WebElement resetbutton;
	@FindBy(xpath="//section[@class='content']")WebElement resetresult;
public ResetAdminUser clickreset() {
	resetbutton.click();
	return this;
}
public boolean isResetloaded() {
	return resetresult.isDisplayed();
	
}
}
