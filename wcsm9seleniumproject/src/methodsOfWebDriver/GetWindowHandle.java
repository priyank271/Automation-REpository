package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {
	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//launch the web application
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);
		//Take the address of current window or browser
		//parent browser ...{the browser or window has controls}
		 String parentHandle = driver.getWindowHandle();
		 System.out.println(parentHandle);
	}

}
