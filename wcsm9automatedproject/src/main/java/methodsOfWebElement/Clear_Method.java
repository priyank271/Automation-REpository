package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear_Method {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1/login.do;jsessionid=tre8h6drl0k0");
		WebElement usnTB = driver.findElement(By.name("username"));
		usnTB.sendKeys("username");
		WebElement pwdTB = driver.findElement(By.name("pwd"));
		pwdTB.sendKeys("manager");
		Thread.sleep(2000);
		usnTB.clear();
		pwdTB.clear();
		
	}

}
