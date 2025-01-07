package launchproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {
	public WebDriver driver;
	
	public void launchbrowser()
	{
		driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/index.php");
		driver.manage().window().maximize();
		
		//driver=new EdgeDriver();
		//driver=new FirefoxDriver();
		
	}
	public void quitandclose()
	{
		//driver.close();
		driver.quit();
	}

	public static void main(String[] args) {
		LaunchBrowser lb=new LaunchBrowser();
		lb.launchbrowser();
		lb.quitandclose();
		

	}

}
