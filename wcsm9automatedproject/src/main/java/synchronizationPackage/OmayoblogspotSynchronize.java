package synchronizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OmayoblogspotSynchronize {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//apply the implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.xpath("//button[text()='Dropdown']")).click();
		//apply the explicit wait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.id("Check")));
		ele.click();
		driver.findElement(By.xpath("//a[text()='Flipkart']")).click();

	}

}
