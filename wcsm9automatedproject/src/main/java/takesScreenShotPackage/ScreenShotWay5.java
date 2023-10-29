package takesScreenShotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotWay5 {

	public static void main(String[] args) throws IOException {
		//explicit type cast into TakesScreenShot (I)
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev");
		
		//take screen shot of the web page
		TakesScreenshot ts = (TakesScreenshot)driver;
		//call the method
		//take the screen shot
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		//define way for storing screen shot
		// use relative method of x path to get file path ie ./
		File dest = new File("./Screenshots/seleniumss.png");
		//store the screen shot into the destination(dest)
		//use third party class i.e Files
		Files.copy(src, dest);
	}

}
