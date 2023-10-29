package dropDownHandeling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElementMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/piyaa/Desktop/WCSM9_WebElements/Single_Select_Dropdown.html");
		//identify single select dropdown
		WebElement dropdown1 = driver.findElement(By.xpath("//select[@id='iddd']"));
		Thread.sleep(2000);
		
		//handle the dropdown
		Select sel1 = new Select(dropdown1);
		Thread.sleep(2000);
		
		//get all option from dropdown by using getwrappedelement method
		WebElement allops = sel1.getWrappedElement();
		Thread.sleep(2000);
		System.out.println(allops.getText());
		
		//get all the options from dropdown by using getoptions Methods
		List<WebElement> allops1 = sel1.getOptions();
		//select the options from drop down 
		for(WebElement op:allops1)
		{
			String selop=op.getText();
			Thread.sleep(2000);
			System.out.println(selop);
		}
		
		
		
	}
}	
