package takesScreenShotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class ScreenShotOfWebElement {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver = new ChromeDriver();
	 	driver.manage().window().maximize();
	 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 	driver.get("https://www.bluestone.com");
	 	Thread.sleep(2000);
	 	//handle popup
	 	driver.findElement(By.id("denyBtn")).click();
	 	
	 	//identify coins and perform mouse Hover action
	 	WebElement coinsTarget = driver.findElement(By.xpath("//a[@title='Coins']"));
	 	//create obj of actons class
	 	Thread.sleep(2000);
	 	Actions act = new Actions(driver);
	 	act.moveToElement(coinsTarget).perform();
	 	
	 	//identify coins by design and click
	 	driver.findElement(By.xpath("//span[Text()='Coins by Design']")).click();
	 	
	 	//right click on coins img and inspect
	 	Thread.sleep(2000);
	 	//take a ss of coin element
	 	WebElement coinsElement = driver.findElement(By.xpath("//img[@alt='1 gram 24 KT Gold Coin']"));
	 	File src = coinsElement.getScreenshotAs(OutputType.FILE);
	 	File dest = new File("./Screenshots/coinsimg.jpg");
	 	Files.copy(src, dest);
	 	
	 	
	}

}
