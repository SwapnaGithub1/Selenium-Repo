package testScript;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base {
@Test	
 public void manageNews() throws IOException
 {
	   String usernamevalue = "admin";
	   String passwordvalue="admin";
	   LoginPage loginpage = new LoginPage(driver);
	   loginpage.enterUsername(usernamevalue);
	   loginpage.enterPassword(passwordvalue);
	   loginpage.signin(); 
	   ManageNewsPage managenws = new ManageNewsPage(driver);
	   managenws.clickManagenews();
	   managenws.moreInfo();
	   managenws.newButon();
	   String news = ExcelUtility.getStringData(0, 0, "Managenews");
	   managenws.textField(news);
	   managenws.save();
	   
 }

}
