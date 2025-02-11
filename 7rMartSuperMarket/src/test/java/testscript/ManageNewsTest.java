package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.AdminuserPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;
import utility.ExcelUtility;

public class ManageNewsTest extends Base {
	public HomePage home;
	public ManageNewsPage newspage;

	@Test
	public void verifynewsisadded() throws IOException {
		String username = ExcelUtility.getStringData(4, 0, "LoginPage");
		String password = ExcelUtility.getStringData(4, 1, "LoginPage");
		String news = ExcelUtility.getStringData(1, 0, "ManageNewsPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterusernameandpassword(username,password);
		home = loginpage.clicksigninbutton();
		newspage = home.clickmanagenews();
		newspage.clicknewbutton();
		newspage.enternewsintextarea(news);
		newspage.clicksavebutton();
		boolean isnewsaddedsuccessfully = newspage.issuccessmessageisdisplayed();
		Assert.assertTrue(isnewsaddedsuccessfully, Constant.ERROR_MESSAGE_Newnewsisadded);

	}

	@Test
	public void verifynewsissearchable() throws IOException {
		String username = ExcelUtility.getStringData(4, 0, "LoginPage");
		String password = ExcelUtility.getStringData(4, 1, "LoginPage");
		String news = ExcelUtility.getStringData(1, 0, "ManageNewsSearchPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterusernameandpassword(username,password);
		home = loginpage.clicksigninbutton();
		newspage = home.clickmanagenews();
		newspage.clicksearchbutton();
		newspage.searchnewsfield(news);
		newspage.clicksearchbutton1();
		boolean istextfieldenabled = newspage.isnewstextfieldenabled();
		Assert.assertTrue(istextfieldenabled, Constant.ERROR_MESSAGE_Newstextfieldisenabled);
	}
}
