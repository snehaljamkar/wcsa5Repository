package webelementmethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://laptop-2ts75ugp/login.do");
		WebElement usnTB = driver.findElement(By.name("username"));
		WebElement passTB = driver.findElement(By.name("pwd"));
		usnTB.sendKeys("admin");
		passTB.sendKeys("manager");
		Thread.sleep(2000);
		usnTB.clear();
		Thread.sleep(2000);
		passTB.clear();
	
	}

}
