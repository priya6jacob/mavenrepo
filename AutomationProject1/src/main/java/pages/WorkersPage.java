package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkersPage {
	public WebDriver driver;

	public WorkersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
@FindBy(xpath="//input[@id='workersearch-first_name']")
WebElement firstname;
@FindBy(xpath="//input[@id='workersearch-last_name']")
WebElement lastname;
@FindBy(xpath="//button[@type='submit']")
WebElement search;


public WorkersPage searchfirstnameandlastname(String firstnamefield,String lastnamefield) {
	firstname.sendKeys(firstnamefield);
	lastname.sendKeys(lastnamefield);
	return this;
}
public WorkersPage clicksearch() {
	search.click();
	return this;
	
}
}
	

