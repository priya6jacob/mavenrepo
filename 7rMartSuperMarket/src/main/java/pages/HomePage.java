package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@data-toggle='dropdown']")
	WebElement admin;
	@FindBy(xpath = "/html/body/div[1]/nav/ul[2]/li/div/a[2]")
	WebElement logout;
	@FindBy(xpath = "/html/body/div[1]/div[1]/section/div/div/div[1]/div/a")
	WebElement adminuserbox;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news']")
	WebElement managenewsbox;
	@FindBy(xpath = "/html/body/div[1]/div[1]/section/div/div/div[3]/div/a")
	WebElement categorybox;
	@FindBy(xpath = "/html/body/div[1]/div[1]/section/div/div/div[4]/div/a")
	WebElement subcategorybox;

	public HomePage clickname() {
		admin.click();
		return this;
	}

	public HomePage clicklogout() {
		logout.click();
		return this;
	}

	public AdminuserPage clickadminuser() {
		adminuserbox.click();
		return new AdminuserPage(driver);

	}

	public ManageNewsPage clickmanagenews() {
		managenewsbox.click();
		return new ManageNewsPage(driver);
	}

	public CategoryPage clickcategory() {
		categorybox.click();
		return new CategoryPage(driver);
	}

	public SubCategoryPage clicksubcategory() {
		subcategorybox.click();
		return new SubCategoryPage(driver);

	}

}
