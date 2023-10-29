package methodsOfWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SwitchToMethod {
	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//Launch the web application                                                    
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		//switch the controls to Active Elements
		driver.switchTo().activeElement().sendKeys("Selenium",Keys.ENTER);
		
		
		
		
	}

}
