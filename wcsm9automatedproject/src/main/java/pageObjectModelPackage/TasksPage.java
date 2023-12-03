package pageObjectModelPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TasksPage {
	
	//Store all the web elements of tasks page of actitime
	//inspect project and customers
	@FindBy(partialLinkText = "Projects & Customers") private WebElement Project_Customers_Sub_Module;
	
	@FindBy(xpath = "//input[@value='Create New Customer']") private WebElement Create_New_Customer_Button;
	@FindBy(xpath = "//input[@value='Create New Project']") private WebElement Create_New_Project_Button;
	
	@FindBy(name = "name") private WebElement Customer_nameTB;
	@FindBy(name = "createCustomerSubmit") private WebElement createCustomer_Button;
	
	@FindBy(name = "cutomerId") private WebElement customer_name_dropDown;
	@FindBy(name = "name") private WebElement project_nameTB;
	@FindBy(name = "createProjectSubmit") private WebElement createProject_Button;
	
	public TasksPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//utilization

	public WebElement getProject_Customers_Sub_Module() {
		return Project_Customers_Sub_Module;
	}

	public WebElement getCreate_New_Customer_Button() {
		return Create_New_Customer_Button;
	}

	public WebElement getCreate_New_Project_Button() {
		return Create_New_Project_Button;
	}

	public WebElement getCustoer_nameTB() {
		return Custoer_nameTB;
	}

	public WebElement getCreateCustomer_Button() {
		return createCustomer_Button;
	}

	public WebElement getCustomer_name_dropDown() {
		return customer_name_dropDown;
	}

	public WebElement getProject_nameTB() {
		return project_nameTB;
	}

	public WebElement getCreateProject_Button() {
		return createProject_Button;
	}
	
	//Operational method
	public void createcustomer_createproject_method(String cust_name,String pro_name) throws InterruptedException
	{
		Project_Customers_Sub_Module.click();
		Thread.sleep(2000);
		Create_New_Customer_Button.click();
		Thread.sleep(2000);
		Customer_nameTB.sendKeys(cust_name);
		Thread.sleep(2000);
		createCustomer_Button.click();
		Thread.sleep(2000);
		Create_New_Project_Button.click();
		Select sel = new Select (customer_name_dropDown);
		sel.selectByVisibleText(cust_name);
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
