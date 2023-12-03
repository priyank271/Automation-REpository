package pageObjectModelPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import keywordDrivenFramework.Flib;

public class BaseTest extends Flib interface IautoConstant {
	static WebDriver driver;
	public void openBrowser() throws IOException
	{
		Flib flib = new Flib();
		String browserValue=flib.readDataFromProperty("./src/main/resources/config.properties","browser");
		String url=flib.readDataFromProperty("./src/main/resources/config.properties","url");
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if (browserValue.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if (browserValue.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else {
			System.out.println("Browser Value is invalid");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
		
	}
	public void tearDown()
	{
		driver.quit();
	}
	

}


}
