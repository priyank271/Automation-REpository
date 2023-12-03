package popupHandelling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		
		//identify popup and click on it
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
				
		//click on javascript
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		
		//click on prompt webelement
		driver.findElement(By.xpath("//a[text()='Prompt']")).click();
		Thread.sleep(2000);
		
		//click on prompt alert box
		driver.findElement(By.xpath("//button[text()='Prompt Alert Box']")).click();
		Thread.sleep(2000);
		
		//pass text as yes in popup
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys("Yes");

		Thread.sleep(2000);
		
		//click on ok button i.e accept the popup
		prompt.accept();
		
		//get Text of the popup
		String getText = prompt.getText();
		System.out.println(getText);

	}

}
