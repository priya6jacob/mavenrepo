package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import utility.ExcelUtility;

public class LoginTest extends Base {
	public HomePage home;

	@Test(dataProvider = "credentials")

	public void verifyuserisabletologinwithvalidusernameandpassword(String username, String password)
			throws IOException {
		String username1 = ExcelUtility.getStringData(4, 0, "LoginPage");
		String password1 = ExcelUtility.getStringData(4, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterusernameandpassword(username1, password1);
		home = loginpage.clicksigninbutton();
		boolean isdashboardisloaded = loginpage.isdashboardisdisplayed();
		Assert.assertTrue(isdashboardisloaded, Constant.ERROR_MESSAGE_Loginwithvalidcredentials);

	}

	@DataProvider(name = "credentials")
	public Object[][] testdata() {
		Object data[][] = { { "admin", "admin" } };
		return data;
	}

	@Test
	@Parameters({ "username", "password" })
	public void verifyuserisabletologinwithvalidusernameandinvalidpassword(String username, String password)
			throws IOException {
		String username1 = ExcelUtility.getStringData(3, 0, "LoginPage");
		String password1 = ExcelUtility.getStringData(3, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterusernameandpassword(username1, password1);
		home = loginpage.clicksigninbutton();
		boolean isusernamefieldisenabled = loginpage.isusernamefieldisenabled();
		Assert.assertTrue(isusernamefieldisenabled, Constant.ERROR_MESSAGE_Loginwithvalidusernameandinvalidpassword);

	}

	@Test(groups = {"smoke"})
	public void verifyuserisabletologinwithinvalidusernameandvalidpassword() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password = ExcelUtility.getStringData(1, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterusernameandpassword(username, password);
		home = loginpage.clicksigninbutton();
		boolean ispasswordfieldisenabled = loginpage.ispasswordfieldisenabled();
		Assert.assertTrue(ispasswordfieldisenabled, Constant.ERROR_MESSAGE_Loginwithinvaliusernameandvalidpassword);

	}

	@Test(groups = {"smoke"})
	public void verifyuserisabletologinwithinvalidusernameandinvalidpassword() throws IOException {
		String username = ExcelUtility.getStringData(2, 0, "LoginPage");
		String password = ExcelUtility.getStringData(2, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterusernameandpassword(username, password);
		home = loginpage.clicksigninbutton();
		boolean issigninbuttonisenabled = loginpage.issigninbuttonisenabled();
		Assert.assertTrue(issigninbuttonisenabled, Constant.ERROR_MESSAGE_Loginwithinvaliusernameandinvalidpassword);

	}

}
