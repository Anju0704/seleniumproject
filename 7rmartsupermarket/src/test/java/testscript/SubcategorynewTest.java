package testscript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import constant.Constant;
import pages.Homepage;
import pages.Loginpage;
import pages.Subcategorynew;

public class SubcategorynewTest extends Base {
	Homepage home;
	Subcategorynew sub;
  @Test
  public void verifyuserisabletonewsubcategory() {
	  Loginpage login=new Loginpage(driver);
  	  login.enterUsernameField("admin");
  	  login.enterpasswordField("admin");
  	  home=login.clickSigninButton();
  	  sub=home.clicksubcategorybutton();
  	  sub.clicknewbutton();
	  sub.clickcategorybutton();
	  sub.clicksubcategory("Tomato");
	  sub.clicksavebutton();
  	  
  	boolean isAlertloaded=sub.isAlertload();
  	assertTrue(isAlertloaded,Constant.ERRORMSG6);
  	 
  	  
  }
}
