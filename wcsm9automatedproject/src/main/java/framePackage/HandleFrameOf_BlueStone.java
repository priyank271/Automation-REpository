package framePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrameOf_BlueStone {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		//handle popup
		driver.findElement(By.xpath("//span[text()='Not now']")).click();
		//switch the controls to frame
		Thread.sleep(2000);
		//WebElement frameElement = driver.findElement(By.id("fc_widget"));//way3
		//driver.switchTo().frame(frameElement);//way3
		
		driver.switchTo().frame("fc_widget");//way2-string name or id
		
		//driver.switchTo().frame(6);//way1- pass int index value
		
		//click on chat box
		driver.findElement(By.id("chat-icon")).click();
		//handle all the txtbox present under chatbox
		//all the text box designed with webpage so switch back to main page
		driver.switchTo().defaultContent();
		//in chatbox pass name as priya
		driver.findElement(By.xpath("//input[@type='nametext']")).sendKeys("priya");
		//pass email as priya123@gmail.com
		driver.findElement(By.id("chat-fc-email")).sendKeys("priya123@gmail.com");
		//pass mobile no. as 1234567898
		driver.findElement(By.id("chat-fc-phone")).sendKeys("1234567898");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Start Chat']")).click();
		

	}

}
