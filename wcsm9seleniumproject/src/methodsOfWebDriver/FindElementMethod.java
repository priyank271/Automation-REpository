package methodsOfWebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod {

	public static void main(String[] args) {
		//launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//lanch the actitime web appl
		driver.get("http://127.0.0.1/login.do;jsessionid=2407opm6l9kxv");
		//identify username textbox
	 	WebElement usnTB = driver.findElement(By.name("username"));
		System.out.println(usnTB);
	 	usnTB.sendKeys("admin");
	}

}
