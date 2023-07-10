package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_github {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		Thread.sleep(2000);
		driver.findElement(By.id("login_field")).sendKeys("snehaljamkar@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Snehal@123");
		Thread.sleep(2000);
		driver.findElement(By.className("btn btn-primary btn-block js-sign-in-button")).click();
		
	}

}
