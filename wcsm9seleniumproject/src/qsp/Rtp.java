package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Rtp {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// to take input from user
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the browser value");
		  String browservalue = sc.next();
		  
		  if(browservalue.equalsIgnoreCase("chrome"))
		  {
			  driver = new ChromeDriver();
			  driver.manage().window().maximize();
			  Thread.sleep(2000);
			  driver.close();
		  }
		  else if (browservalue.equalsIgnoreCase("Firefox"))
		  {	  
			  driver = new FirefoxDriver();
		  	  driver.manage().window().maximize();
		  	  Thread.sleep(2000);
		  }
		  else if (browservalue.equalsIgnoreCase("Edge"))
		  {
			  driver = new EdgeDriver();
			  driver.manage().window().maximize();
			  Thread.sleep(2000);
		  }
		  else
		  {
			  System.out.println("Enter the correct browser name");
		  }	  
		  }
	
	
	

}
