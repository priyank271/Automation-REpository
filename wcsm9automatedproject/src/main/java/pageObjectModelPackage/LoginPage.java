package pageObjectModelPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//store all the webelements of the login page of actitime
	
	//identify username webelement
	@FindBy(name = "username") private WebElement usnTB;
	//identify password webelement
	@FindBy(name = "pwd") private WebElement pwdTB;
	//identify login webelement
	@FindBy(id = "loginButton") private WebElement loginButton; 
	//identify chechbox
	@FindBy(name = "remember") private WebElement keepMeLoginCheckBox;
	//inspect actitme text
	@FindBy(partialLinkText = "Actitime") private WebElement actiMindLink;
	@FindBy(partialLinkText = "License") private WebElement licenseLink;
	
	
	//initialization
	//initialize all the webelements at once
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	//utilization
	//(right click on script-source-generate getter and setter-select getter-click on finish)

	public WebElement getUsnTB() {
		return usnTB;
	}


	public WebElement getPwdTB() {
		return pwdTB;
	}


	public WebElement getLoginButton() {
		return loginButton;
	}


	public WebElement getKeepMeLoginCheckBox() {
		return keepMeLoginCheckBox;
	}


	public WebElement getActiMindLink() {
		return actiMindLink;
	}


	public WebElement getLicenseLink() {
		return licenseLink;
	}
	
	//Operational method
	//method for valid
	public void validLogin(String validusn,String validpwd)
	{
		usnTB.sendKeys(validusn);
		pwdTB.sendKeys(validpwd);
		loginButton.click();
	}
	//method for invalid
	public void invalidLogin(String invalidusn, String invalidpwd)
	{
		usnTB.sendKeys(invalidusn);
		pwdTB.sendKeys(invalidpwd);
		loginButton.click();
		usnTB.clear();
	}
	
	
	
	

		
	
	
	 
	
}
