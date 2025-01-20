package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientPage {
	public WebDriver driver;

	public ClientPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	
	@FindBy(xpath = "//input[@id='clientsearch-client_name']")
	WebElement clientname;
	@FindBy(xpath = "//input[@id='clientsearch-id']")
	WebElement clientid;
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement searchbutton;

	

	public ClientPage searchclientnameandid(String clientnamefield, String clientidfield) {
		clientname.sendKeys(clientnamefield);
		clientid.sendKeys(clientidfield);
		return this;

	}

	public ClientPage clicksearchbutton() {
		searchbutton.click();
		return this;

	}
	public boolean isclientnameisdisplayed() {
		return clientname.isDisplayed();
	}
}
