package dropDownHandeling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetfirstSelectedOption {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/admin/Desktop/SeleniumWorkspace/html%20code/3.single%20Select%20static%20Element.html");
		
		WebElement DropDown1 =driver.findElement(By.id("addd"));
		
		//handle the dropdown
		Select sel= new Select(DropDown1);
		Thread.sleep(2000);
		
		//select option from dropdown
		sel.selectByValue("v7");
		Thread.sleep(2000);
		
		//get the  option which is selected first
		WebElement firstOpts =sel.getFirstSelectedOption();
		//get the text firstOpt
		System.out.println(firstOpts.getText());
		
		
		//multiselect Dropdown
		
        driver.navigate().to("file:///C:/Users/admin/Desktop/SeleniumWorkspace/html%20code/3.1Multiple%20select%20Dynamic%20Element.html");
		
		WebElement DropDown2 =driver.findElement(By.id("addd"));
		
		//handle the dropdown
				Select sel2= new Select(DropDown2);
				
				//select multiple option from multiselect dropdown
				for(int i=0;i<8;i++)
				{
					Thread.sleep(2000);
					sel2.selectByIndex(i);
					
				}
				
				//get option which is selected first
				Thread.sleep(2000);
				System.out.println(sel2.getFirstSelectedOption().getText());
				}
}
		
		
		

		



