package locatorsPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {

	public static void main(String[] args) throws InterruptedException {
		// Lunch the chrome browser
		 WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("file:///C:/Users/piyaa/Desktop/WCSM9_WebElements/Login_Page.html");
		 Thread.sleep(2000);
		 //identify UsernameTB by using tagName
		 driver.findElement(By.tagName("input")).sendKeys("admin");
		 Thread.sleep(2000);
		 driver.findElement(By.tagName("input")).sendKeys("manager");
		 
		 

	}

}
