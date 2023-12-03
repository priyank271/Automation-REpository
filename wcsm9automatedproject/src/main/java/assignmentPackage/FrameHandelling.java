package assignmentPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandelling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com/");
		//click on google apps
		driver.findElement(By.xpath("//a[@class='gb_d']")).click();
		//handle the frame in which all the appls are present
		//driver.switchTo().frame(1);//way1-int index
		driver.switchTo().frame("app");//way2-string id or name
		//WebElement frameElement = driver.findElement(By.name("app"));way3
		//driver.switchTo().frame(frameElement);//way3
		Thread.sleep(2000);
		//click on maps
		driver.findElement(By.xpath("//span[text()='Maps']")).click();
		
		

	}

}
