package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import utility.ExcelUtility;

public class HomeTest extends Base {
	public HomePage home;
	public LoginPage loginpage;

	@Test

	public void verifyuserisabletologout() throws IOException {
		String username = ExcelUtility.getStringData(4, 0, "LoginPage");
		String password = ExcelUtility.getStringData(4, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterusernameandpassword(username, password);
		home = loginpage.clicksigninbutton();
		home.clickname();
		home.clicklogout();
		String expected = " Login | 7rmart supermarket ";
		String actual = driver.getTitle();
		Assert.assertEquals(expected, actual, Constant.ERROR_MESSAGE_Logout);
	}
}
