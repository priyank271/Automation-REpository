package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed_Method {
	//verify the logout link in homepage of actitime or not

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1/login.do;jsessionid=tre8h6drl0k0");
		//identify username text box and pass admin
		driver.findElement(By.name("username")).sendKeys("admin");
		//identify password text box and pass manager
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//identify login button and click
		driver.findElement(By.id("loginButton")).click();
		//identify logout link for verify
		WebElement logoutLinkElement = driver.findElement(By.partialLinkText("Logout"));
		//check for logout link element is displayed or not
		boolean status = logoutLinkElement.isDisplayed();
		System.out.println(status);

	}

}
