package qsp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	//To close all the browser without quit
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://omayo.blogspot.com/");
		String parentHandle = driver.getWindowHandle();
		System.out.println("address of parent handle"+parentHandle);
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		Set<String> childHandle = driver.getWindowHandles();
		for(String wh:childHandle)
		{
			Thread.sleep(2000);	
			driver.switchTo().window(wh).close();
			
		}
		
	}

}
