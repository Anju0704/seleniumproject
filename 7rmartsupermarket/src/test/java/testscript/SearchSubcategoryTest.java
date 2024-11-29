package testscript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import constant.Constant;
import pages.Homepage;
import pages.Loginpage;
import pages.SearchSubcategory;
import pages.Subcategorynew;

public class SearchSubcategoryTest extends Base{
	Homepage home;
	Subcategorynew sub;
	SearchSubcategory  search;
  @Test
  public void verifyuserisabletosearchsubcategory() {
	  Loginpage login=new Loginpage(driver);
  	  login.enterUsernameField("admin");
  	  login.enterpasswordField("admin");
  	  home=login.clickSigninButton();
  	  sub=home.clicksubcategorybutton();
  	  search.clicksearchbutton();
  	  search.clickcategorybutton();
  	  search.entersubcategoryfield("Carrot");
  	  search.clicksearchfield();
	  
  	boolean isResultloaded=search.isResultload();
	  assertTrue(isResultloaded,Constant.ERRORMSG7);
  }
}
