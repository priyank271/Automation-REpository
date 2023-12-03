package popupHandelling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		
		//identify popup and click on it
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		
		//click on javascript
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		
		//click on confirm
		driver.findElement(By.xpath("//a[text()='Confirm']")).click();
		
		//click on confirm box button
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		Thread.sleep(2000);
		
		//Get the text of the popup
		Alert alert = driver.switchTo().alert();
		String getText = alert.getText();
		System.out.println(getText);
		
		//way1 - to handle the popup by using robot class,go to the cancel button and click on cancel button
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		//way2 - handle confirmation
		//Alert confirm = driver.switchTo().alert();
		//Thread.sleep(2000);
		//accept confirmation popup
		//confirm.accept();
		
		//way3 - dismiss confirmation popup
		//confirm.dismiss();
		
		
		
		
		
		
		
		

	}

}
