package assignmentPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Disabled_WebElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		
		//click on synchronisation dropdown
		driver.findElement(By.xpath("//li[contains(@class,' flex items-center justify-between  ps-5 pe-5')][5]")).click();
		//click on progress bar
		driver.findElement(By.xpath("//section[text()='Progress Bar']")).click();
		//click on disabled element
		driver.findElement(By.xpath("//a[text()='Disabled Element']")).click();
		Thread.sleep(2000);
		//click on Input the time in the given field to set loading time and pass 5sec
		driver.findElement(By.xpath("//input[@type='text' and (@placeholder='Enter time in seconds')]")).sendKeys("5");
		Thread.sleep(2000);
		//WebElement DisableWebElement = driver.findElement(By.xpath("//option[text()='Select your answer']"));
		WebElement DisableWebElement = driver.findElement(By.xpath("//button[text()='Start']']"));
		DisableWebElement.click();
		Thread.sleep(2000);
		if(DisableWebElement.isDisplayed())
		{
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("argument[0].click()",DisableWebElement);
			WebDriver dri = (WebDriver)jse;
			WebElement dropDown1 = driver.findElement(By.xpath("//option[text()='Select your answer']"));
			Select sel = new Select (dropDown1);
			sel.selectByValue("yes");
			Thread.sleep(2000);
			
		}
		
		
	}

}
