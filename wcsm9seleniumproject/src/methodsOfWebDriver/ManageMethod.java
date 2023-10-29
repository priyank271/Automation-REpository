package methodsOfWebDriver;




import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ManageMethod {
	public static void main(String[] args) throws InterruptedException {
		// Launch the browser
		WebDriver driver = new ChromeDriver();
		//handle the properties of browser such as 
		//maximize
		//minimize
		//full screen
		//set size
		//set position
		//maximize the browser
		driver.manage().window().maximize();
		//minimize the browser
		driver.manage().window().minimize();
		Thread.sleep(2000);
		//full screen the browser
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		//set the size of the browser
		Dimension targetSize = new Dimension (350, 450);
		driver.manage().window().setSize(targetSize);
		Thread.sleep(2000);
		//set position of browser
		Point targetPosition = new Point(450,350);
		driver.manage().window().setPosition(targetPosition);
		
		
	}

}
