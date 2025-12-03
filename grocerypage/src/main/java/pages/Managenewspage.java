package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Managenewspage {

	WebDriver driver;
	public Managenewspage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(@href,'https://groceryapp.uniqassosiates.com/admin/list-news') and @class='small-box-footer']") WebElement newsinfo;
    @FindBy(xpath="//a[contains(@class,'btn btn-rounded btn-danger')]//i[contains(@class,'fas fa-edit')]") WebElement newsnewbutton;
    @FindBy(xpath="//textarea[@id='news' and @name='news']") WebElement newscontent;
    @FindBy(xpath="//button[text()='Save']") WebElement newssavebutton;
	@FindBy(xpath="//a[contains(@class,'btn btn-rounded btn-primary')]") WebElement newssearch;
	@FindBy(xpath="//input[@class='form-control' and @type='text']") WebElement searchnewscontent;
	@FindBy(xpath="//button[@class='btn btn-danger btn-fix' and @type='submit']") WebElement searchnewspage;
	@FindBy(xpath="//h3[text()='Enter News Informations']") WebElement titlename;
	@FindBy(xpath="//h4[text()='Search Manage News']") WebElement newstitle;
	public void newsInfoButton()
	{
		newsinfo.click();
	}

	public void selectNewsNewButton()
	{
		newsnewbutton.click();
	}
	public void enterNewsContentInside(String newscontents)
	{
		newscontent.sendKeys(newscontents);
	}
    public void enterNewsSaveButton()
    {
    	newssavebutton.click();
    }
    public void enterNewsSearchButton()
    {
    	newssearch.click();
    }

    public void searchNewsContentBox(String searchnewscontentboxvalue)
    {
    	searchnewscontent.sendKeys(searchnewscontentboxvalue);	
    }
    public void searchNewsPageBox()
    {
    	searchnewspage.click();
    }
    public String isTitleDisplayed()
    {
    	return titlename.getText();
    }
    public String isNewsTitleDisplayed()
    {
    	return newstitle.getText();
    }
    
}
