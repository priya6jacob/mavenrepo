package launchproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InputForm extends LaunchBrowser {
	public void inputform() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement entermsg = driver.findElement(By.id("single-input-field"));
		entermsg.sendKeys("hello");
		WebElement showmsgbtn = driver.findElement(By.id("button-one"));
		showmsgbtn.click();
	}

	public void inputfields() {
		WebElement entervaluea = driver.findElement(By.xpath("//input[@id='value-a']"));
		entervaluea.sendKeys("15");
		WebElement entervalueb = driver.findElement(By.xpath("//input[@id='value-b']"));
		entervalueb.sendKeys("10");
		WebElement gettotalbtn = driver.findElement(By.xpath("//button[@id='button-two']"));
		gettotalbtn.click();

	}

	public static void main(String[] args) {

		InputForm if1 = new InputForm();
		if1.launchbrowser();
		if1.inputform();
		if1.inputfields();

	}

}
