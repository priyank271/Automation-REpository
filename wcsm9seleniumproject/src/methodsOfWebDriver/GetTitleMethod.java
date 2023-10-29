package methodsOfWebDriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {
	public static void main(String[] args) throws InterruptedException {
	//Launch the Webdriver
	 WebDriver driver = new ChromeDriver();
	 //maximize the driver
	 driver.manage().window().maximize();
	 //launch the web application
	 driver.get("https://www.flipkart.com");
	 //to stop the execution of script for 2 sec
	 Thread.sleep(2000);
	 //get the title of current webpage
	 String titleOfPage = driver.getTitle();
	 System.out.println(titleOfPage);
	 System.out.println(driver.getTitle());
	 
	 
	 //pass the input as admin to username textbox
	// driver.findElement(By.name("username")).sendKeys("admin");
	 
	//pass the input as manager to password textbox
	 //driver.findElement(By.name("pwd")).sendKeys("manager");
	 //click on login button
	 //driver.findElement(By.id("loginButton")).click();
	 
	 //we are there in home page
	 //take a title of home page
	 //new = driver.getTitle()

	}
	
}

