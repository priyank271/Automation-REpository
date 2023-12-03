package pageObjectModelPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//store all the modules of home page of actitime
	//div[text()='Time-Track']/following-sibling::div/img
	@FindBy(xpath = "//div[text()='Time-Track']/following-sibling::div/img") private WebElement Time_Track;
	@FindBy(xpath = "//div[text()='Tasks']/following-sibling::div/img") private WebElement Tasks_Module;
	@FindBy(xpath = "//div[text()='Reports']/following-sibling::div/img") private WebElement Reports_Module;
	@FindBy(xpath = "//div[text()='Users']/following-sibling::div/img") private WebElement Users_Module;
	@FindBy(xpath = "//div[text()='Work Schedule']/following-sibling::div/img") private WebElement Work_schedule_Module;
	@FindBy(xpath = "//div[text()='Settings']/following-sibling::div/img") private WebElement Settings_Module;
	@FindBy(partialLinkText = "Logout") private WebElement Logout_Link;
	
	//initialization
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//utilization

	public WebElement getTime_Track() {
		return Time_Track;
	}

	public WebElement getTasks_Module() {
		return Tasks_Module;
	}

	public WebElement getReports_Module() {
		return Reports_Module;
	}

	public WebElement getUsers_Module() {
		return Users_Module;
	}

	public WebElement getWork_schedule_Module() {
		return Work_schedule_Module;
	}

	public WebElement getSettings_Module() {
		return Settings_Module;
	}

	public WebElement getLogout_Link() {
		return Logout_Link;
	}
	
	//operational method
	public void click_on_Time_Track_Module()
	{
		Time_Track.click();
	}
	public void click_on_Task_Module()
	{
		Tasks_Module.click();
	}
	public void click_on_Reports_Module()
	{
		Reports_Module.click();
	}
	public void click_on_Users_Module()
	{
		Users_Module.click();
	}
	public void click_on_Work_Schedule_Module()
	{
		Work_schedule_Module.click();
	}
	public void click_on_Setting_Module()
	{
		Settings_Module.click();
	}
	
}
