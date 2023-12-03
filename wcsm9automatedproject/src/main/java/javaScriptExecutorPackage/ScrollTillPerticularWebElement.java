package javaScriptExecutorPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScrollTillPerticularWebElement {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		//inspect twitter symbol
		//create a ref variable
		WebElement twitterSymbol = driver.findElement(By.xpath("//i[@class='fab fa-twitter']"));
		Point loc = twitterSymbol.getLocation();
		int xaxis = loc.getX();
		int yaxis = loc.getY();
		
		//perform scroll down
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
		
		Thread.sleep(2000);
		//take screen shot of that symbol
		File src = twitterSymbol.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/twitterSymbol.jpg");
		Files.copy(src, dest);
		
		//way2
		//without taking screen shot how to scroll upto the webelemnt
		//jse.executeScript("argument[0].scrollIntoView(true)",twitterSymbol);
		
		
		
	}

}
