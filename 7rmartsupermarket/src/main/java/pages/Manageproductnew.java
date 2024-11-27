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
	public void clickmanageproductbutton() {
		manageproductbutton.click();
	}
	public void clicknewbutton()
	{
		newbutton.click();
	}
	public void clicktitlebutton(String titlefield)
	{
		title.sendKeys(titlefield);
	}
	public void clickproducttype()
	{
	  producttype.click();
	  producttype.isSelected();
	}
	
	public void clickcategorybutton() {
		category.click();
		Select select=new Select(category);
		  select.selectByVisibleText("Select");
	}
	public void clicksubcategory() {
		subcategory.click();
		Select select=new Select(subcategory);
		  select.selectByVisibleText("Select");
	}
	public void clickpricetype()
	{
	  pricetype.click();
	  pricetype.isSelected();
	}
	public void enterweightvalue(String weightvaluefield) {
		weightvalue.sendKeys(weightvaluefield);
	}
	public void enterweightunit(String weightunitfield) {
		weightunit.sendKeys(weightunitfield);
	}
	public void entermaxquantity(String maxquantityfield) {
		maxquantity.sendKeys(maxquantityfield);
	}
	public void enterprice(String pricefield) {
		price.sendKeys(pricefield);
	}
	public void enterstockavailability(String stockavailabilityfield) {
		stockavailability.sendKeys(stockavailabilityfield);
	}
	
	
	//public void clickimagebutton() {
		//image.click();
	//}
	
	public void clicksavebutton()
	{
		save.click();
	} 
	//public boolean isAlertload() {
		//return alert.isDisplayed();
	//}
	

}
