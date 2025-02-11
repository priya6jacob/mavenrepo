package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@type='text']")
	WebElement username;
	@FindBy(xpath = "//input[@type='password']")
	WebElement password;
	@FindBy(xpath = "//button[@class='btn btn-dark btn-block']")
	WebElement signinbutn;
	@FindBy(xpath = "//li[@class='breadcrumb-item active']")
	WebElement dashboard;

	public LoginPage enterusernameandpassword(String usernamefield, String passwordfield) {
		username.sendKeys(usernamefield);
		password.sendKeys(passwordfield);
		return this;
	}

	public HomePage clicksigninbutton() {

		signinbutn.click();
		return new HomePage(driver);
	}

	public boolean isdashboardisdisplayed() {
		return dashboard.isDisplayed();
	}

	public boolean isusernamefieldisenabled() {
		return username.isEnabled();
	}

	public boolean ispasswordfieldisenabled() {
		return password.isEnabled();
	}

	public boolean issigninbuttonisenabled() {
		return signinbutn.isEnabled();
	}

}
