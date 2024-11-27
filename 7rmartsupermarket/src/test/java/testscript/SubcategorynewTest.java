package testscript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.Loginpage;
import pages.Subcategorynew;

public class SubcategorynewTest extends Base {
  @Test
  public void verifyuserisabletonewsubcategory() {
	  Loginpage login=new Loginpage(driver);
  	  login.enterUsernameField("admin");
  	  login.enterpasswordField("admin");
  	  login.clickSigninButton();
  	  
  	  
  	  Subcategorynew sub=new Subcategorynew(driver);
  	  sub.clicksubcategorybutton();
  	  sub.clicknewbutton();
  	  sub.clickcategorybutton();
  	  sub.clicksubcategory("Carrot");
  	  //sub.clickimagebutton();
  	  sub.clicksavebutton();
  	boolean isAlertloaded=sub.isAlertload();
  	assertTrue(isAlertloaded,"not displayed alert");
  	 
  	  
  }
}
