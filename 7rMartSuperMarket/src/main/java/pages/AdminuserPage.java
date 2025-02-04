package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utility.PageUtility;
import utility.WaitUtility;

public class AdminuserPage {
	public WebDriver driver;
	PageUtility pageutility = new PageUtility();

	public AdminuserPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement newbutton;
	@FindBy(xpath = "//input[@id='username']")
	WebElement username;
	@FindBy(xpath = "//input[@id='password']")
	WebElement password;
	@FindBy(xpath = "//select[@id='user_type']")
	WebElement usertype;
	@FindBy(xpath = "//button[@name='Create']")
	WebElement savebutton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement successmsg;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")
	WebElement searchbutton;
	@FindBy(xpath = "//input[@id='un']")
	WebElement searchusername;
	@FindBy(xpath = "//select[@id='ut']")
	WebElement searchusertype;
	@FindBy(xpath = "//button[@name='Search']")
	WebElement searchbutton1;
	@FindBy(xpath = "//h4[text()='Search Admin Users']")
	WebElement searchtext;

	public AdminuserPage clicknewbutton() {
		newbutton.click();
		return this;
	}

	public AdminuserPage addnewadminuser(String usernamefield, String passwordfield) {
		username.sendKeys(usernamefield);
		password.sendKeys(passwordfield);
		return this;
	}

	public AdminuserPage selectusertype() {
		pageutility.selectByIndex(usertype, 3);
		return this;

	}

	public AdminuserPage clicksavebutton() {
		WaitUtility wait = new WaitUtility();
		wait.elementtobeclicked(driver, savebutton);
		savebutton.click();
		return this;

	}

	public AdminuserPage searchadminuser() {
		WaitUtility wait = new WaitUtility();
		wait.elementtobeclicked(driver, searchbutton);
		searchbutton.click();
		return this;
	}

	public AdminuserPage searchusernameandtype(String usernamefield) {
		searchusername.sendKeys(usernamefield);
		return this;

	}

	public AdminuserPage searchusertype() {
		pageutility.selectByIndex(searchusertype, 2);
		return this;

	}

	public AdminuserPage clicksearchbutton() {
		WaitUtility wait = new WaitUtility();
		wait.elementtobeclicked(driver, searchbutton1);
		searchbutton1.click();
		return this;
	}

	public boolean issuccessmsgdisplayed() {
		return successmsg.isDisplayed();

	}

	public boolean isheadingdisplayed() {
		return searchtext.isDisplayed();
	}
}
