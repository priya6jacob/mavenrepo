package testscript;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.SubCategoryPage;
import utility.ExcelUtility;

public class SubCategoryTest extends Base {
	public HomePage home;
	public SubCategoryPage subcategorypage;

	@Test
	public void verifynewsubcategoryisadded() throws IOException, AWTException {
		String username = ExcelUtility.getStringData(4, 0, "LoginPage");
		String password = ExcelUtility.getStringData(4, 1, "LoginPage");
		String category = ExcelUtility.getStringData(1, 0, "SubCategoryAddPage");
		String subcategory = ExcelUtility.getStringData(1, 1, "SubCategoryAddPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterusernameandpassword(username,password);
		home = loginpage.clicksigninbutton();
		subcategorypage = home.clicksubcategory();
		subcategorypage.clicknewbutton();
		subcategorypage.selectcategorydropdown();
		subcategorypage.entercategory(subcategory);
		subcategorypage.sendKeysforFileUpload();
		subcategorypage.clicksavebutton();
		boolean issavebuttonenabled = subcategorypage.issavebuttonenabled();
		Assert.assertTrue(issavebuttonenabled, Constant.ERROR_MESSAGE_Subcategorysavebuttonenabled);

	}

	@Test
	public void verifysubcategoryissearchable() throws IOException, AWTException {
		// String category=ExcelUtility.getStringData(1, 0, "SubCategorySearchPage");
		String username = ExcelUtility.getStringData(4, 0, "LoginPage");
		String password = ExcelUtility.getStringData(4, 1, "LoginPage");
		String subcategory = ExcelUtility.getStringData(1, 1, "SubCategorySearchPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterusernameandpassword(username,password);
		home = loginpage.clicksigninbutton();
		subcategorypage = home.clicksubcategory();
		subcategorypage.clicksearchbutton();
		subcategorypage.searchcategory();
		subcategorypage.searchsubcategory(subcategory);
		subcategorypage.clicksubcategorysearchbutton();
		boolean issearchbuttonenabled = subcategorypage.issearchbuttonenabled();
		Assert.assertTrue(issearchbuttonenabled, Constant.ERROR_MESSAGE_SubCategorysearchbuttonenabled);

	}

}
