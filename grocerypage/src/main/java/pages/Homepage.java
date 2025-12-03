package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	public WebDriver driver;
	
	public Homepage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath ="//img[@class='img-circle']") WebElement adminbutton;
	@FindBy(xpath="//a[contains(@href,'com/admin/logout')and @class='dropdown-item']") WebElement logoutbutton;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin']//i[@class='fas fa-arrow-circle-right']") WebElement moreinfo;
    @FindBy(xpath="//b[text()='7rmart supermarket']") WebElement titlepage;
	
	public void adminIconClick()
	{
		adminbutton.click();
	}
	public void logoutButtonClick()
	{
		logoutbutton.click();
	}
	public void moreInfoClick()
	{
		moreinfo.click();	
		
	}
	
	
	
	
	
}
