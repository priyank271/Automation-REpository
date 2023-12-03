package javaScriptExecutorPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisableWebElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		
		//click on disabled mode
		driver.findElement(By.xpath("//p[text()='Disabled Mode']")).click();
		
		//handle disabled name text box
		//to handle that 1st type the code in the console of html document perform it and then take it in the script
		//explicit type casting into javascriptexecuter
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.getElementById('name').value=('Priya')");
		
		//handle disabled email text box
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("document.getElementById('email').value=('priya123@gmail.com')");
		
		//handle disabled password text box
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("document.getElementById('password').value=('Priya123')");
		
		//click on disabled register button
		WebElement registerButton = driver.findElement(By.xpath("//button[text()='Register']"));
		
		//click on login button
	 	WebElement loginButton = driver.findElement(By.xpath("//span[text()='Login']"));
	 	
	 	
		if(registerButton.isDisplayed())
		{
			jse.executeScript("arguments[0].click()",registerButton);
			Thread.sleep(2000);
			jse.executeScript("argument[0].click()", loginButton);
			
			System.out.println("Click");
		}
		else
		{
			System.out.println("not click");
		}
		
		
			
		
				


	}

}
