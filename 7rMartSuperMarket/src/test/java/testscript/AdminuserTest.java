package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import constant.Constant;
import pages.AdminuserPage;
import pages.HomePage;
import pages.LoginPage;
import utility.ExcelUtility;
import utility.FakerUtility;

public class AdminuserTest extends Base {
	public HomePage home;
	public AdminuserPage adminpage;
	public FakerUtility faker;
	public String usernamefaker;
	public String passwordfaker;

	@Test
	@Parameters({ "username", "password" })
	public void verifynewuserisadded(String username, String password) throws IOException {
		// String username = ExcelUtility.getStringData(1, 0, "AdminUserAddPage");

		// String username = ExcelUtility.getStringData(4, 0, "LoginPage");
		// String password = ExcelUtility.getStringData(4, 1, "LoginPage");
		FakerUtility faker = new FakerUtility();

		usernamefaker = faker.getFakeFirstName();
		passwordfaker = ExcelUtility.getStringData(1, 1, "AdminUserAddPage");
		LoginPage loginpage = new LoginPage(driver);

		loginpage.enterusernameandpassword(username, password);
		home = loginpage.clicksigninbutton();

		adminpage = home.clickadminuser();
		adminpage.clicknewbutton();

		adminpage.addnewadminuser(usernamefaker, passwordfaker);

		adminpage.selectusertype();
		adminpage.clicksavebutton();

		boolean issuccessmsgisdisplayed = adminpage.issuccessmsgdisplayed();
		Assert.assertTrue(issuccessmsgisdisplayed, Constant.ERROR_MESSAGE_Newadminuserisadded);

	}

	@Test

	public void verifyadminuserissearchable() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "AdminUserSearchPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterusernameandpassword("admin", "admin");
		home = loginpage.clicksigninbutton();
		adminpage = home.clickadminuser();
		adminpage.searchadminuser();
		adminpage.searchusernameandtype(username);
		adminpage.searchusertype();
		adminpage.clicksearchbutton();
		boolean isheadingdisplayed = adminpage.isheadingdisplayed();
		assertTrue(isheadingdisplayed, Constant.ERROR_MESSAGE_Adminuserissearched);

	}

}
