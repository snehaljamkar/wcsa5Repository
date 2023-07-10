package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingAxes {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://laptop-2ts75ugp/login.do");
		driver.findElement(By.xpath("//input[@name='submitted']/preceding-sibling::input[@name='password']"));
		driver.findElement(By.xpath("//input[@name='password']/following-sibling::input[@name='submitted']"));
	}

}
