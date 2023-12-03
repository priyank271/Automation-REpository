package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ActiTimeInvalidLogin extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		//to launch the browser and close the browser we have to create the obj of base test
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		//to read the data from excel file we use flib
		Flib flib = new Flib();
		int rc = flib.rowCount("./src/main/resources/ActiTimeTestData.xlsx","Invalidcreds");
		
		for (int i =1;i<=rc;i++)
		{
		
		//to read username from readdatafromexcel
		flib.readExcelData(EXCEL_PATH,INVALIDCREDS_SHEET,i,0);
		//to read password from readdatafromexcel
		flib.readExcelData(EXCEL_PATH,INVALIDCREDS_SHEET,i,1);
		
		
		//identify user name text box
		WebElement usnTB = driver.findElement(By.name("username"));
		usnTB.sendKeys(flib.readExcelData(EXCEL_PATH,INVALIDCREDS_SHEET,i,0));
		//identify password text box
		WebElement pwdTB = driver.findElement(By.name("password"));
		pwdTB.sendKeys(flib.readExcelData(EXCEL_PATH,INVALIDCREDS_SHEET,i,1));
		//identify login button
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("username"));
		}
	}
	

}
