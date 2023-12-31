package keywordDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginTestCase extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException{
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		Flib flib = new Flib();
		
		driver.findElement(By.name("username")).sendKeys(flib.readPropertyData(PROP_PATH, "Username"));
		driver.findElement(By.name("pwd")).sendKeys(flib.readPropertyData(PROP_PATH, "Password"));
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(2000);
		
		bt.closeBrowser();
		
		
}
}

	
