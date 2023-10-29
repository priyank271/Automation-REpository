package robotPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass_RobotClass {

	
		public static void main(String[] args) throws AWTException, InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.selenium.dev");
			//inspect news webelement
			WebElement newsElement = driver.findElement(By.xpath("//h2[text()='News']"));
			//right click on News WbElement
			Actions act = new Actions(driver);
			Thread.sleep(2000);
			act.contextClick(newsElement).perform();
			
			//create new object for robot class to perform page down
			//press pagedown go till to inspect
			Robot robot = new Robot();
			//to go till 10th no. of inspect page use for loop 
			for(int i = 0;i<=10;i++)
			{
			Thread.sleep(2000);	
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
			}
			Thread.sleep(2000);
			//hit enter button
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
			
			

	}

}
