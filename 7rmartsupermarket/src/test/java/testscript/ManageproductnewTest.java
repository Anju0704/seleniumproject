package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import constant.Constant;
import pages.Homepage;
import pages.Loginpage;
import pages.Manageproductnew;
import utilities.ExcelUtilities;

public class ManageproductnewTest extends Base{
	Homepage home;
	Manageproductnew product;
  @Test
  @Parameters({"title"," weightvalue","weightunit","maxquantity","price","stockavailability"})
  public void verifyuserisabletoaddnewmanageproduct(String title, String weightvalue, String weightunit, String maxquantity, String price, String stockavailability) throws IOException {
	   Loginpage login=new Loginpage(driver);
  	  login.enterUsernameField("admin");
  	  login.enterpasswordField("admin");
  	  home=login.clickSigninButton();
  	  product=home.clickmanageproductbutton(); 
  	  product.clicknewbutton();
  	  product.clicktitlebutton(title);
  	  product.clickproducttype();
  	  product.clickcategorybutton();
  	  product.clicksubcategory();
  	  product.clickpricetype();
  	  product.enterweightvalue(weightvalue);
  	  product.enterweightunit(weightunit);
  	  product.entermaxquantity(maxquantity);
  	  product.enterprice(price);
  	  product.enterstockavailability(stockavailability);
      product.clicksavebutton();
      
      boolean isAlertloaded=product.isAlertload();
	  assertTrue(isAlertloaded,Constant.ERRORMSG3);
  }
}
