package testscript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.AdminUserPage;
import pages.Adminusersearch;
import pages.Homepage;
import pages.Loginpage;
import pages.ResetAdminUser;

public class ResetadminuserTest extends Base{
	Homepage home;
	AdminUserPage admin;
	Adminusersearch search;
	ResetAdminUser reset;
	@Test
  public void verifyuserisabletoreset() {
	/*  Loginpage login=new Loginpage(driver);
  	  login.enterUsernameField("admin");
  	  login.enterpasswordField("admin");
  home=login.clickSigninButton();*/
  //	AdminUserPage admin=new AdminUserPage(driver);
  	 admin=home.adminuserclick();
	  admin.clicknewbutton();
	  admin.usernameField("achu");
	  //ResetAdminUser reset=new ResetAdminUser(driver);
	  reset.clickreset();
	  boolean isResetloaded=reset.isResetloaded();
	  assertTrue(isResetloaded,"no result found");
	  
  }
  
 
}
