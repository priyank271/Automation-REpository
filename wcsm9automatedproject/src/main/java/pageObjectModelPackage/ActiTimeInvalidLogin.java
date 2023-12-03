package pageObjectModelPackage;

public class ActiTimeInvalidLogin extends BaseTest {
	public static void main(String[] args) {
		//to open and close browsers
		BaseTest bt = new BaseTest();
		bt.setUp();
		//get webelement from login pom class
		LoginPage lp = new LoginPage(driver);
		//read data from excel sheet
		Flib flib = new Flib();
		//read rowcount
		 int rc=flib.rowCount(EXCEL_PATH, INVALIDCREDS_SHEET);
		 for(int i=1;i<=rc;i++)
		 {
			 //get the method from login from loginpage pom class
			 lp.invalidLogin(EXCEL_PATH,INVALIDCREDS_SHEET,I,0),flib.readDataFromProperty(null, null);
		 }
		 bt.tearDown();
		

}
