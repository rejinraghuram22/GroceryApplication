package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import pages.Adminuserpage;
import pages.Homepage;
import pages.LoginPage;
import utility.Excelutility;
import utility.Randomdatautility;

public class Adminusertest extends Base {

	@Test
	
	public void insertingNewUserIntoSite() throws IOException
	{
		String groceryusernamevalue = Excelutility.readStringData(0, 0, "GrocerLogin");
		String grocerypasswordvalue = Excelutility.readStringData(0, 1, "GrocerLogin");
		LoginPage groceryloginpage = new LoginPage(driver);
		groceryloginpage.entergroceryusername(groceryusernamevalue);
		groceryloginpage.entergrocerypassword(grocerypasswordvalue);
		groceryloginpage.submitgroceryfield();
		Homepage groceryhomepage = new Homepage(driver);
		groceryhomepage.moreInfoClick();
		Randomdatautility randomdatautility = new Randomdatautility();
		String homeusername = randomdatautility.randomUsername();
		String homepassword = randomdatautility.randomPassword();
	    Adminuserpage adminuserpage = new Adminuserpage(driver);
		adminuserpage.performNewButtonClick();
		adminuserpage.enterUserNameFieldText(homeusername);
		adminuserpage.enterPasswordFieldText(homepassword);
		adminuserpage.selectDropdownOptions();
		adminuserpage.performSaveFunction();
		String actual = "Admin Users";
		String expected = adminuserpage.isTitleDisplayed();
		Assert.assertEquals(actual,expected,"User is unable to add news");
		
		
		
	}
	
	@Test
	
	public void searchAnUserBasedOnAdding() throws IOException
	{
          
		String groceryusernamevalue = Excelutility.readStringData(0, 0, "GrocerLogin");
		String grocerypasswordvalue = Excelutility.readStringData(0, 1, "GrocerLogin");
		LoginPage groceryloginpage = new LoginPage(driver);
		groceryloginpage.entergroceryusername(groceryusernamevalue);
		groceryloginpage.entergrocerypassword(grocerypasswordvalue);
		groceryloginpage.submitgroceryfield();
		Homepage groceryhomepage = new Homepage(driver);
		groceryhomepage.moreInfoClick();
		Adminuserpage adminuserpage = new Adminuserpage(driver);
		adminuserpage.performSearchFunction();
		String searchusernamevalue = Excelutility.readStringData(1, 0, "NewUser");
		adminuserpage.enterSearchUserName(searchusernamevalue);
		adminuserpage.selectUserTypeField();
		adminuserpage.selectSearchButtonBox();
		String actual = "Admin Users";
		String expected = adminuserpage.isTitleDisplayed();
		Assert.assertEquals(actual,expected,"User is unable to add news");
		
		}
	
	@Test
	
	public void reseTheUsersListTable() throws IOException
	{
		
		String groceryusernamevalue = Excelutility.readStringData(0, 0, "GrocerLogin");
		String grocerypasswordvalue = Excelutility.readStringData(0, 1, "GrocerLogin");
		LoginPage groceryloginpage = new LoginPage(driver);
		groceryloginpage.entergroceryusername(groceryusernamevalue);
		groceryloginpage.entergrocerypassword(grocerypasswordvalue);
		groceryloginpage.submitgroceryfield();
		Homepage groceryhomepage = new Homepage(driver);
		groceryhomepage.moreInfoClick();
		Adminuserpage adminuserpage = new Adminuserpage(driver);
		adminuserpage.selectResetButton();
		String actual = "Admin Users";
		String expected = adminuserpage.isTitleDisplayed();
		Assert.assertEquals(actual,expected,"User is unable to add news");
		
		
	}
	
}
