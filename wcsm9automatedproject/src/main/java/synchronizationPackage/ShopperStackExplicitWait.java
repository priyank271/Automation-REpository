package synchronizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopperStackExplicitWait {
	public static void main(String[] args) throws InterruptedException {
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.shoppersstack.com/");
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   driver.findElement(By.xpath("//img[@alt=SAMSUNG GALAXY Z Flip4']")).click();
		   //identify check delivery box and pass 411033 pincode
		   driver.findElement(By.id("Check delivery")).sendKeys("411033");
		//we can use explicit wait by using methods concept as follows:
		   WebElement checkButton = driver.findElement(By.id("Check"));
		   explicitWait(driver,30, checkButton).click();
	}
		   public static WebElement explicitWait(WebDriver driver,long sec,WebElement ele)
		   {
			   WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(sec));
			   WebElement element = wait.until(ExpectedConditions.elementToBeClickable(ele));
			   return element;
		   }

}
