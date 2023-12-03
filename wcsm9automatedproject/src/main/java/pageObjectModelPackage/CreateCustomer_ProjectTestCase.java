package pageObjectModelPackage;

public class CreateCustomer_ProjectTestCase extends BaseTest {
	//to open & close browser
	BaseTest bt=new BaseTest();
	bt.setUp();
	
	//read the data from property and excel file
	Flib flib=new Flib();
	
	//to perform VALID login use login page pom
	HomePage hp=new LoginPage(driver);
	hp.click_on_Tasks_Module();
	Thread.sleep(2000);
	
	//to creat customer and project use TAsksPage pom
	TasksPage tp=new TasksPage(driver)
	
	
	
}
