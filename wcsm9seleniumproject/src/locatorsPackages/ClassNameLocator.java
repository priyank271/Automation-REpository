package locatorsPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {

	public static void main(String[] args) throws InterruptedException {
		// to Launch the chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		//switch the controls to active elements
		driver.switchTo().activeElement().sendKeys("chandler bing",Keys.ENTER);
		//identify symbol and click
		driver.findElement(By.className("lNPNe")).click();
		
		
		

	}

}
