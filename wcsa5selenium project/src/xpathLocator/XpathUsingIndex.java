package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingIndex {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://laptop-2ts75ugp/login.do");
		driver.findElement(By.xpath("//input[@class='textField'][1]")).sendKeys("admin");
		Thread.sleep(2000);
		driver.quit();
	}

}
