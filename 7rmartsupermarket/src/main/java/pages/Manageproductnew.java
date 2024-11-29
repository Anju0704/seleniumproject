 package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Manageproductnew {
	public WebDriver driver;
	public Manageproductnew(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="/html/body/div/div[1]/section/div/div/div[8]/div/a")WebElement manageproductbutton;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newbutton;
	@FindBy(xpath="//input[@placeholder='Enter the Title']")WebElement title;
	@FindBy(xpath="//input[@value='Veg']")WebElement producttype;
	@FindBy(xpath="//select[@id='cat_id']")WebElement category;
	@FindBy(xpath="//select[@id='sub_id']")WebElement subcategory;
	@FindBy(xpath="//input[@value='weight']")WebElement pricetype;
	@FindBy(xpath="//input[@id='m_weight']")WebElement weightvalue;
	@FindBy(xpath="//select[@id='w_unit']")WebElement weightunit;
	@FindBy(xpath="//input[@id='max_weight']")WebElement maxquantity ;
	@FindBy(xpath="//input[@id='w_price']")WebElement price;
	@FindBy(xpath="//input[@name='w_stock']")WebElement stockavailability;
	@FindBy(xpath="//button[@type='submit']")WebElement save;
	@FindBy(xpath="//i[@class='icon fas fa-check']")WebElement alert;
	public Manageproductnew clickmanageproductbutton() {
		manageproductbutton.click();
		return this;
	}
	public Manageproductnew clicknewbutton()
	{
		newbutton.click();
		return this;
	}
	public Manageproductnew clicktitlebutton(String titlefield)
	{
		title.sendKeys(titlefield);
		return this;
	}
	public Manageproductnew clickproducttype()
	{
	  producttype.click();
	  producttype.isSelected();
	return this;
	}
	
	public Manageproductnew clickcategorybutton() {
		category.click();
		Select select=new Select(category);
		  select.selectByVisibleText("Select");
		return this;
	}
	public Manageproductnew clicksubcategory() {
		subcategory.click();
		Select select=new Select(subcategory);
		  select.selectByVisibleText("Select");
		return this;
	}
	public Manageproductnew clickpricetype()
	{
	  pricetype.click();
	  pricetype.isSelected();
	return this;
	}
	public Manageproductnew enterweightvalue(String weightvaluefield) {
		weightvalue.sendKeys(weightvaluefield);
		return this;
	}
	public Manageproductnew enterweightunit(String weightunitfield) {
		weightunit.sendKeys(weightunitfield);
		return this;
	}
	public Manageproductnew entermaxquantity(String maxquantityfield) {
		maxquantity.sendKeys(maxquantityfield);
		return this;
	}
	public Manageproductnew enterprice(String pricefield) {
		price.sendKeys(pricefield);
		return this;
	}
	public Manageproductnew enterstockavailability(String stockavailabilityfield) {
		stockavailability.sendKeys(stockavailabilityfield);
		return this;
	}
	
	public Manageproductnew clicksavebutton()
	{
		save.click();
		return this;
	} 
	public boolean isAlertload() {
		return alert.isDisplayed();
	}
	

}
