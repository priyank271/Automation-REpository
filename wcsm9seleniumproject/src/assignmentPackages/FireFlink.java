package assignmentPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FireFlink {
	public static void main(String[] args) throws InterruptedException {
		// Launch the chrome browser
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		driver.get("https://app.fireflink.com/signup");
		//identify Name and pass input as "Priyanka"
		driver.findElement(By.id("mui-1")).sendKeys("Priyanka");
		Thread.sleep(2000);
		//identify email and pass input as "Abc123"
		driver.findElement(By.id("mui-2")).sendKeys("abc123@gmail.com");
		Thread.sleep(2000);
		//identify password and pass input as "ABc@12345"
		driver.findElement(By.id("mui-3")).sendKeys("ABc@123456");
		Thread.sleep(2000);
		//identify confirm password and pass input as "ABc@12345"
		driver.findElement(By.id("mui-4")).sendKeys("ABc@123456");
		Thread.sleep(2000);
		//identify Organisation name and pass input as "QSpiders"
		driver.findElement(By.id("mui-5")).sendKeys("QSpiders");
		Thread.sleep(2000);
		driver.close();		
		
		
	}	
}



