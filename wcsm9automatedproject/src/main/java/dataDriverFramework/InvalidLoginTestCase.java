package dataDriverFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import readExcelData_Package.WriteExcelData;

public class InvalidLoginTestCase {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("actitime url");
		
		//call the file writeexceldata(create the class of writeexceldata)
		WriteExcelData flib = new WriteExcelData();
		//call the file flib(create class for that
		Flib flib1=new Flib();
		 int rc = flib.rowCount("./src/main/resources/ActiTimeTestData.xlsx", "invalidcreds");
		 for(int i=1;i<=rc;i++)
		 {
			 flib1.readExcelData("./src/main/resources/ActiTimeTestData.xlsx", "invalidcreds", i, 0);
			 flib1.readExcelData("./src/main/resources/ActiTimeTestData.xlsx", "invalidcreds", i, 1);
			 driver.findElement(By.name("username")).sendKeys("");
			 driver.findElement(By.name("pwd")).sendKeys("");
			 driver.findElement(By.id("loginButton")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.name("username")).clear();
			 
		 }
	}

}
