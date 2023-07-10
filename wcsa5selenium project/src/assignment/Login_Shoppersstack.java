package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Shoppersstack {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/user-signin");
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("snehaljamkar@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("Pass@123");
		Thread.sleep(2000);
		driver.findElement(By.id("Login")).click();
	}

}
