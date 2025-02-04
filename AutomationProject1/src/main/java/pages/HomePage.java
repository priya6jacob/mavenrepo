package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//li[@class='profile-dropdown']")
	WebElement name;
	@FindBy(xpath="//a[@class='logout-btn']")
	WebElement logout;
	@FindBy(xpath = "//a[@href='/payrollapp/client/index']")
	WebElement client;
	@FindBy(xpath="//a[@href='/payrollapp/worker/index']")
	WebElement workers;
	public HomePage clickname() {
		name.click();
		return this;
	}
	
	public HomePage clicklogout() {
		logout.click();
		return this;
	}
	public ClientPage clickclient() {
		client.click();
		return new ClientPage(driver);
		
	}
	public WorkersPage clickworkers() {
		workers.click();
		return new WorkersPage(driver);
		
		
	}
			

}
