package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://priyamohan/login.do");
		 WebElement usnTB = driver.findElement(By.name("username"));
		 usnTB.sendKeys("admin");
		 WebElement pswTB = driver.findElement(By.name("pwd"));
		 pswTB.sendKeys("password");

	}

}
