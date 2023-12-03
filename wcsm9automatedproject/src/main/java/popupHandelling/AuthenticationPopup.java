package popupHandelling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		
		//Generate authentication popup
		//identify popup and click on it
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		
		//click on authentication
		driver.findElement(By.xpath("//section[text()='Authentication']")).click();
		Thread.sleep(2000);
		
		//click on login button
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(2000);
		
		//get address of authentication popup
		String authenticatePageWindowHandle = driver.getWindowHandle();
		//get the address of all the windows
		Set<String> allHandles = driver.getWindowHandles();
		//switch control from parent to child window
		 for(String wh:allHandles)
		 {
			 if(!authenticatePageWindowHandle.equals(wh));
			 {
				 driver.switchTo().window(wh);
			 }
		 }
		 Thread.sleep(2000);
		 //handle authentication popup
		 handle_authentication_popup();
	}
	public static void handle_authentication_popup() throws AWTException
	{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_D);
		robot.keyPress(KeyEvent.VK_M);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyRelease(KeyEvent.VK_N);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_D);
		robot.keyPress(KeyEvent.VK_M);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyRelease(KeyEvent.VK_N);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
	}

}
