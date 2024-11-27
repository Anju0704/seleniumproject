package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.Loginpage;
import pages.Managenewsnew;
import utilities.ExcelUtilities;

public class ManagenewsTest extends Base{
  @Test(retryAnalyzer = retry.Retry.class)
  public void verifyuserisabletonewmanagenews() throws IOException {
	  String username=ExcelUtilities.getStringName(1, 0, "loginpage");
	  String password=ExcelUtilities.getStringName(1, 1, "loginpage");
	  Loginpage login=new Loginpage(driver);
  	  login.enterUsernameField("admin");
  	  login.enterpasswordField("admin");
  	  login.clickSigninButton();
  	 String newsfield=ExcelUtilities.getStringName(1, 0, "managenews");
	  
  	Managenewsnew manage=new Managenewsnew(driver);
  	manage.clickmanagenewsbutton();
  	manage.clicknewbutton();
  	manage.enternewsField(newsfield);
  	manage.clicksavebutton();
  	boolean isAlertloaded=manage.isAlertload();
  	assertTrue(isAlertloaded,"not displayed alert");
  }
}
