package synchronizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {

	public static void main(String[] args) throws InterruptedException {
		// Launch the chrome browser
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//apply implicite wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		Thread.sleep(2000);
		 //idetify usrrname textbox
		driver.findElement(By.name("username")).sendKeys("admin");
		 //identify password textbox
		driver.findElement(By.name("password")).sendKeys("admin@123");
		 //identify login button
		//driver.findElement(By.xpath("//button[contains(@class,'acan_acap_acas_aj1')]")).click();
		driver.findElement(By.xpath("//div[text()='Log in']")).click();

	}

}
