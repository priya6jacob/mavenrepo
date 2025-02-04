package demosite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	public WebDriver driver;
	
	public void launchbrowser()
	{
		driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
		
	}

	public static void main(String[] args) {
		LaunchBrowser lb=new LaunchBrowser();
		lb.launchbrowser();
		

	}

}
