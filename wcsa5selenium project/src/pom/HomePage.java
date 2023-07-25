package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	//store all the home page module 
	@FindBy(xpath="(//IMG[contains(@src,'/img/default/pixel.gif?hash=1692528820')])[4]")private WebElement timeTrackModule;
	@FindBy(xpath="(//img[contains(normalize-space(@class),'sizer')])[1]")private WebElement taskModule;
	@FindBy(xpath="(//img[contains(normalize-space(@class),'si]zer')])[2]")private WebElement reportsModule;
	@FindBy(xpath="(//img[contains(normalize-space(@class),'size]r')])[3]")private WebElement userModule;
	@FindBy(xpath="(//img[contains(normalize-space(@class),'sizer')])[4]")private WebElement workScheduleModule;
	@FindBy(xpath="(//img[contains(normalize-space(@class),'sizer')])[5]")private WebElement settingsModule;
	@FindBy(xpath="//a[text()='Logout']")private WebElement logOutLink;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getTimeTrackModule() {
		return timeTrackModule;
	}

	public WebElement getTaskModule() {
		return taskModule;
	}

	public WebElement getReportsModule() {
		return reportsModule;
	}

	public WebElement getUserModule() {
		return userModule;
	}

	public WebElement getWorkScheduleModule() {
		return workScheduleModule;
	}

	public WebElement getSettingsModule() {
		return settingsModule;
	}

	public WebElement getLogOutLink() {
		return logOutLink;
	}
	
	public void clickOntimeTrackModule()
	{
		timeTrackModule.click();
	}
	public void clickOntaskModule()
	{
	    taskModule.click();	
	}
	public void clickOnreportsModule()
	{
		reportsModule.click();
	}
	public void clickOnusersModule()
	{
		userModule.click();
	}
	public void clickOnworkScheduleModule()
	{
		workScheduleModule.click();
	}
	public void clickOnsettingsModule()
	{
		settingsModule.click();
	}
	public void clickOnlogOutLink()
	{
		logOutLink.click();
	}
	
	}

