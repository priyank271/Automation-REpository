package locatorsPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLocator {

	public static void main(String[] args) {
		// To launch the chrome browser
		WebDriver driver = new ChromeDriver();
		// To maximize the browser
		driver.manage().window().maximize();
		// To launch the web application
		driver.get("http://omayo.blogspot.com/");
		//identify link by using linktext locator
		driver.findElement(By.className("Open a popup window")).click();
	}

}
