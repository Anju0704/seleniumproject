package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import constant.Constant;
import utilities.FileUploadUtility;
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
	public Subcategorynew clicksubcategorybutton() {
		subcategorybutton.click();
		return this;
	}
	public Subcategorynew clicknewbutton()
	{
		newbutton.click();
		return this;
	}
	public Subcategorynew clickcategorybutton() {
		PageUtilities page=new PageUtilities();
		page.selectByVisibleText(category, "Apple");
		category.click();
		Select select=new Select(category);
		  select.selectByValue("247");
		return this;
	}
	public Subcategorynew clicksubcategory(String subcategoryfield) {
		subcategory.sendKeys(subcategoryfield);
		return this;
	}
	public void imagefileupload() {
	FileUploadUtility fileupload=new FileUploadUtility();
	fileupload.sendkeysfileupload(image, Constant.Tomatoimg);
	
	}
	public Subcategorynew clicksavebutton()
	{
		save.click();
		return this;
	} 
	public boolean isAlertload() {
		return alert.isDisplayed();
	}
	

}

