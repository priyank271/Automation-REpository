package actionsPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChatBox_BlueStone {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		//handle popup
		driver.findElement(By.xpath("//span[text()='Not now']")).click();
		Thread.sleep(2000);
		//handle chatbox frame by using switchto control to frame
	    driver.findElement(By.xpath("//iframe[@name='fc_widget']")).click();
		Thread.sleep(2000);
		//in chatbox pass name as priya
		driver.findElement(By.xpath("//input[@type='nametext']")).sendKeys("priya");
		//pass email as priya123@gmail.com
		driver.findElement(By.id("chat-fc-email")).sendKeys("priya123@gmail.com");
		//pass mobile no. as 1234567898
		driver.findElement(By.id("chat-fc-phone")).sendKeys("1234567898");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Start Chat']")).click();
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
