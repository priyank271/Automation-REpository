package methodsOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {

	public static void main(String[] args) throws InterruptedException {
	 	WebDriver driver = new ChromeDriver();
	 	driver.manage().window().maximize();
	 	driver.get("https://www.google.com/");
	 	driver.switchTo().activeElement().sendKeys("bike");
	 	Thread.sleep(2000);
	 	//identify all the suggestions of bike
	 	List<WebElement> bikeOptions = driver.findElements(By.xpath("//div[@class='wM6W7d"));
	 	//read all the suggestions of bike by using for loop
	 	Thread.sleep(2000);
	 	//WebDriver bikeOptions;
		//for(int i = 0;i<bikeOptions.size();i++)
	 	//{
	 	 //	 String options = bikeOptions.get(i).getText();
	 	//}
	 	WebElement bikOptions;
		Thread.sleep(2000);
		for(WebElement op:bikeOptions)
		{
			String options = op.getText();
			Thread.sleep(2000);
			System.out.println(options);
		}
	}

}
