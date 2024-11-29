package testscript;
import static org.testng.Assert.assertTrue;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import constant.Constant;
import pages.Loginpage;
import utilities.ExcelUtilities;
 
public class LoginPageTest extends Base{
	@DataProvider(name="credentials")
	  public Object[][]testData(){//dataprovider
		  Object[][]input=new Object[2][2];
		  input[0][0]="admin";
		  input[0][1]="admin";
		  input[1][0]="admin@123";
		  input[1][1]="admin123";
		  return input;
		  
	  }
	
  @Test(dataProvider = "credentials")
  
  public void verifyuserisabletologinvalidcredentials(String username,String password) throws IOException {
	  Loginpage login=new Loginpage(driver);
	  login.enterUsernameField(username);
	  login.enterpasswordField(password);
	  login.clickSigninButton();
	  boolean isdashboardloaded=login.isDashboardload();
	   assertTrue(isdashboardloaded,Constant.ERRORMSG);
  }
  
	   @Test
	  @Parameters({"username","password"})
	  public void verifyuserisabletologininvalidusername(String username,String password) {
	  	  Loginpage login=new Loginpage(driver);
	  	  login.enterUsernameField(username);
	  	  login.enterpasswordField(password);
	  	  login.clickSigninButton();
	  	boolean isAlertloaded=login.isAlertloaded();
		  assertTrue(isAlertloaded,Constant.ERRORMSG2);
	    }
  
	  	  @Test  (groups = {"smoke"})
	  	  public void verifyuserisabletologininvalidpassword() {
	  		  Loginpage login=new Loginpage(driver);
	  		  login.enterUsernameField("admin");
	  		  login.enterpasswordField("admin11");
	  		  login.clickSigninButton();
	  		boolean isAlertloaded=login.isAlertloaded();
			  assertTrue(isAlertloaded,Constant.ERRORMSG2);
	  		   
	  	  }
  
	  	  @Test(groups = {"smoke"})
	  		  public void verifyuserisabletologininvalidcredentials() {
		  		  Loginpage login=new Loginpage(driver);
		  		  login.enterUsernameField("admin11");
		  		  login.enterpasswordField("admin@");
		  		  login.clickSigninButton();
		  		boolean isAlertloaded=login.isAlertloaded();
				  assertTrue(isAlertloaded,Constant.ERRORMSG2);
		  		
	  		
	
  } 
}
