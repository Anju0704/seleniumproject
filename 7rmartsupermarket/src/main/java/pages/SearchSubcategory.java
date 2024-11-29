package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchSubcategory {
	public WebDriver driver;
	public SearchSubcategory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")WebElement searchbutton;
	@FindBy(xpath="//select[@class='form-control selectpicker']")WebElement category;
	@FindBy(xpath="//input[@placeholder='Sub Category']")WebElement subcategory;
	@FindBy(xpath="//button[@class='btn btn-danger btn-fix']")WebElement search;
	@FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']/tbody/tr[1]/td[1]")WebElement searchresult;
	public SearchSubcategory clicksearchbutton() {
		searchbutton.click();
		return this;
	}
	public SearchSubcategory clickcategorybutton()
	{
		category.click();
		Select select=new Select(category);
		  select.selectByValue("180");
		return this;
	}
	public SearchSubcategory entersubcategoryfield(String subcategoryfield) {
		subcategory.sendKeys(subcategoryfield);
		return this;
	}
	public SearchSubcategory clicksearchfield()
	{
		search.click();
		return this;
	} 
	public boolean isResultload()
	{
		return searchresult.isDisplayed();
	}

}
