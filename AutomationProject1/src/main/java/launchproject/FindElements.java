package launchproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElements extends LaunchBrowser {

	// To select multiple checkboxes
	public void findelements() {
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@class='check-box-list']"));
		for (WebElement check : checkbox) {
			check.click();
		}
	}

	// findElements of 3 textboxes in input form page(enter same value in these
	// textboxes)

	public void findelementsinputform() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		List<WebElement> textbox = driver.findElements(By.xpath("//input[@class='form-control']"));
		for (WebElement text : textbox) {
			text.sendKeys("Hello");
		}

	}
	// to find total links in the webpage

	public void links() {
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	List<WebElement> links1=driver.findElements(By.tagName("a"));
	System.out.println("total number of links :" +links1.size());
			}
	
	// to find total number of images in the webpage
	
	public void images() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		List<WebElement> images=driver.findElements(By.tagName("img"));
		System.out.println("total number of images" +images.size());
	}

	public static void main(String[] args) {
		FindElements fe = new FindElements();
		fe.launchbrowser();
		// fe.findelements();
		// fe.findelementsinputform();
		//fe.links();
		fe.images();

	}

}
