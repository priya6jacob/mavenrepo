package launchproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends LaunchBrowser{
	public void fulltablehandling() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(table.getText());
		
	}
public void rowoftable() {
	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	WebElement row=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[4]"));
	System.out.println(row.getText());
}
public void elementoftable() {
	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	WebElement column=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[3]/td[2]"));
	System.out.println(column.getText());
	
}
public void columnoftable() {
	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	List<WebElement>column=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
	for(WebElement col:column)
	{
		System.out.println(col.getText());
	}
	
}
public void checkelement() {
	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	String input="Garrett Winters";
	List<WebElement> check1=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
	for(WebElement ch:check1)
	{
		if(ch.getText().equals(input))
		{
			System.out.println(ch.getText());
		}
	}
	
}

	public static void main(String[] args) {
		TableHandling tb=new TableHandling();
		tb.launchbrowser();
		//tb.fulltablehandling();
		//tb.rowoftable();
		//tb.elementoftable();
		//tb.columnoftable();
		tb.checkelement();
		

	}

}
