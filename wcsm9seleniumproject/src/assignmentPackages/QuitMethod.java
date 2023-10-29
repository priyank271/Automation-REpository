package assignmentPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {
	public static void main(String[] args) throws InterruptedException {
		// to launch the chrome browser
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//Launch the web application
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(2000);
		//click on open a popup window link
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		Thread.sleep(2000);
		//close all the browser or window
		driver.quit();
		

	}

}



