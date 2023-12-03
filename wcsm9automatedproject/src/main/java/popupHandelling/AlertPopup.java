package popupHandelling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		
		//identify popups and click 
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		Thread.sleep(2000);
		//indetify javascript and click on it
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		Thread.sleep(2000);
		//inspect the alert box and click on it
		//generate alert popup
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Thread.sleep(2000);
		//handle alert popup
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		//get the text of alert popup
		String textOfAlert = alert.getText();
		System.out.println(textOfAlert);
		//accept alert popup
		//alert.accept();
		//dismiss alert popup
		alert.dismiss();
		
		

	}

}
