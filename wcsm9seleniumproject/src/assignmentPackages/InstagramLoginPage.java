package assignmentPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLoginPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		//identify username textbox and pass inputs 
		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("admin");
		//identify password textbox and pass inputs 
		driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("Admin@123");
		//identify login button and click on it  
		//driver.findElement(By.xpath("//button[contains(@class,'acan_acap_acas_aj1')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}

}
