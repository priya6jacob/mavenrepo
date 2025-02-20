package pages;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constant.Constant;
import utility.FileUploadUtility;
import utility.PageUtility;
import utility.WaitUtility;

public class SubCategoryPage {
	public WebDriver driver;
	PageUtility pageutility = new PageUtility();
	FileUploadUtility fileupload = new FileUploadUtility();
	WaitUtility wait = new WaitUtility();

	public SubCategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement newbutton;
	@FindBy(xpath = "//select[@id='cat_id']")
	WebElement categorydropdown;
	@FindBy(xpath = "//input[@id='subcategory']")
	WebElement subcategorytextfield;
	@FindBy(xpath = "//input[@id='main_img']")
	WebElement chooseimage;
	@FindBy(xpath = "//button[@class='btn btn-danger']")
	WebElement savebutton;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")
	WebElement searchbutton;
	@FindBy(xpath = "//select[@id='un']")
	WebElement categoryfield;
	@FindBy(xpath = "//input[@name='ut']")
	WebElement subcategoryfield;
	@FindBy(xpath = "//button[@class='btn btn-danger btn-fix']")
	WebElement searchsubcategorybutton;

	public SubCategoryPage clicknewbutton() {
		newbutton.click();
		return this;
	}

	public SubCategoryPage selectcategorydropdown() {
		pageutility.selectByIndex(categorydropdown, 3);
		return this;
	}

	public SubCategoryPage entercategory(String subcategoryfield) {
		subcategorytextfield.sendKeys(subcategoryfield);
		return this;

	}

	public SubCategoryPage sendKeysforFileUpload() throws AWTException {
		wait.waitforvisibilityofelement(driver, chooseimage);

		fileupload.sendKeysforFileUpload(chooseimage, Constant.IMAGE);
		return this;
	}

	public SubCategoryPage clicksavebutton() {
		pageutility.javaScriptExecutorMethod(savebutton);
		savebutton.click();
		return this;
	}

	public SubCategoryPage clicksearchbutton() {
		searchbutton.click();
		return this;
	}

	public SubCategoryPage searchcategory() {
		pageutility.selectByIndex(categoryfield, 3);
		return this;

	}

	public SubCategoryPage searchsubcategory(String sub_categoryfield) {
		subcategoryfield.sendKeys(sub_categoryfield);
		return this;

	}

	public SubCategoryPage clicksubcategorysearchbutton() {
		WaitUtility wait = new WaitUtility();
		wait.elementtobeclicked(driver, searchsubcategorybutton);
		searchsubcategorybutton.click();
		return this;

	}

	public boolean issavebuttonenabled() {
		return savebutton.isEnabled();
	}

	public boolean issearchbuttonenabled() {
		return searchsubcategorybutton.isEnabled();
	}
}
