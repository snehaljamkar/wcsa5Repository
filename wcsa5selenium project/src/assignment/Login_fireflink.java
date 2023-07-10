package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_fireflink {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.fireflink.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("mui-1")).sendKeys("snehaljamkar@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("mui-2")).sendKeys("Password@123");
		Thread.sleep(2000);
		driver.findElement(By.id("4gbe2n")).click();
		
	}

}
