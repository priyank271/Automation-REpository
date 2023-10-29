package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Attribute {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 //get the attribute value of login button
		 WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		 String attributeValue = login.getAttribute("class");
		 System.out.println("The attribute value of class is : "+attributeValue);
		 Thread.sleep(2000);
		 //get the css property of login button i.e color
		 String cssValue = login.getCssValue("color");
		 System.out.println("the color of the login button is : "+cssValue);
		 Thread.sleep(2000);
		 //get the tag name of login button
		 String tagName = login.getTagName();
		 System.out.println("the tag name of the login button is :"+tagName);
	}

}
