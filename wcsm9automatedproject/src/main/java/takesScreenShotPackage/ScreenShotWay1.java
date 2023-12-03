package takesScreenShotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotWay1 {

	public static void main(String[] args) throws IOException {
		//directly create the obj of browsers classes
	 	ChromeDriver driver = new ChromeDriver();
	 	driver.manage().window().maximize();
	 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 	driver.get("https://demoapps.qspiders.com/");
	 	//take the ss of demoapps
	 	File src = driver.getScreenshotAs(OutputType.FILE);
	 	File dest = new File("./Screenshots/demoapps.jpg");
	 	Files.copy(src, dest);
	 	
	 	

	}

}
