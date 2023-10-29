package actionsPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VerifyWithoutUsingActionCLass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		//handle popup
		driver.findElement(By.id("denyBtn")).click();
		//click on coins
		WebElement coinsTarget = driver.findElement(By.xpath("//a[@title='Coins']"));
		//use actions class for mouse hover
		Actions act = new Actions(driver);
		act.moveToElement(coinsTarget).build().perform();
		
		Thread.sleep(2000);
		//click on coins by design
		driver.findElement(By.xpath("//span[@class='prcs-d']")).click();
		//verify the text lakshigoldcoins
		//h1[text='LakshmiGoldCoins']
		Thread.sleep(2000);
		if(driver.findElement(By.xpath("//h1[text=' Goldcoins ']")).isDisplayed())
		{
			System.out.println("text is displayed");
		}
		else
			System.out.println("text is not displayed");
			
		
	}

}
