package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import pages.LoginPage;
import pages.Managenewspage;
import utility.Excelutility;




public class Managenewstest extends Base {

	@Test
	
	public void addContentsToNewsPage() throws IOException
	{
		String groceryusernamevalue = Excelutility.readStringData(0, 0, "GrocerLogin");
		String grocerypasswordvalue = Excelutility.readStringData(0, 1, "GrocerLogin");
		LoginPage groceryloginpage = new LoginPage(driver);
		groceryloginpage.entergroceryusername(groceryusernamevalue);
		groceryloginpage.entergrocerypassword(grocerypasswordvalue);
		groceryloginpage.submitgroceryfield();
		Managenewspage managenewspage = new Managenewspage(driver);
		managenewspage.newsInfoButton();
		managenewspage.selectNewsNewButton();
		String newscontents = Excelutility.readStringData(0, 0, "NewsWriting");
		managenewspage.enterNewsContentInside(newscontents);
		managenewspage.enterNewsSaveButton();
		String actual = "Enter News Informations";
		String expected = managenewspage.isTitleDisplayed();
		Assert.assertEquals(actual,expected,"User is unable to add news");
		
	
	}
	
	@Test
	
	public void addSearchNews() throws IOException 
	{
		String groceryusernamevalue = Excelutility.readStringData(0, 0, "GrocerLogin");
		String grocerypasswordvalue = Excelutility.readStringData(0, 1, "GrocerLogin");
		LoginPage groceryloginpage = new LoginPage(driver);
		groceryloginpage.entergroceryusername(groceryusernamevalue);
		groceryloginpage.entergrocerypassword(grocerypasswordvalue);
		groceryloginpage.submitgroceryfield();
		Managenewspage managenewspage = new Managenewspage(driver);
		managenewspage.newsInfoButton();
		String searchnewscontentboxvalue = Excelutility.readStringData(1, 0, "NewsWriting");
		managenewspage.enterNewsSearchButton();
		managenewspage.searchNewsContentBox(searchnewscontentboxvalue);
		managenewspage.searchNewsPageBox();
		String actual = "Search Manage News";
		String expected = managenewspage.isNewsTitleDisplayed();
		Assert.assertEquals(actual,expected,"User is unable to reach the newspage");
		
	}
	
	
}
