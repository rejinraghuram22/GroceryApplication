package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Adminuserpage {
	
	public WebDriver driver;
	

	public Adminuserpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='javascript:void(0)']//i[@class='fas fa-edit']") WebElement newbutton;
	@FindBy(xpath="//input[@id='username']") WebElement usernamefield;
	@FindBy(xpath="//input[@id='password']") WebElement passwordfield;
	@FindBy(xpath="//select[@id='user_type']") WebElement usertypefield;
	@FindBy(xpath="//button[@type='submit' and @name='Create']") WebElement savebutton;
	@FindBy(xpath="//a[@href='javascript:void(0)']//i[contains(@class,' fa fa-search')]") WebElement searchbutton;
	@FindBy(xpath="//input[@id='un']") WebElement searchusername;
	@FindBy(xpath="//select[@id='ut']") WebElement usertypefieldsearch;
	@FindBy(xpath="//button[@type='submit' and @name='Search']") WebElement searchbuttonbox;
	@FindBy(xpath="//a[contains(@class,'btn btn-rounded btn-warning')]") WebElement resetbutton;
	@FindBy(xpath="//h1[text()='Admin Users']") WebElement admintitlepage;
	
	
	public void performNewButtonClick()
	{
		newbutton.click();
	}
	
	public void enterUserNameFieldText(String homeusername)
	{
		usernamefield.sendKeys(homeusername);
	}
	public void enterPasswordFieldText(String homepassword)
	{
		passwordfield.sendKeys(homepassword);
	}
	public void selectDropdownOptions()
	{
		Select s = new Select(usertypefield);
		s.selectByValue("partner");
	}
	public void performSaveFunction()
	{
		savebutton.click();
	}
	public void performSearchFunction()
	{
		searchbutton.click();
	}
	public void enterSearchUserName(String searchusernamevalue)
	{
		searchusername.sendKeys(searchusernamevalue);
	}
	public void selectUserTypeField()
	{
		Select se = new Select(usertypefieldsearch);
		se.selectByVisibleText("Admin");
	}
	public void selectSearchButtonBox()
	{
		searchbuttonbox.click();	
	}
	public void selectResetButton()
	{
		resetbutton.click();
	}
	 public String isTitleDisplayed()
	    {
	    	return admintitlepage.getText();
	    }
	
}
