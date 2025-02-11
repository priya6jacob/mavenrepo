package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.CategoryPage;
import pages.HomePage;
import pages.LoginPage;
import utility.ExcelUtility;

public class CategoryTest extends Base {
	public HomePage home;
	public CategoryPage categorypage;

	@Test
	public void verifycategoryisadded() throws IOException {
		String username = ExcelUtility.getStringData(4, 0, "LoginPage");
		String password = ExcelUtility.getStringData(4, 1, "LoginPage");
		String category = ExcelUtility.getStringData(1, 0, "CategoryAddPage");
		LoginPage loginpage = new LoginPage(driver);
		
		loginpage.enterusernameandpassword(username,password);
		home = loginpage.clicksigninbutton();
		categorypage = home.clickcategory();
		categorypage.clicknewbutton();
		categorypage.entercategory(category);

		categorypage.clickgroup();
		categorypage.sendKeysforFileUpload();

		categorypage.clicksavebutton();

		boolean issavebuttonenabled = categorypage.issavebuttonenabled();
		Assert.assertTrue(issavebuttonenabled, Constant.ERROR_MESSAGE_Categorysavebuttonenabled);

	}

	@Test

	public void verifycategoryissearchable() throws IOException {
		String username = ExcelUtility.getStringData(4, 0, "LoginPage");
		String password = ExcelUtility.getStringData(4, 1, "LoginPage");
		String category = ExcelUtility.getStringData(1, 0, "CategorySearchPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterusernameandpassword(username,password);
		home = loginpage.clicksigninbutton();
		categorypage = home.clickcategory();
		categorypage.clicksearchbutton();
		categorypage.searchcategory(category);
		categorypage.clicksearchbutton1();
		boolean issearchbuttonenabled = categorypage.issearchbuttonenabled();
		Assert.assertTrue(issearchbuttonenabled, Constant.ERROR_MESSAGE_Categorysearchbuttonenabled);

	}

}
