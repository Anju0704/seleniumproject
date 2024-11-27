package testscript;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.Homepage;
import pages.Loginpage;


public class HomepageTest extends Base{
	Homepage home;
  @Test
  public void verifyuserisabletologout() {
	  Loginpage login=new Loginpage(driver);
	  login.enterUsernameField("admin");
	  login.enterpasswordField("admin");
	  home=login.clickSigninButton();
	  home.clickAdminButton();
	  home.clickLogoutButton();
	  
	/*  login.clickSigninButton();
	  Homepage home=new Homepage(driver);
	  home.clickAdminButton();
	  home.clickLogoutButton();*/
	  assertEquals(driver.getTitle(),"Login | 7rmart supermarket","Logout failed");
	  
	 
  }
  }

