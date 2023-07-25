package pom;

public class WoekLib extends BaseTest {
	public void handleConfirmationPopup()
	{
		driver.switchTo().alert().accept();
	}

}
