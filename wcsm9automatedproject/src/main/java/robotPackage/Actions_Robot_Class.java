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

public class Actions_Robot_Class {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		//handle popup
		driver.findElement(By.xpath("//span[@class='deny-btn']")).click();
		//perform mouseHover action on watch jwellary
		WebElement watchJwellary = driver.findElement(By.xpath("//a[@title='Watch Jewellery']"));
		Actions act = new Actions(driver);
		act.moveToElement(watchJwellary).perform();
		//click on band
		driver.findElement(By.xpath("//a[@title='Band']")).click();
		//go to the filtered by 
		WebElement filteredBy = driver.findElement(By.xpath("//span[text()='FILTERED BY']"));
		//perform actions class method i.e copyandhold method
		 Actions mouse = new Actions(driver);
		 mouse.moveToElement(filteredBy).perform();
		 //to do both the task such as double click and clickandhold(select whole text) we use for loop
		 for(int i = 1; i<=2;i++)
		 {
			 act.doubleClick(filteredBy).perform();
			 Thread.sleep(2000);
			 act.clickAndHold(filteredBy).perform();
		 }
		 //copy the filter by text using robot class
		 Robot robot = new Robot();
		 Thread.sleep(2000);
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyRelease(KeyEvent.VK_C);
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 robot.keyRelease(KeyEvent.VK_C);
		 
		 //go to the search bar and inspect it
		 driver.findElement(By.xpath("//input[@id='search_query_top_elastic_search']"));
		 //pass the filter by text to the search icon
		 Thread.sleep(2000);
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_V);
		 Thread.sleep(2000);
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 robot.keyRelease(KeyEvent.VK_V);
		 Thread.sleep(2000);
		 
		 //click on search icon
		 driver.findElement(By.xpath("//input[@type='submit']")).submit();
		 
	}

}
