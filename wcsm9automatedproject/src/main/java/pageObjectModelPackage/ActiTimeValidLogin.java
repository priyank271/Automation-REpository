package pageObjectModelPackage;

public class ActiTimeValidLogin extends BaseTest {
	public static void main(String[] args) {
		//to open and close browsers
		BaseTest bt = new BaseTest();
		bt.setUp();
		//get webelement from login pom class
		LoginPage lp = new LoginPage(driver);
		//read data from property file
		Flib flib = new Flib();
		lp.validLogin(flib.readDataFromProperty(PROP_PATH,"username"),flib.readDataFromProperty(PROP_PATH,"password"));
		Thread.sleep(2000);
		bt.tearDown();
		
	}

}
