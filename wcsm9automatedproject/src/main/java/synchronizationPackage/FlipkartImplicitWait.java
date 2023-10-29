package synchronizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// Launch the chrome browser
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get("https://www.flipkart.com/");
				//Thread.sleep(2000);
				//handle the popup window
				driver.findElement(By.xpath("//span[contains(@role,'button')]")).click();
				//identify search box and pass mobile as input
				driver.findElement(By.name("q")).sendKeys("mobiles");
				//identify search icon and click
				driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
				//click on the mobile and search for it
				driver.findElement(By.xpath("//div[text()='MOTOROLA G32 (Mineral Gray, 128 GB)']")).click();
				driver.quit();

	}

}
