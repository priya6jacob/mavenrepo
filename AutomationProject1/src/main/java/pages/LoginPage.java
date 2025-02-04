package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
public WebDriver driver;
public LoginPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
@FindBy(xpath="//input[@name='LoginForm[username]']")
WebElement username;
@FindBy(xpath="//input[@name='LoginForm[password]']")
WebElement password;
@FindBy(xpath="//button[@class='btn btn-default']")
WebElement login;
@FindBy(xpath="//a[text()='Dashboard']")
WebElement dashboard;
public LoginPage enterusernameandpassword(String usernamefield,String passwordfield) {
	
	username.sendKeys(usernamefield);
	password.sendKeys(passwordfield);
	return this;
}
public HomePage clickloginbutton() {
	
	login.click();
	return new HomePage(driver);
}
public boolean isdashboardisdisplayed() {
	return dashboard.isDisplayed();	
	
}


}
