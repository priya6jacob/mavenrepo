package launchproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElements extends LaunchBrowser{
	public void findelements() {
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		List<WebElement>checkbox=driver.findElements(By.xpath("//input[@class='check-box-list']"));
		for(WebElement check:checkbox)
		{
			check.click();
		}
	}

	public static void main(String[] args) {
		FindElements fe=new FindElements();
		fe.launchbrowser();
		fe.findelements();
		
		
	}

}
