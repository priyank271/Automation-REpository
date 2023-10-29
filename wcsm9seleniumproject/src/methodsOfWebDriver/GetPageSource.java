package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {
		public static void main(String[] args) throws InterruptedException {
			// launch the chrome browser
			WebDriver driver = new ChromeDriver();
			//maximize the browser
			driver.manage().window().maximize();
			//launch the web application
			driver.get("view-source:https://www.flipkart.com/");
			//take a source code of login page
			String loginPageSourceCode = driver.getPageSource();
			System.out.println(loginPageSourceCode);
			Thread.sleep(2000);
			driver.quit();
			
	}

}
