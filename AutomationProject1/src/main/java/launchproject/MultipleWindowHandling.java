package launchproject;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {
	public WebDriver driver;
	public void multiwindows()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();
		WebElement contact=driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		contact.click();
		WebElement login=driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
		login.click();
		String parent=driver.getWindowHandle();
		System.out.println("parent"+parent);  
		Set<String> childwindow=driver.getWindowHandles();
		System.out.println("childwindow" +childwindow);
		String title="";
		for(String newchild:childwindow)
		{
			if(!newchild.equals(parent))
			{
				System.out.println("childwindow" +newchild);
				driver.switchTo().window(newchild);
				//System.out.println(driver.getTitle());
				title=driver.getTitle();
			}
			if(title.equals("WebDriver | Login Portal"))
			{
				WebElement username=driver.findElement(By.xpath("//input[@id='text']"));
				username.sendKeys("test");
				WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
				password.sendKeys("test@123");
				WebElement loginbtn=driver.findElement(By.xpath("//button[@id='login-button']"));
				loginbtn.click();
						
				
			}
			if(title.equals("WebDriver | Contact Us"))
			{
				WebElement fname=driver.findElement(By.xpath("//input[@name='first_name']"));
				fname.sendKeys("priya");
				WebElement lname=driver.findElement(By.xpath("//input[@name='last_name']"));
				lname.sendKeys("jacob");
			}
		}
		
	}

	public static void main(String[] args) {
		
		MultipleWindowHandling mw=new MultipleWindowHandling();
		mw.multiwindows();

	}

}
