package testscript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import constant.Constant;
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
	
  	 admin=home.adminuserclick();
	  admin.clicknewbutton();
	  admin.usernameField("achu");
	 reset.clickreset();
	 
	 
	  boolean isResetloaded=reset.isResetloaded();
	  assertTrue(isResetloaded,Constant.ERRORMSG4);
	  
  }
  
 
}
