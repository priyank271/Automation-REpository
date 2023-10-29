package actionsPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		//click on button web element
	    driver.findElement(By.xpath("//section[text()='Button']")).click();
	    //click on right click button
	    driver.findElement(By.xpath("//a[text()='Right Click']")).click();
	  
	    WebElement rightClick1 = driver.findElement(By.xpath("//button[text()='Right Click']"));
	    WebElement rightClick2 = driver.findElement(By.xpath("//button[text()='Right Click']"));
	    WebElement rightClick3 = driver.findElement(By.xpath("//button[text()='Right Click']"));
	    Actions act = new Actions(driver);
	    Thread.sleep(2000);
	    act.contextClick(rightClick1).perform();
	    Thread.sleep(2000);
	    act.contextClick(rightClick2).perform();
	    Thread.sleep(2000);
	    act.contextClick(rightClick3).perform();
	    
	  

	}

}
