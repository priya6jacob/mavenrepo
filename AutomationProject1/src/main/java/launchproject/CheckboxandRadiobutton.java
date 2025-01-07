package launchproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckboxandRadiobutton extends LaunchBrowser{
	public void checkboxandradio()
	{
	driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
	WebElement checkbox=driver.findElement(By.xpath("//input[@id='gridCheck']"));
	System.out.println(checkbox.isSelected());
	checkbox.click();
	
	
	}
	public void radiobutton()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radiobtn=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		radiobtn.click();
		WebElement ssvaluebtn=driver.findElement(By.xpath("//button[@id='button-one']"));
		ssvaluebtn.click();
		
	}

	public static void main(String[] args) {
		CheckboxandRadiobutton cb=new CheckboxandRadiobutton();
		cb.launchbrowser();
		//cb.checkboxandradio();
		cb.radiobutton();
		
		
		

	}

}
