package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	public WebDriver driver;
	public Homepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath="//img[@class='img-circle']")WebElement admin;
	@FindBy(xpath="//i[@class='ace-icon fa fa-power-off']")WebElement logout;
	@FindBy(xpath="/html/body/div/div[1]/section/div/div/div[1]/div/a")WebElement adminuser;
	public AdminUserPage adminuserclick() {
		adminuser.click();
		return new AdminUserPage(driver);
	}
	public void clickAdminButton()
	{
		admin.click();
		
	}
	public void clickLogoutButton() {
		logout.click();
	}
	
	
	}
	


