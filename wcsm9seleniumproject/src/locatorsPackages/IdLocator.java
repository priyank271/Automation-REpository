package locatorsPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {

	public static void main(String[] args) throws InterruptedException {
		// to launch the chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/piyaa/Desktop/WCSM9_WebElements/Login_Page.html");
		//identify usernameTB by using id
		driver.findElement(By.id("i1")).sendKeys("admin");
		Thread.sleep(2000);
		//identify passwordTB by using id
		driver.findElement(By.id("id2")).sendKeys("manager");

	}

}
