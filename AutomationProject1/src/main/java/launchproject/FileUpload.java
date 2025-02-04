package launchproject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	public WebDriver driver;
	public void fileupload() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		WebElement selectbtn=driver.findElement(By.xpath("//input[@id='file-upload']"));
		selectbtn.click();
		selectbtn.sendKeys("C:\\Users\\user\\Downloads\\java notes.pdf");
	}
	public void robotclass() throws AWTException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
		WebElement selectbtn=driver.findElement(By.xpath("//span[text()='Select PDF file']"));
		selectbtn.click();
		StringSelection s=new StringSelection("C:\\Users\\user\\Downloads\\java notes.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
		Robot robot=new Robot();
		robot.delay(1500);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}

	public static void main(String[] args) throws AWTException {
		
		FileUpload fu=new FileUpload();
		//fu.fileupload();
		fu.robotclass();

	}

}
