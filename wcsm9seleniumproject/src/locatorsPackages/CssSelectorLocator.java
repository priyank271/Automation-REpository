package locatorsPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		Thread.sleep(2000);
		//identify username textbox by using css Selector
		driver.findElement(By.cssSelector("input[placeholder='Usrname']))."sendKeys("Admin");
		Thread.sleep(2000);
		//identify password textbox by using css Selector
		driver.findElement(By.cssSelector("input[placeholder='Password']))."sendKeys("Admin");
		Thread.sleep(2000);
		//identify Login button  textbox by using css Selector
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(2000);
		
		
		
		
				
}

}
