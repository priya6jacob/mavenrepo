package launchproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop extends LaunchBrowser{
	public void draganddrop() {
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement drag=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(drag).click();
		actions.doubleClick(drag).perform();
		WebElement drop1=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		actions.dragAndDrop(drag, drop1).build().perform();
	}

	public static void main(String[] args) {
		Draganddrop ddrop=new Draganddrop();
		ddrop.launchbrowser();
		ddrop.draganddrop();
		

	}

}
