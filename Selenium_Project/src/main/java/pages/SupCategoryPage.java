package pages;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constants;
import utilities.FileUploadUtilities;
import utilities.PageUtility;

public class SupCategoryPage {
WebDriver driver;
public SupCategoryPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver , this);
}
 @FindBy(xpath="(//a[@href='https://groceryapp.uniqassosiates.com/admin/list-sub-category'][normalize-space()='More info'])[1]")private WebElement moreinfo;
 @FindBy(xpath="(//a[@class='btn btn-rounded btn-danger'])[1]")private WebElement newbutton;
 @FindBy(xpath="//select[@id='cat_id']")private WebElement dropdown;
 @FindBy(xpath="//input[@id='subcategory']")private WebElement textsub;
 @FindBy(xpath="//input[@id='main_img']")private WebElement uploadbutton;
 @FindBy(xpath="//button[normalize-space()='Save']")private WebElement savebutton;
 @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")private WebElement alert;
 
 public void subCatmorenfo()
 {
	 moreinfo.click(); 
 }
 public void newButton()
 {
	 newbutton.click(); 
 }
 public void selectCategory()
 {
	
	 PageUtility pageuti = new PageUtility();
	 pageuti.selectByIndex(dropdown, 1);
 }
 public void SubcatInput(String Catname)
 {
	 textsub.sendKeys(Catname);	 
 }
 public void imageupload() throws AWTException
 {
	 FileUploadUtilities fileutility = new FileUploadUtilities();
	 fileutility.fileuploadRobotClass(uploadbutton, Constants.ImageBall);
 }
 public void imageupload1()
 {
	 uploadbutton.sendKeys(Constants.ImageBall);  
 }
 public void save()
 {
	 savebutton.click(); 
 }
 public boolean isAlertDisplayed()
 {
 	return alert.isDisplayed();
 }
}
