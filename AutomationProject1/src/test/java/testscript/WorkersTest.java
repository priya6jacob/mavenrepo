package testscript;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.WorkersPage;

public class WorkersTest extends Base {
	public HomePage home;
	public WorkersPage workers;
  @Test
  public void searchfirstnameandlastname() {
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterusernameandpassword("carol", "1q2w3e4r");
	  home=loginpage.clickloginbutton();
	  workers=home.clickworkers();
	  workers.searchfirstnameandlastname("jyothis", "xavier").clicksearch();
	  
  }
}
