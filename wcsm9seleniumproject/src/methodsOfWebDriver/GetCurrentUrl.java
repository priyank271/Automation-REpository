package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {

	public static void main(String[] args) throws InterruptedException {
		// launch the chrome browser
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//launch the web application
		driver.get("http://www.primevideo.com");
		//take the url of login page
		String urlOfLoginPage = driver.getCurrentUrl();
		System.out.println(urlOfLoginPage);
		// to stop the script for 2sec
		Thread.sleep(2000);
		
		}

}
