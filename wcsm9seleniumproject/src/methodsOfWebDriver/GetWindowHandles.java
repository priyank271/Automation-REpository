package methodsOfWebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {
	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//launch the browser
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);
		//take the address of current window or browser
		//parent browser...{the browser or window has controls}
		String parentHandle = driver.getWindowHandle();
		System.out.println("address of parent browser or window:"+parentHandle);
		Thread.sleep(2000);
		//click on open a popup window
		driver.findElement(By.partialLinkText("open a popup window")).click();
		//get the address of parent browser and child browser
		Set<String> allHandles = driver.getWindowHandles();
		//print the address of browser used for each loop
		for(String wh:allHandles)
		{
			if(!parentHandle.equals(wh))
			{
				System.out.println("address of child window:"+wh);
			}
			else
			{
				System.out.println("address of parent window:"+wh);
			}
		}
		
	}

}
