package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {
	
	@FindBy(xpath="//input[@value='Create New User']")private WebElement createNewUserButton;
	@FindBy(xpath="//*[@name='username']")private WebElement usnTB;
	@FindBy(xpath="//*[@name='passwordText']")private WebElement pssTB;
	@FindBy(xpath="//*[@name='passwordTextRetype']")private WebElement retypepssTB;
	@FindBy(xpath="//*[@name='firstName']")private WebElement fnTB;
	@FindBy(xpath="//*[@name='lastName']")private WebElement lnTB;
	@FindBy(xpath="//*[@id='right12']")private WebElement modifyTimeTrackCheckbox;
	@FindBy(xpath="//*[@id='right2']")private WebElement manageTaskCheckbox;
	@FindBy(xpath="//*[@id='right1']")private WebElement generateReportCheckbox;
	@FindBy(xpath="//*[@id='right5']")private WebElement manageUsersCheckbox;
	@FindBy(xpath="//*[@id='right7']")private WebElement manageBillingTypesCheckbox;
	@FindBy(xpath="//input[@type='submit']")private WebElement createUserButton;
	@FindBy(xpath="//input[@onclick=\"cancelForm(messageResource.getMessage('user.add.cancel_button_confirm'), '/administration/userlist.do')\"]")private WebElement cancelButton;
	
	public UsersPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getCreateNewUserButton() {
		return createNewUserButton;
	}

	public WebElement getUsnTB() {
		return usnTB;
	}

	public WebElement getPssTB() {
		return pssTB;
	}

	public WebElement getRetypepssTB() {
		return retypepssTB;
	}

	public WebElement getFnTB() {
		return fnTB;
	}

	public WebElement getLnTB() {
		return lnTB;
	}

	public WebElement getModifyTimeTrackCheckbox() {
		return modifyTimeTrackCheckbox;
	}

	public WebElement getManageTaskCheckbox() {
		return manageTaskCheckbox;
	}

	public WebElement getGenerateReportCheckbox() {
		return generateReportCheckbox;
	}

	public WebElement getManageUsersCheckbox() {
		return manageUsersCheckbox;
	}

	public WebElement getManageBillingTypesCheckbox() {
		return manageBillingTypesCheckbox;
	}

	public WebElement getCreateUserButton() {
		return createUserButton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}
	
	public void createManager(String username,String password,String fn,String ln) throws InterruptedException
	{
		createNewUserButton.click();
		Thread.sleep(1000);
		usnTB.sendKeys(username);
		pssTB.sendKeys(password);
		retypepssTB.sendKeys(password);
		fnTB.sendKeys(fn);
		lnTB.sendKeys(ln);
		Thread.sleep(1000);
		modifyTimeTrackCheckbox.click();
		manageTaskCheckbox.click();
		generateReportCheckbox.click();
		manageUsersCheckbox.click();
		manageBillingTypesCheckbox.click();
		Thread.sleep(1000);
		createUserButton.click();
	}

	

}
