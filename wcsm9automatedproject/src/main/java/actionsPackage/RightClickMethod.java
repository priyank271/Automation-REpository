package actionsPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickMethod {

	public static void main(String[] args) throws InterruptedException {
	 	WebDriver driver = new ChromeDriver();
	 	driver.manage().window().maximize();
	 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 	driver.get("https://www.selenium.dev/downloads/");
	 	//right click on downloads
	 	WebElement rightClick = driver.findElement(By.xpath("//span[text()='Downloads']"));
	 	//create an object
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		//call right click method i.e, contextClick method
		act.contextClick(rightClick).perform();

	}

}
