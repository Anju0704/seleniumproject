package testscript;

import org.testng.annotations.Test;

import pages.Loginpage;
import pages.SearchSubcategory;
import pages.Subcategorynew;

public class SearchSubcategoryTest extends Base{
  @Test
  public void verifyuserisabletosearchsubcategory() {
	  Loginpage login=new Loginpage(driver);
  	  login.enterUsernameField("admin");
  	  login.enterpasswordField("admin");
  	  login.clickSigninButton();
  	  
  	Subcategorynew sub=new Subcategorynew(driver);
	  sub.clicksubcategorybutton();
	  
  	SearchSubcategory  search=new SearchSubcategory(driver);
  	search.clicksearchbutton();
  	search.clickcategorybutton();
  	search.entersubcategoryfield("Carrot");
  	search.clicksearchfield();
  }
}
