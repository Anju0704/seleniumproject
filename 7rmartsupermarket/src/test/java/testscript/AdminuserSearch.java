package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.AdminUserPage;
import pages.Homepage;
import pages.Loginpage;
import pages.Adminusersearch;
import utilities.ExcelUtilities;

public class AdminuserSearch extends Base
{
	Homepage home;
	AdminUserPage admin;
	Adminusersearch search;
  @Test
  public void verifyuserisabletosearchadminuser() throws IOException {
String username=ExcelUtilities.getStringName(1, 0,"loginpage");
	  String password=ExcelUtilities.getStringName(1, 1,"loginpage");
	  /*LoginPage login=new LoginPage(driver);
	  login.enterUsernameField(username);
	  login.enterPasswordField(password);
	  home=login.clickLoginButton();*/
	  
	  //AdminUserPage admin=new AdminUserPage(driver);
	  admin=home.adminuserclick();
	  
	  String username2=ExcelUtilities.getStringName(1, 0,"Searchadmin");
//SearchAdminUser search=new SearchAdminUser(driver);
	  search.clicksearch();
	  search.enterusername(username2);
	  search.clicksearchbutton();
	  
	  boolean isResultloaded=search.isresultloaded();
	  assertTrue(isResultloaded,"Result not found");
  }
}

