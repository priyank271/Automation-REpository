package actionsPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementMethod {
	
	// it is used to perform mouse hover action
	public static void main(String[] args) throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("https://www.bluestone.com/");
	  //handle popup
	  driver.findElement(By.id("denyBtn")).click();
	  Thread.sleep(2000);
	  //perform MouseHoverAction
	  WebElement warchJwellaryTarget = driver.findElement(By.xpath("//a[@title='Watch Jewellery']"));
	  Actions act = new Actions(driver);
	  Thread.sleep(2000);
	  act.moveToElement(warchJwellaryTarget).perform();
	  //click on band
	  driver.findElement(By.xpath("//a[@text()='Band")).click();
	}

}
