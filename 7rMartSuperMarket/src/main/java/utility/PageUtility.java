package utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	public WebDriver driver;

//MethodforSelectByIndex
	public void selectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);

	}

//MethodforselectByvisibletext
	public void selectByVisibleText(WebElement element, String visible_text) {
		Select select = new Select(element);
		select.deselectByVisibleText(visible_text);

	}
//MethodforselectByvalue
	public void selectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectByVisibleText(value);

		
	}
//Scroll
	public void javaScriptExecutorMethod(WebElement element) {
		JavascriptExecutor javascript=(JavascriptExecutor) driver;
		javascript.executeScript("window.scrollBy(0,4000)");
		
		javascript.executeScript("arguments[0].click();",element);
	}
}
