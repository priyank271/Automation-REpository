package assignmentPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AviVistaraScript {

	public static void main(String[] args) {
		//handle notification pop in chrome browser
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable==notifications");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		driver.findElement(By.id("")).click();

	}

}
