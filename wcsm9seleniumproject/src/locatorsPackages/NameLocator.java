package locatorsPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {

	public static void main(String[] args) throws InterruptedException {
		// Launch the chrome browser
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//launch the web application
		driver.get("file:///C:/Users/piyaa/Desktop/WCSM9_WebElements/Radio_button.html");
		Thread.sleep(2000);
		//identify D radio button by using name locator
		driver.findElement(By.name("name4")).click();
		Thread.sleep(2000);
		//identify A radio button by using name locator
		driver.findElement(By.name("name1")).click();
		Thread.sleep(2000);
		}

}
