package demosite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends LaunchBrowser {
	public void locators() {
		WebElement firstname = driver.findElement(By.id("firstName"));
		WebElement loginbtn = driver.findElement(By.className("submit-button btn_action"));
		WebElement fullnamefld = driver.findElement(By.tagName("input"));
		WebElement submitbtn = driver.findElement(By.linkText("Submit"));

	}
	public void cssselector()
	{
		
	}

	public static void main(String[] args) {

	}

}
