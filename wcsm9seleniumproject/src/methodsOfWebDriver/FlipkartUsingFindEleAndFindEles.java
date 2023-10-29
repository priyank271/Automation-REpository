package methodsOfWebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartUsingFindEleAndFindEles {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		//handle popup
		driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
		//click on search textBox
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).click();
		//pass laptops in search textbox
		driver.switchTo().activeElement().sendKeys("laptops");
		//click on search icon
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		//apply filters
		//1.processor - click on core i5 checkBox
		driver.findElement(By.xpath("//div[text()='Core i7']")).click();
		Thread.sleep(3000);
		//handle scroll bar
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 250)");
		//2.click on operating systems
		driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		//operating system - click on windows 11
		driver.findElement(By.xpath("//div[text()='Windows 11']")).click();
		Thread.sleep(2000);
		//3.click on brand
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		//brand - click on HP
		driver.findElement(By.xpath("//div[text()='HP']")).click();
	   //Thread.sleep(3000);
        //JavascriptExecutor jse = (JavascriptExecutor)driver;
        //jse.executeScript("window.scrollBy(0,700)");
       // WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        //Thread.sleep(2000);
		//4.click on customer ratings
		driver.findElement(By.xpath("//div[text()='Customer Ratings']")).click();
		Thread.sleep(2000);
		//Customer ratings - click on 4* & above checkBox
		driver.findElement(By.xpath("//div[text()='4★ & above']")).click();
		
        

	}

}
