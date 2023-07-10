package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_facebook {
      public static void main(String[] args) throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
  		WebDriver driver=new ChromeDriver();
  		driver.manage().window().maximize();
  		driver.get("https://www.facebook.com/");
  		Thread.sleep(2000);
  		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
  		Thread.sleep(2000);
  		driver.findElement(By.id("pass")).sendKeys("Pass@123");
  		Thread.sleep(2000);
  		driver.findElement(By.id("u_0_5_7B")).click();
  		Thread.sleep(2000);
  		 
  		
	}
}
