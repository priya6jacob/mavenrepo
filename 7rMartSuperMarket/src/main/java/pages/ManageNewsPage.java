package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {
	public WebDriver driver;

	public ManageNewsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement newbutton;
	@FindBy(xpath = "//textarea[@id='news']")
	WebElement newstextarea;
	@FindBy(xpath = "//button[@name='create']")
	WebElement savebutton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement successmsg;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")
	WebElement searchnewsbutton;
	@FindBy(xpath = "//input[@name='un']")
	WebElement newsfield;
	@FindBy(xpath = "//button[@class='btn btn-danger btn-fix']")
	WebElement searchbutton;

	public ManageNewsPage clicknewbutton() {
		newbutton.click();
		return this;

	}

	public ManageNewsPage enternewsintextarea(String newsfield) {
		newstextarea.sendKeys(newsfield);
		return this;

	}

	public ManageNewsPage clicksavebutton() {
		savebutton.click();
		return this;
	}

	public boolean issuccessmessageisdisplayed() {
		return successmsg.isDisplayed();

	}

	public ManageNewsPage clicksearchbutton() {
		searchnewsbutton.click();
		return this;

	}

	public ManageNewsPage searchnewsfield(String news_field) {
		newsfield.sendKeys(news_field);
		return this;
	}

	public ManageNewsPage clicksearchbutton1() {
		searchbutton.click();
		return this;
	}

	public boolean isnewstextfieldenabled() {

		return newsfield.isEnabled();
	}
}
