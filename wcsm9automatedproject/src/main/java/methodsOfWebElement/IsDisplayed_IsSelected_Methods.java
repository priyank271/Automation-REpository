package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed_IsSelected_Methods {
	
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1/login.do;jsessionid=67kvl2921akfl");
		//Verify login button in homepage of actitime is displayed or not
		WebElement loginButton = driver.findElement(By.xpath("//a[text()='Login']"));
		boolean login = loginButton.isDisplayed();
		System.out.println("The logout link on homepage of actitime is Displayed = "+login);
		
		//identify check box to verify
		WebElement checkBox = driver.findElement(By.xpath("//input[@value='on']"));
		//check the checkbox is selected or not
		boolean check = checkBox.isSelected();
		System.out.println("Verify checkbox in login page selected or not = "+check);
		//select the check box and verify the status
		checkBox.click();
		boolean check1 = checkBox.isSelected();
		System.out.println("Verify checkbox in login page selected or not = "+check1);
	}

}
