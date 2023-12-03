package assignmentPackage;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_Assignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://jqueryui.com/droppable/");
		//draggable and droppable elements are designed under frame
		//handle frame by using switchTo control to frame
		driver.switchTo().frame(0);//way:1-using index
		//WebElement frameElement = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));//way:2 using name or id
		//driver.switchTo().frame(frameElement);//way3 By using webelement frame
		Thread.sleep(2000);
		///driver.switchTo().frame(0);
		//identify chat box frame and click on it
		driver.findElement(By.xpath("//iframe[@class='demo-frame']")).click();
		//perform drag and drop action
		//store all the drag elements
	 	WebElement draggable = driver.findElement(By.id("draggable"));
	 	//store al the drop elements
	 	WebElement droppable = driver.findElement(By.id("droppable"));
	 	//perform drag and drop
	 	Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.dragAndDrop(draggable, droppable).perform();
		
		

	}

}
