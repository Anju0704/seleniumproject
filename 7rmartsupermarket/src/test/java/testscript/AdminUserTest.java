package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import constant.Constant;
import pages.AdminUserPage;
import pages.Homepage;
import pages.Loginpage;
import utilities.ExcelUtilities;

public class AdminUserTest extends Base {
	Homepage home;
	AdminUserPage admin;
  @Test
  public void verifyuserisabletoaddadminuser() throws IOException {
	  String username=ExcelUtilities.getStringName(1, 0,"Loginpage");
	  String password=ExcelUtilities.getStringName(1, 1,"Loginpage");
	  Loginpage login=new Loginpage(driver);
	  login.enterUsernameField(username);
	  login.enterpasswordField(password);
	  home=login.clickSigninButton();
	  
	  String username1=ExcelUtilities.getStringName(1, 0,"Addadmin");
	  String password1=ExcelUtilities.getStringName(1, 1,"Addadmin");
	  admin=home.adminuserclick();
	  admin.clicknewbutton();
	  admin.usernameField(username1);
	  admin.passwordField(password1);
	  admin.clickusertypebutton();
	  admin.clicksavebutton();
	  
	  boolean isAlertloaded=admin.isAlertloaded();
	  assertTrue(isAlertloaded,Constant.ERRORMSG3);
			  
	  
  }
}