package testscript;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class HomeTest extends Base {
	public HomePage home;

	@Test
	@Parameters({ "username", "password" })
	public void verifyuserisabletologout(String username,String password) {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterusernameandpassword(username, password);
		home = loginpage.clickloginbutton();
		home.clickname().clicklogout();

		/*
		 * loginpage.clickloginbutton(); HomePage homepage=new HomePage(driver);
		 * homepage.clickname(); homepage.clicklogout();
		 */
		String expected = "Login";
		String actual = driver.getTitle();
		Assert.assertEquals(expected, actual, "logout unsuccessful");

	}
}
