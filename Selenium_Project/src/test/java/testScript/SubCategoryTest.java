package testScript;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.SupCategoryPage;
import utilities.ExcelUtility;

public class SubCategoryTest extends Base {
 @Test
	public void SubCategory() throws IOException, AWTException
	{
	 String usernamevalue = ExcelUtility.getStringData(1, 0,"LoginPage");
	 String passwordvalue = ExcelUtility.getStringData(1, 1, "LoginPage");
	 LoginPage login = new LoginPage(driver);
	 login.enterUsername(usernamevalue);
	 login.enterPassword(passwordvalue);
	 login.signin();
	 SupCategoryPage subcat = new SupCategoryPage(driver);
	 subcat.subCatmorenfo();
	 subcat.newButton();
	 subcat.selectCategory();
	 String input = ExcelUtility.getStringData(0,0,"SubCategoryPage");
	 subcat.SubcatInput(input);
	 //String image1 = Constants.ImageBall;
	 subcat.imageupload();
	 subcat.save();
	 boolean isalertavailable = subcat.isAlertDisplayed();
	Assert.assertTrue(isalertavailable);
	 
	}
}
