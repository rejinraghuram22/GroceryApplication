package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import automationcore.Base;
import pages.Homepage;
import pages.LoginPage;
import utility.Excelutility;

public class Hometest extends Base {

	@Test
	
	public void verifyGroceryLoginWithValidCredenttials() throws IOException
	{
		String groceryusernamevalue = Excelutility.readStringData(0, 0, "GrocerLogin");
		String grocerypasswordvalue = Excelutility.readStringData(0, 1, "GrocerLogin");
		LoginPage groceryloginpage = new LoginPage(driver);
		groceryloginpage.entergroceryusername(groceryusernamevalue);
		groceryloginpage.entergrocerypassword(grocerypasswordvalue);
		groceryloginpage.submitgroceryfield();
		Homepage groceryhomepage = new Homepage(driver);
		groceryhomepage.adminIconClick();
		groceryhomepage.logoutButtonClick();
		
		
		
	}
	
}
