package launchproject;

public class NavigationCommands extends LaunchBrowser{
	public void navigationcommand()
	{
		driver.navigate().to("https://www.amazon.in/");
	}

	public static void main(String[] args) {
		
		NavigationCommands nc=new NavigationCommands();
		nc.launchbrowser();
		nc.navigationcommand();

	}

}
