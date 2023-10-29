package actionsPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		//click on button web element
	    driver.findElement(By.xpath("//section[text()='Button']")).click();
	    // click on double click action
	    driver.findElement(By.xpath("//a[text()='Double Click']")).click();
	    //inspect yes button
	    WebElement yesTarget = driver.findElement(By.xpath("(//button[text()='Yes'])[1]"));
	    //inspect no button
	    WebElement noTarget = driver.findElement(By.xpath("(//button[text()='No'])[2]"));
	    //inspect 1 button
	    WebElement scaleTarget = driver.findElement(By.xpath("//button[text()='5']"));
	    //perform double click on each target element
	    //create object 
	    Actions act = new Actions(driver);
	    Thread.sleep(2000);
	    //call double click method with argument
	    act.doubleClick(yesTarget).perform();
	    Thread.sleep(2000);
	    act.doubleClick(noTarget).perform();
	    Thread.sleep(2000);
	    act.doubleClick(scaleTarget).perform();
	    
	}

}
