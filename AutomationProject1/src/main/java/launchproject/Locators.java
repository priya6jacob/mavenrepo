package launchproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends LaunchBrowser {
	public void locators() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement showmsgbutton = driver.findElement(By.id("button-one")); // id

		WebElement messagefield = driver.findElement(By.className("form-control")); // classname

		WebElement entervalfield = driver.findElement(By.tagName("input")); // tagname

		WebElement linktext = driver.findElement(By.linkText("Checkbox Demo"));
		WebElement partiallinktext = driver.findElement(By.partialLinkText("Check"));
		WebElement name = driver.findElement(By.name("viewport"));
	}

	public void cssselector() {
		WebElement entermsg = driver.findElement(By.cssSelector("input#single-input-field"));
		WebElement showmsg = driver.findElement(By.cssSelector("button.btn btn-primary"));
		WebElement entervalue = driver.findElement(By.cssSelector("input[id=value-a]"));
		WebElement entermsg1 = driver.findElement(By.cssSelector("input.form-control[id=single-input-field]"));
	}

	public void absolutexpath() {
		WebElement msgbutton = driver
				.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input"));
	}

	public void relativexpath() {
		WebElement entrmsg = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		WebElement enterval = driver.findElement(By.xpath("//input[@id='value-a']"));
	}

	public void dynamicxpath() {
		WebElement entermsgfld = driver.findElement(By.xpath("//input[contains(@id,'single')]"));
		WebElement showmsgbtn = driver.findElement(By.xpath("//button[text()='Show Message']"));
	}

	public void axesmethod() {
		WebElement logo = driver.findElement(By.xpath("//a[@href='index.php']//child::img")); // child or
																								// //a[@href='index.php']//child::img[@alt='logo']
		WebElement showmsgbtn = driver.findElement(By.xpath("//button[@id='button-one']//parent::form")); // parent
		WebElement showmsgbtn1 = driver
				.findElement(By.xpath("//button[@id='button-one']//following::div[@id='message-one']")); // following
		WebElement showmsgbtn2 = driver.findElement(By.xpath("//button[@id='button-one']//preceding::label")); // preceding
		WebElement showmsgbtn3 = driver
				.findElement(By.xpath("//button[@id='button-one']//ancestor::div[@class='row']")); // ancestor
		WebElement entermsgfld = driver.findElement(By.xpath("(//input[@type='text'])[1]")); // using index
	}

	public static void main(String[] args) {

		Locators locator = new Locators();
		locator.launchbrowser();
		locator.locators();
		locator.cssselector();
		locator.absolutexpath();
		locator.quitandclose();

	}

}
