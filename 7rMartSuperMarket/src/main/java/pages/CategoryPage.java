package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constant.Constant;
import utility.FileUploadUtility;
import utility.PageUtility;
import utility.WaitUtility;

public class CategoryPage {
	public WebDriver driver;
	PageUtility pageutility = new PageUtility();
	FileUploadUtility fileupload = new FileUploadUtility();
	WaitUtility wait = new WaitUtility();

	public CategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement newbutton;
	@FindBy(xpath = "//input[@id='category']")
	WebElement categorytextbox;
	@FindBy(xpath = "//li[@id='134-selectable']")
	WebElement selectgroups;
	@FindBy(xpath = "//input[@name='main_img']")
	WebElement choosefile;
	@FindBy(xpath = "//input[@name='top_menu']")
	WebElement radiobuttn1;
	@FindBy(xpath = "//button[@name='create']")
	WebElement savebutton;
	@FindBy(xpath = "//a[text()='Cancel']")
	WebElement cancelbutton;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")
	WebElement searchbutton;
	@FindBy(xpath = "//input[@name='un']")
	WebElement searchcategoryfield;
	@FindBy(xpath = "//button[@class='btn btn-danger btn-fix']")
	WebElement searchbutton1;

	public CategoryPage clicknewbutton() {
		newbutton.click();
		return this;
	}

	public CategoryPage entercategory(String categoryfield) {
		categorytextbox.sendKeys(categoryfield);
		return this;

	}

	public CategoryPage clickgroup() {
		selectgroups.click();
		return this;
	}

	public CategoryPage sendKeysforFileUpload() {
		wait.waitforvisibilityofelement(driver, choosefile);

		fileupload.sendKeysforFileUpload(choosefile, Constant.IMAGE);
		return this;

	}

	public CategoryPage clickradiobutton1() {
		radiobuttn1.click();
		return this;
	}

	public CategoryPage clicksavebutton() {

		pageutility.javaScriptExecutorMethod(savebutton);
		savebutton.click();
		return this;
	}

	public CategoryPage clickcancelbutton() {
		cancelbutton.click();
		return this;
	}

	public boolean issavebuttonenabled() {
		return savebutton.isEnabled();
	}

	public CategoryPage clicksearchbutton() {
		searchbutton.click();
		return this;
	}

	public CategoryPage searchcategory(String categoryfield) {
		searchcategoryfield.sendKeys(categoryfield);
		return this;

	}

	public CategoryPage clicksearchbutton1() {
		WaitUtility wait = new WaitUtility();
		wait.elementtobeclicked(driver, searchbutton1);
		searchbutton1.click();
		return this;

	}

	public boolean issearchbuttonenabled() {
		return searchbutton1.isEnabled();
	}
}
