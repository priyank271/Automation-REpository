package synchronizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopperStackSynchronize {
	public static void main(String[] args) throws InterruptedException {
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.shoppersstack.com/");
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   driver.findElement(By.xpath("//img[@alt=SAMSUNG GALAXY Z Flip4']")).click();
		   //identify check delivery box and pass 411033 pincode
		   driver.findElement(By.id("Check delivery")).sendKeys("411033");
		   //after passing the pincode we need to apply the explicit wait
		   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		   //right click on check button and inspect
		   WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.id("Check")));
		   ele.click();
		   //click on check button
		   driver.findElement(By.id("Check")).click();
		   
		
	}

}

