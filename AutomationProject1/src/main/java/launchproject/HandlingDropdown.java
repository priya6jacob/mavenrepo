package launchproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown extends LaunchBrowser {
	public void dropdown() {
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement dropdwn = driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select = new Select(dropdwn);
		// 1st method visible text

		// select.selectByVisibleText("Red");

		// 2nd method select by value
		// select.selectByValue("Yellow");

		// 3rd method select by index
		select.selectByIndex(1);

	}

	public static void main(String[] args) {
		HandlingDropdown drop = new HandlingDropdown();
		drop.launchbrowser();
		drop.dropdown();

	}

}
