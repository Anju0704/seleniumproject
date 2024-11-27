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
	@FindBy(xpath="/html/body/div/div[1]/section/div/div/div[9]/div/a")WebElement managenews;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newbutton;
	@FindBy(xpath="//textarea[@name='news']")WebElement news;
	@FindBy(xpath="//button[@type='submit']")WebElement save;
	@FindBy(xpath="//i[@class='icon fas fa-check']")WebElement alert;
	public void clickmanagenewsbutton() {
		managenews.click();
	}
	public void clicknewbutton()
	{
		newbutton.click();
	}
	public void enternewsField(String newsfield) {
		news.sendKeys(newsfield);
	}
	public void clicksavebutton()
	{
		save.click();
	} 
	public boolean isAlertload() {
		return alert.isDisplayed();
	}
	
	

}
