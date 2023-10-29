package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		// to launch Chrome browser we need create object of ChromeDriver();
		
			WebDriver driver = new ChromeDriver();
			System.out.println("Chrome is open");
			Thread.sleep(2000);
			driver.close();
			System.out.println("Chrome is closed");
	}

}
