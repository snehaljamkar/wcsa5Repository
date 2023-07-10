package qsp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {
	//how to maximize Child browser
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://omayo.blogspot.com/");
		String parentHandle = driver.getWindowHandle();
		System.out.println("address of parent handle"+parentHandle);
		WebElement childWindow = driver.findElement(By.partialLinkText("Open a popup window"));
		
		Point elementLoc = childWindow.getLocation();
		int xaxis = elementLoc.getX();
		int yaxis = elementLoc.getY();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-80)+")");
		
		childWindow.click();
		Set<String> childHandle = driver.getWindowHandles();
		for(String wh:childHandle)
		{
			if(!parentHandle.equals(wh))
			{
			driver.manage().window().maximize();
			Thread.sleep(2000);
			}		
		}
		driver.quit();
		
		
		
	}

}
