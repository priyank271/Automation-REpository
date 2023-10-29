package methodsOfWebDriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FlipkartFindElementsMethod {

	public static void main(String[] args) throws InterruptedException {
		//launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		//handle popup
		driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
		//search for laptops in search box
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("laptops");
		//click on search icon
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		//apply filters
		//1. click on brand 
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		//Brand- click on HP
		driver.findElement(By.xpath("//div[text()='HP']")).click();
		Thread.sleep(2000);
		//2.processor(it is already showing the options)
		//select core i7
		driver.findElement(By.xpath("//div[text()='Core i7']")).click();
		//3. click on OS
		driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		//select the windows 11
		driver.findElement(By.xpath("//div[text()='Windows 11']")).click();
		Thread.sleep(2000);
		//4.select 4 star and above ratings
		driver.findElement(By.xpath("//div[text()='4★ & above']")).click();
		//identify the name of laptops
		List<WebElement> allLaptops = driver.findElements(By.xpath("//div[@class='4rR01T']"));
		//identify price of laptops
		List<WebElement> allPrices = driver.findElements(By.xpath("//div[@class='4rR01T']/ancestor:://div[@class='3pLy-c row'/descendant:://div[@class='_30jeq3 _1_WHN1']"));
		//printing name of all lptops
		for(int i =0;i<allLaptops.size();i++)
		{
			String laptop = allLaptops.get(i).getText();
			Thread.sleep(2000);
			//printing all the prices
			for(int j=i;j<=i;j++)
			{
				
				String price = allPrices.get(j).getText();
				Thread.sleep(2000);
				System.out.println(laptop+" : "+price);
		}
		

			
		}
			
	}

}
