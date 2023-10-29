package assignmentPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// Launch the chrome browser
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/?stype=lo&jlou=AfdvcoJoaftX7YYDWGiRWkG2JS446uBbUkbaAVVcKHmxp6ZduQ5NSqd_cjA9zvq1-3CnheuNFNTdFKQCCxy2C8quwnMYzXOqeNO3NsaJt9R-3Q&smuh=3704&lh=Ac9taElyT1ueQLgJWdw");
		//identify email address and pass input as "abc123@gmail.com"
		driver.findElement(By.id("email")).sendKeys("abc123@gmail.com");
		Thread.sleep(2000);
		//identify Password and pass input as "Abc123"
		driver.findElement(By.id("pass")).sendKeys("Abc123");
		
	}	
}
