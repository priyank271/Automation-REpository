package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {
	public static void main(String[] args) throws InterruptedException {
		//Launch the chrome browser
		 WebDriver driver=new ChromeDriver();  
		 //maximize the browser
		 driver.manage().window().maximize();
		 //Launch the web application
		 driver.get("https://www.primevideo.com");
		 //to stop the execution of script for 2 sec
		 Thread.sleep(2000);
		 // close the browser
		 driver.close();
		 
	

}
}