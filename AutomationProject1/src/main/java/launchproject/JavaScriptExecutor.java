package launchproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class JavaScriptExecutor {
	public WebDriver driver;
	public void javascriptexe() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		JavascriptExecutor javascript=(JavascriptExecutor) driver;
		javascript.executeScript("window.scrollBy(0,2000)");
		javascript.executeScript("window.scrollBy(0,-1000)");
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		javascript.executeScript("arguments[0].click();",search); //to click using javascriptexecutor
		search.click();
	}
	

	public static void main(String[] args) {
		
		JavaScriptExecutor jc=new JavaScriptExecutor();
		jc.javascriptexe();

	}

}
