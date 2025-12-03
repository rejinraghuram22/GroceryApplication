package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import pages.LoginPage;
import utility.Excelutility;

public class Logintest extends Base {
	
	@Test (priority=1,description = "User tying to login with valid credentials ",groups= {"smoke"})
	
	public void verifyGroceryLoginWithValidCredenttials() throws IOException
	{
		String groceryusernamevalue = Excelutility.readStringData(0, 0, "GrocerLogin");
		String grocerypasswordvalue = Excelutility.readStringData(0, 1, "GrocerLogin");
		LoginPage groceryloginpage = new LoginPage(driver);
		groceryloginpage.entergroceryusername(groceryusernamevalue);
		groceryloginpage.entergrocerypassword(grocerypasswordvalue);
		groceryloginpage.submitgroceryfield();
		Boolean adminuserdisplayed =  groceryloginpage.adminUserIsPresentOrNot();
		Assert.assertTrue(adminuserdisplayed,"User is unable to login with valid credentials");
		
	}
	
	@Test (priority=2, description = "User is trying to login with invalid username and valid password")
  public void verifyGroceryLoginWithInvalidUsername() throws IOException
  {
	    String groceryusernamevalue = Excelutility.readStringData(1, 0, "GrocerLogin");
		String grocerypasswordvalue = Excelutility.readStringData(1, 1, "GrocerLogin");
		LoginPage groceryloginpage = new LoginPage(driver);
		groceryloginpage.entergroceryusername(groceryusernamevalue);
		groceryloginpage.entergrocerypassword(grocerypasswordvalue);
		groceryloginpage.submitgroceryfield();
		String expected = "7rmart supermarket";
		String actual = groceryloginpage.isTitleDisplayed();
		Assert.assertEquals(actual,expected,"User is able to login with valid username");
  }
  
	@Test (priority=3)
  public void verifyGroceryLoginWithInvalidPassword() throws IOException
  {
	  String groceryusernamevalue = Excelutility.readStringData(2, 0, "GrocerLogin");
		String grocerypasswordvalue = Excelutility.readStringData(2, 1, "GrocerLogin");
		LoginPage groceryloginpage = new LoginPage(driver);
		groceryloginpage.entergroceryusername(groceryusernamevalue);
		groceryloginpage.entergrocerypassword(grocerypasswordvalue);
		groceryloginpage.submitgroceryfield();
	  
	  
  }
  
	@Test (priority=4,description="User trying to log in with invalid username and password",groups= {"smoke"})
  public void verifyGroceryLoginWithInvalidUsernamePassword() throws IOException
  {
	  
	  String groceryusernamevalue = Excelutility.readStringData(3, 0, "GrocerLogin");
		String grocerypasswordvalue = Excelutility.readStringData(3, 1, "GrocerLogin");
		LoginPage groceryloginpage = new LoginPage(driver);
		groceryloginpage.entergroceryusername(groceryusernamevalue);
		groceryloginpage.entergrocerypassword(grocerypasswordvalue);
		groceryloginpage.submitgroceryfield();
  }
  
}
