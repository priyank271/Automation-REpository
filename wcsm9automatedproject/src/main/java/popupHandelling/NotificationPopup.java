package popupHandelling;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class NotificationPopup {
	static WebDriver driver;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter browser value");
		String browserValue = sc.next();
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--disable-notifications");
			driver = new ChromeDriver(co);
		}
		else if (browserValue.equalsIgnoreCase("firefox"))
		{
			FirefoxOptions fo = new FirefoxOptions();
			fo.addArguments("--disable-noitifications");
			driver = new FirefoxDriver(fo);
		}
		else
		{
			System.out.println("Enter the valid browser value!!");
		}
		driver.get("https://www.irctc.co.in/nget/train-search");
			
		

	}

}
