package launchproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends LaunchBrowser{
	
public void alerthandling() {
	driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
	WebElement gbutton=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
	gbutton.click();
	driver.switchTo().alert().accept();
	WebElement ybutton=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
	ybutton.click();
	driver.switchTo().alert().dismiss();
	WebElement rbutton=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	rbutton.click();
	driver.switchTo().alert().sendKeys("Priya");
	driver.switchTo().alert().accept();
}
	public static void main(String[] args) {
		
		AlertHandling ah=new AlertHandling();
		ah.launchbrowser();
		ah.alerthandling();

	}

}
