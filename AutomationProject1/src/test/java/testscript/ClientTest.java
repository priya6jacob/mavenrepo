package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ClientPage;
import pages.HomePage;
import pages.LoginPage;

public class ClientTest extends Base{
	public HomePage home;
	public ClientPage client;
  @Test
  public void searchclientnameandid() {
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterusernameandpassword("carol", "1q2w3e4r");
	  home=loginpage.clickloginbutton();
	  client=home.clickclient();
	  client.searchclientnameandid("Sam", "3").clicksearchbutton();
	  
	  /*loginpage.clickloginbutton();
	  ClientPage clientpage=new ClientPage(driver);
	  clientpage.clickclient();
	  clientpage.searchclientnameandid("Sam", "3");
	  clientpage.clicksearchbutton();*/
	  boolean isnameisdisplayed=client.isclientnameisdisplayed();
	  Assert.assertTrue(isnameisdisplayed,"client name is displayed");
	  
  }
}
