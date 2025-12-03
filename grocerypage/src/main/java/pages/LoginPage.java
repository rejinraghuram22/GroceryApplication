package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(name="username") WebElement groceryusername;
	@FindBy(name="password") WebElement grocerypassword;
	@FindBy(xpath = "//button[text()='Sign In']") WebElement grocerysubmit;
	@FindBy(xpath ="//p[text()='Admin Users']") WebElement adminuser;
	@FindBy(xpath="//b[text()='7rmart supermarket']") WebElement titlelogin;
	
	public void entergroceryusername(String groceryusernamevalue)
	{
		groceryusername.sendKeys(groceryusernamevalue);

	}
	 
	public void entergrocerypassword(String grocerypasswordvalue)
	{
		grocerypassword.sendKeys(grocerypasswordvalue);
	}
	
	public void submitgroceryfield()
	{
		grocerysubmit.click();
		
	}
	
	public boolean adminUserIsPresentOrNot()
	{
		return adminuser.isDisplayed();	
		
	}
	public String isTitleDisplayed()
	{
		return titlelogin.getText();
	}
	
	
}
