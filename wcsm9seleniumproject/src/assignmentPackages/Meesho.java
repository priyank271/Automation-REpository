package assignmentPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Meesho {

		public static void main(String[] args) throws InterruptedException {
			// to Lunch the chrome browser
			WebDriver driver = new ChromeDriver();
			// to maximize the browser
			driver.manage().window().maximize();
			// to launch the web application
			driver.get("https://www.meesho.com/");
			//identify phone or email and pass the input as "1234567898"
			driver.findElement(By.tagName("input")).sendKeys("Kurti");
		}	

	}



