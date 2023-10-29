package dropDownHandeling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelected {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Trupti/Desktop/html%20Code/multipledropdown.html");
		
		//driver.findElement(By.xpath("//section[@class='poppins'and(text()='Dropdown')]")).click();
		//Thread.sleep(2000);
		
		///driver.findElement(By.xpath("//a[text()='Multi Select']")).click();
		//Thread.sleep(2000);
		
		
		//identify Multi select dropdown
		WebElement MenuDropdown = driver.findElement(By.xpath("//select[@id='iddd']"));
		Select sell= new Select(MenuDropdown);
		
		//to select Product in Multi dropdown
		for (int i=0;i<4;i++)
		{
			Thread.sleep(2000);
			sell.selectByIndex(i);
		}
		//read only the selected option from menu dropdown
		List<WebElement> allops = sell.getAllSelectedOptions();
		
		//we read list by using for loop
		for(int i=0;i<allops.size();i++)
		{
			String opt = allops.get(i).getText();
			Thread.sleep(2000);
			System.out.println(opt);
			
			
		}
		//we read list by using for each loop
		//for(WebElement op:allops)
		//{
			//String opt1 = op.getText();
			//Thread.sleep(2000);
			//System.out.println(opt1);
		//}
		
		
		
		
	}

}
