package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends Base {
	public HomePage home;

	@Test(dataProvider = "credentials")
	public void verifyuserlogin(String username, String password) {

		LoginPage lpage = new LoginPage(driver);
		lpage.enterusernameandpassword(username, password);
		home = lpage.clickloginbutton();
		boolean isdashboardisloaded = lpage.isdashboardisdisplayed();
		Assert.assertTrue(isdashboardisloaded, "home page not loaded");
	}

	@DataProvider(name = "credentials")
	public Object[][] testdata() {
		Object data[][] = { { "carol", "1q2w3e4r" }, { "priya", "test123" } };
		return data;
	}

}
