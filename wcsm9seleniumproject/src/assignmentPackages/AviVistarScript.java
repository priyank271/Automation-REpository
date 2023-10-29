package assignmentPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import qsp.LaunchChromeBrowser;

public class AviVistarScript {
	public static void main(String[] args) throws InterruptedException {
		//handle notifications pop in chrome browser
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
	 	WebDriver driver = new ChromeDriver();
	 	driver.manage().window().maximize();
	 	driver.get("");
	 	Thread.sleep(2000);
	 	driver.findElement(By.id("")).click();
	}

}
