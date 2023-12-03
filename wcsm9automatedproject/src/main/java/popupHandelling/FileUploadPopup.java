package popupHandelling;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPopup {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("actitime");
		
		//perform login operation 
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		//inspect setting
		//dic[text()='Settings']//following_sibling::img"
		
		// click  on logo and colors scheme link
		//click on radio button
		//click on choose file button(store it in ref var)
		
		//perform double click on filebutton which opens the file upload popup
	 	Actions act = new Actions(driver);
	 	act.doubleClick(FileButton).perform();
	 	Thread.sleep(2000);
	 	//handle file upload popup
	 	File file = new File("./autoITPgm/FileUpload.exe");
	 	String abspath = file.getAbsolutePath();
	 	Runtime.getRuntime().exec(abspath);
	 	Thread.sleep(4000);
	 	Runtime.getRuntime().exec(abspath);
	 	Thread.sleep(2000);
	 	driver.quit();

	}

}
