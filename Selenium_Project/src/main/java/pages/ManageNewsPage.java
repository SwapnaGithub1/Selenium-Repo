package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {
 WebDriver driver;
	public ManageNewsPage(WebDriver driver)
	{
	  this.driver=driver;
	  PageFactory.initElements(driver , this);
	}
	
	@FindBy(xpath="//div[@class='inner']//p[contains(text(),'Manage News')]")private WebElement managenews;
	@FindBy(xpath="(//i[@class='fas fa-arrow-circle-right'])[9]") private WebElement moreinfo;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") private WebElement newButton;
	@FindBy(xpath="//textarea[@id='news']")private WebElement textfield;
	@FindBy(xpath="//button[normalize-space()='Save']")private WebElement savebutton;

public void clickManagenews()	
{
	managenews.click();	
}
public void moreInfo()
{
	moreinfo.click();	
}
public void newButon()
{
 newButton.click();	
}
public void textField(String news)
{
	textfield.sendKeys(news);	 
}
public void save()
{
	savebutton.click();	
}
	
	
	

}
