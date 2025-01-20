package demosite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Checkbox extends LaunchBrowser {
	public void dropdown() {
		WebElement drop1 = driver.findElement(By.id("dropdowm-menu-1"));
		Select select = new Select(drop1);
		select.selectByVisibleText("Python");
		WebElement drop2 = driver.findElement(By.id("dropdowm-menu-2"));
		Select select2 = new Select(drop2);
		select2.selectByValue("testng");
		WebElement drop3 = driver.findElement(By.id("dropdowm-menu-3"));
		Select select3 = new Select(drop3);
		select3.selectByIndex(3);
	}

	public void checkboxandradiobttn() {
		WebElement checkbox = driver.findElement(By.xpath("//input[@value='option-2']"));
		// boolean b1=checkbox.isSelected();
		// System.out.println(b1);
		checkbox.click();
		// boolean b1=checkbox.isSelected();
		// System.out.println(b1);
		WebElement radiobtn = driver.findElement(By.xpath("//input[@value='yellow']"));
		radiobtn.click();

	}
	public void selectedanddisabled() {
		WebElement radiobtn=driver.findElement(By.xpath("//input[@value='pumpkin']"));
		boolean b1=radiobtn.isEnabled();
		System.out.println(b1);
		radiobtn.click();
		WebElement dropdwn=driver.findElement(By.id("fruit-selects"));
		Select select=new Select(dropdwn);
		select.selectByIndex(2);
	}

	public static void main(String[] args) {

		Checkbox cb = new Checkbox();
		cb.launchbrowser();
		cb.checkboxandradiobttn();
		cb.dropdown();
		cb.selectedanddisabled();

	}

}
