package javaScriptExecutorPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Scroll_Disable_ScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://omayo.blogspot.com/");
		
		//scroll till disable text box for that take location of that textbox
		WebElement disabledTextBox = driver.findElement(By.id("tb2"));
		 Point loc = disabledTextBox.getLocation();
		 int xaxis = loc.getX();
		 int yaxis = loc.getY();
		 
		 //perform scroll down upto disable text box
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 Thread.sleep(2000);
		 jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-40)+")");
		 
		 //handle disable tetbox
		 jse.executeScript("document.getElementById('tb2').value='Automation Testing'");
		 
		 Thread.sleep(2000);
		 //take the screen shot of that text box
		 File src = disabledTextBox.getScreenshotAs(OutputType.FILE);
		 File dest = new File("./Screenshots/DisabledTextBox.png");
		 Files.copy(src, dest);
		 
		 
		 
		
		

	}

}
