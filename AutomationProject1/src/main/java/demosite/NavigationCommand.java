package demosite;

public class NavigationCommand extends LaunchBrowser {
	public void navigatecommand() {
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().to("https://www.facebook.com/login/");
	}

	public static void main(String[] args) {

		NavigationCommand nc = new NavigationCommand();
		nc.launchbrowser();
		nc.navigatecommand();

	}

}
