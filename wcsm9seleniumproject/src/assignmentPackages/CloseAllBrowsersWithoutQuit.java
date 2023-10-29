package assignmentPackages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllBrowsersWithoutQuit {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		String parentHandle = driver.getWindowHandle();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		Thread.sleep(2000);
		Set<String> allHandles = driver.getWindowHandles();
		for(String wh:allHandles)
		{
		if (!parentHandle.equals(wh))
		{
			driver.switchTo().window(wh).close();
		}
			driver.switchTo().window(wh).close();
			
		}
		
		
	}

}
