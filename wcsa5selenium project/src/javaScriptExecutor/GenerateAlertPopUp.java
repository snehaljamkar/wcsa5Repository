package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenerateAlertPopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Snehal/Desktop/selenium/Textbox.html");
		driver.findElement(By.id("i1")).sendKeys("admin");
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		jse.executeScript("alert('Hello There!!')");
		
	}

}
