package dropDownHandeling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/admin/Desktop/SeleniumWorkspace/html%20code/3.single%20Select%20static%20Element.html");
		
		WebElement DropDown1 =driver.findElement(By.id("addd"));
		
		//handle the dropdown
		Select sel= new Select(DropDown1);
		Thread.sleep(2000);
		
		//get all the options from dropdown by using getWrappedElement
		
		WebElement allops= sel.getWrappedElement();
		System.out.println(allops.getText());
		
		//get all the options from dropdown by using getoptions
		List<WebElement>options =sel.getOptions();
		
		//select the option from dropdown without using selection method
		for(WebElement opt:options)
		{
			Thread.sleep(2000);
			System.out.println(opt.getText());
				
		}
		
		// select the option from dropdown without using selection method
		for(WebElement opt:options)
		{
			Thread.sleep(2000);
			if(opt.getText().equals("Vadapav"))
			{
				opt.click();
				break;
			}
		}
		
	}

}
