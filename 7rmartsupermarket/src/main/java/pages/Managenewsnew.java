package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Managenewsnew {
	public WebDriver driver;
	public Managenewsnew(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newbutton;
	@FindBy(xpath="//textarea[@name='news']")WebElement news;
	@FindBy(xpath="//button[@type='submit']")WebElement save;
	@FindBy(xpath="//i[@class='icon fas fa-check']")WebElement alert;
	
	public  Managenewsnew clicknewbutton()
	{
		newbutton.click();
		return this;
	}
	public  Managenewsnew enternewsField(String newsfield) {
		news.sendKeys(newsfield);
		return this;
	}
	public  Managenewsnew clicksavebutton()
	{
		save.click();
		return this;
	} 
	public boolean isAlertload() {
		return alert.isDisplayed();
	}
	
	

}
