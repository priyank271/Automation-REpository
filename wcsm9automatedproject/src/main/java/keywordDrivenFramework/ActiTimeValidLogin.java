package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ActiTimeValidLogin extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		//to launch the browser and close the browser
		BaseTest bt = new BaseTest();
		
		//to read the data from property file
		Flib flib = new Flib();
		
		bt.openBrowser();
		
		//identify user name text box
		WebElement usnTB = driver.findElement(By.name("username"));
		usnTB.sendKeys(flib.readDataFromProperty(PROP_PATH,"username"));
		//identify password text box
		WebElement pwdTB = driver.findElement(By.name("password"));
		pwdTB.sendKeys(flib.readDataFromProperty(PROP_PATH,"password"));
		//identify login button
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		bt.closeBrowser();
	}
		
	
}
