package testngExecutionPackage;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SelectTest {
  static WebDriver driver;
  @Parameters({"browser","url","username","password"}   )
  @Test
  public void selectTestMethod(String browserValue) {
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browserValue.equalsIgnoreCase("Firfox"));
		{
			driver=new FirefoxDriver();
		}
		else if(browserValue.equalsIgnoreCase("Edge"));
		{
			driver=new EdgeDriver();
			
		}
		else {
			Reporter.log("enter valid browser vlaue",true);
			
		}
		driver.m
		
	  
  }
}
