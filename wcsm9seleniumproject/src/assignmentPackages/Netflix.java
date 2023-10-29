package assignmentPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Netflix {
	public static void main(String[] args) throws InterruptedException {
		// to Lunch the chrome browser
		WebDriver driver = new ChromeDriver();
		// to maximize the browser
		driver.manage().window().maximize();
		// to launch the web application
		driver.get("https://www.netflix.com/in/");
		//identify phone or email and pass the input as "xyz23@gmail.com"
		driver.findElement(By.tagName("input")).sendKeys("xyz23@gmail.com");
	}	

}





