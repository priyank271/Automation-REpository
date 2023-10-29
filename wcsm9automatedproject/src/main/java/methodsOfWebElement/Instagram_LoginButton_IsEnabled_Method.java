package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram_LoginButton_IsEnabled_Method {
	//Verify the login button on instagram is enable or not

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.instagram.com/");
		
		//identify login button
		WebElement loginButton = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
		
		//verify login button is enable or disable
		boolean enabled = loginButton.isEnabled();
		System.out.println("The login button of instagram is enabled? => "+enabled);
		
		//will click on button by using submit method
		//loginButton.click();
	}

}
