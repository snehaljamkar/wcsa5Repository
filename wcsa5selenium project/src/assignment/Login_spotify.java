package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_spotify {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.spotify.com/en/login?continue=https");
		Thread.sleep(2000);
		driver.findElement(By.id("login-username")).sendKeys("snehaljamkar@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("login-password")).sendKeys("Pass@123");
		Thread.sleep(2000);
		driver.findElement(By.id("type")).click();
		
	}

}
