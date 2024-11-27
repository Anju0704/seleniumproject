package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.Loginpage;
import pages.Manageproductnew;
import utilities.ExcelUtilities;

public class ManageproductnewTest extends Base{
  @Test
  public void verifyuserisabletoaddnewmanageproduct() throws IOException {
	  //String title=ExcelUtilities.getStringName(1, 0, "addproduct");
		// String weightvalue=ExcelUtilities.getStringName(1, 1, "addproduct");
		 //String weightunit=ExcelUtilities.getStringName(1, 2, "addproduct");
		// String maxquantity=ExcelUtilities.getStringName(1, 3, "addproduct");
		// String price=ExcelUtilities.getStringName(1, 4, "addproduct");
		// String stockavailability=ExcelUtilities.getStringName(1, 5, "addproduct");
	  //String username=ExcelUtilities.getStringName(1, 0, "loginpage");
	//String password=ExcelUtilities.getStringName(1, 1, "loginpage");
	
	  Loginpage login=new Loginpage(driver);
  	  login.enterUsernameField("admin");
  	  login.enterpasswordField("admin");
  	  login.clickSigninButton();
  	  
  	  
  	
  	 Manageproductnew product=new Manageproductnew(driver);
  	  product.clickmanageproductbutton();
  	  product.clicknewbutton();
  	  product.clicktitlebutton("Apple");
  	product.clickproducttype();
  	product.clickcategorybutton();
  	  product.clicksubcategory();
  	  product.clickpricetype();
  	 product.enterweightvalue("500");
  	 product.enterweightunit("g");
  	 product.entermaxquantity("3");
  	 product.enterprice("100");
  	 product.enterstockavailability("3");
  
  	  product.clicksavebutton();
  }
}
