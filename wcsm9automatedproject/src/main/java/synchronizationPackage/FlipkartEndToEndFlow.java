package synchronizationPackage;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FlipkartEndToEndFlow {

	public static void main(String[] args)  {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.get("https://www.flipkart.com/");
	//handle the popup
	 driver.findElement(By.xpath("//span[contains(@role,'button')]")).click();
	 //search iphone
	 driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("iphone");
	 //WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	 //click on search icon
	 driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
	 //get the address of parent window
	 String parentHandle = driver.getWindowHandle(); 
	 //click on 2nd option mobile name
	 driver.findElement(By.xpath("//div[class='4rR01T'][2]")).click();
	 //get the address of all the windows
	 Set<String> allHandles = driver.getWindowHandles();
	 //switch control from parent to child window
	 for(String wh:allHandles)
	 {
		 if(!parentHandle.equals(wh));
		 {
			 driver.switchTo().window(wh);
		 }
	 }
	 //select the mobile color
	 driver.findElement(By.xpath("//div[@class='_2C4lO'])")).click();
	 //select the storage for mobile
	 driver.findElement(By.partialLinkText("256 GB")).click();
	 //enter the pincode
	 driver.findElement(By.id("pinodeInputId")).clear();
	 driver.findElement(By.id("pinodeInputId")).sendKeys("411033");
	 //click on check button
	 driver.findElement(By.xpath("//span[Taxt()='Ckeck']")).click();
	 //click on remove button
	 WebElement removeButton = driver.findElement(By.xpath("//div[text()='Remove']"));
	 Point loc = removeButton.getLocation();
	 int xaxis = loc.getX();
	 int yaxis = loc.getY();
	 JavascriptExecutor jse = (JavascriptExecutor)driver;
	 //again click on remove button which is present on popup
	 driver.findElement(By.)).
	 
	 

	}

}
