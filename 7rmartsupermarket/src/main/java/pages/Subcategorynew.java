package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtilities;

public class Subcategorynew {
	public WebDriver driver;
	public Subcategorynew(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="/html/body/div/div[1]/section/div/div/div[4]/div/a")WebElement subcategorybutton;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newbutton;
	@FindBy(xpath="//select[@id='cat_id']")WebElement category;
	@FindBy(xpath="//input[@id='subcategory']")WebElement subcategory;
	@FindBy(xpath="//input[@name='main_img']")WebElement image;
	@FindBy(xpath="//button[@name='create']")WebElement save;
	@FindBy(xpath="//i[@class='icon fas fa-check']")WebElement alert;
	public void clicksubcategorybutton() {
		subcategorybutton.click();
	}
	public void clicknewbutton()
	{
		newbutton.click();
	}
	public void clickcategorybutton() {
		PageUtilities page=new PageUtilities();
		page.selectByVisibleText(category, "Apple");
		category.click();
		//Select select=new Select(category);
		  //select.selectByValue("247");
	}
	public void clicksubcategory(String subcategoryfield) {
		subcategory.sendKeys(subcategoryfield);
	}
	//public void clickimagebutton() {
		//image.click();
	//}
	public void clicksavebutton()
	{
		save.click();
	} 
	public boolean isAlertload() {
		return alert.isDisplayed();
	}
	

}

