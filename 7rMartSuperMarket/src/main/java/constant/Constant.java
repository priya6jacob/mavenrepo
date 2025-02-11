package constant;

import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class Constant {
	public static final String ERROR_MESSAGE_Loginwithvalidcredentials = "Home page not loaded";
	public static final String ERROR_MESSAGE_Loginwithvalidusernameandinvalidpassword = "usernmae field is enabled";
	public static final String ERROR_MESSAGE_Loginwithinvaliusernameandvalidpassword = "Password field not enabled";
	public static final String ERROR_MESSAGE_Loginwithinvaliusernameandinvalidpassword = "Button enabled";
	public static final String ERROR_MESSAGE_Logout = "User is redirected to loginpage";
	public static final String ERROR_MESSAGE_Newadminuserisadded = "Success msg is displayed";
	public static final String ERROR_MESSAGE_Adminuserissearched = "Heading is displayed";
	public static final String ERROR_MESSAGE_Newnewsisadded = "success msg is displayed";
	public static final String ERROR_MESSAGE_Newstextfieldisenabled = "News field is enabled";
	public static final String ERROR_MESSAGE_Categorysavebuttonenabled = "Save button is enabled";
	public static final String ERROR_MESSAGE_Categorysearchbuttonenabled = "Search button is enabled";
	public static final String ERROR_MESSAGE_Subcategorysavebuttonenabled = "Save button is enabled";
	public static final String ERROR_MESSAGE_SubCategorysearchbuttonenabled = "Search button is enabled";

	public static final String FILE_PATH = System.getProperty("user.dir") + "\\src\\main\\resources\\testdata.xlsx";
	public static final String IMAGE = System.getProperty("user.dir") + "\\src\\main\\resources\\iphone.png";
	public static final String CONFIG_FILE=System.getProperty("user.dir") +"\\src\\test\\resources\\config.properties";
}
