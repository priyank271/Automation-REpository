package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassMethod {

	public static void main(String[] args) throws InterruptedException {
		// to launch the chrome browser
		 WebDriver driver = new ChromeDriver();
		 //maximize the driver
		 driver.manage().window().maximize();
		 //launch the web application
		 driver.get("https://www.flipkart.com");
		 //to stop the execution of script for 2 sec
		 Thread.sleep(2000);
		 //click on open a popup window link
		 driver.findElement(By.partialLinkText("open a popup window")).click();
		 Thread.sleep(2000);
		 //close the browser 
		 driver.close();
		 

	}

}
