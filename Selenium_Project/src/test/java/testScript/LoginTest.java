package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {
@Test(description ="Verify whether the user is able to login with correct credentials",retryAnalyzer=retry.Retry.class, groups ={"Regression"}) 
	public void verifyLoginWithValidCredentials() throws IOException
 {
   String usernamevalue = ExcelUtility.getStringData(1, 0, "LoginPage");
   String passwordvalue = ExcelUtility.getStringData(1, 1, "LoginPage");
   LoginPage loginpage = new LoginPage(driver);
   loginpage.enterUsername(usernamevalue);
   loginpage.enterPassword(passwordvalue);
   loginpage.signin();
  boolean isHomepageavailable =  loginpage.isHomePageloaded();
  //how we know that this line executed?
  Assert.assertTrue(isHomepageavailable);
 }
@Test
public void loginWrong1() throws IOException
{
	//String usernamevalue = "admin";
	//String passwordvalue = "swap";
	String usernamevalue = ExcelUtility.getStringData(2, 0,"LoginPage");
	String passwordvalue = ExcelUtility.getStringData(2, 1, "LoginPage");
	LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUsername(usernamevalue);
	loginpage.enterPassword(passwordvalue);
	loginpage.signin();
	boolean isalertavailable = loginpage.isAlertDisplayed();
	Assert.assertTrue(isalertavailable);
	
}
@Test
public void loginWrong2() throws IOException
{
	//String usernamevalue = "admn";
	//String passwordvalue = "admin";
	String usernamevalue = ExcelUtility.getStringData(3, 0, "LoginPage");
	String passwordvalue = ExcelUtility.getStringData(3, 1,"LoginPage");
	LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUsername(usernamevalue);
	loginpage.enterPassword(passwordvalue);
	loginpage.signin();
	boolean isalertavailable = loginpage.isAlertDisplayed();
	Assert.assertTrue(isalertavailable);
 	
}
@Test
public void loginWrong3() throws IOException
{
	//String usernamevalue = "admn";
	//String passwordvalue = "admn";
	String usernamevalue = ExcelUtility.getStringData(4, 0, "LoginPage");
	String passwordvalue = ExcelUtility.getStringData(4, 1,"LoginPage");
	LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUsername(usernamevalue);
	loginpage.enterPassword(passwordvalue);
	loginpage.signin();
	boolean isalertavailable = loginpage.isAlertDisplayed();
	Assert.assertTrue(isalertavailable);
}

}
