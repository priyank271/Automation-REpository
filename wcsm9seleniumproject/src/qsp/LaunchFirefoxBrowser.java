package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {

	public static void main(String[] args) {
		// to launch firefox browser we need to create object of forefoxDriver();
		new FirefoxDriver();
		System.out.println("Firefox is open");
	}

}
