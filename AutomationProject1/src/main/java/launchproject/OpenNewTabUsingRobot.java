package launchproject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewTabUsingRobot {
	public WebDriver driver;

	public void newtab() throws AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/index.php");
		driver.manage().window().maximize();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);

	}

	public static void main(String[] args) throws AWTException {

		OpenNewTabUsingRobot tab = new OpenNewTabUsingRobot();
		tab.newtab();

	}

}
