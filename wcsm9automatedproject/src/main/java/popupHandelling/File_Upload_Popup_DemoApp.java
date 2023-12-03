package popupHandelling;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class File_Upload_Popup_DemoApp {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		
		//identify popup and click on it
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		//identify file upload and click on it
		driver.findElement(By.xpath("//section[text()='File Uploads']")).click();
		Thread.sleep(2000);
		//click on choose file button
		WebElement fileUpload = driver.findElement(By.xpath("//input[@name='file']"));
		//perform double click on filebutton which opens the file upload popup
		Thread.sleep(2000);
		Actions act = new Actions(driver);
	 	act.doubleClick(fileUpload).perform();
	 	Thread.sleep(2000);
	 	//handle file upload popup
	 	File file = new File("./autoITPgm/DempApps_FileUpload.exe");
	 	String absPath = file.getAbsolutePath();
	 	Runtime.getRuntime().exec(absPath);
	 	Thread.sleep(2000);
	 	Runtime.getRuntime().exec(absPath);
	 	Thread.sleep(2000);
	 	driver.quit();
	 	
	 	
		

	}

}
