package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adminusersearch {
	
		public WebDriver driver;
		public Adminusersearch(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")WebElement search;
		@FindBy(xpath="//input[@name='un']")WebElement username;
		@FindBy(xpath="//button[@name='Search']")WebElement searchbutton;
		@FindBy(xpath="table[@class='table table-bordered table-hover table-sm']/tbody/tr[1]/td[1]")WebElement searchresult;
		public Adminusersearch clicksearch() {
			search.click();
			return this;
			
		}
		public Adminusersearch enterusername(String usernamefield) {
			username.sendKeys(usernamefield);
			return this;
			
			
		}
		public Adminusersearch clicksearchbutton() {
			searchbutton.click();
			return this;
			
		}
		public boolean isresultloaded() {
			return searchresult.isDisplayed();
		}
		
		
		

}
