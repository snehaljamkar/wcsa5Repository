package qsp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.click();
		search.sendKeys("samsung mobile");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Samsung Galaxy M14 5G (ICY Silver, 6GB, 128GB Storage) | 50MP Triple Cam | 6000 mAh Battery | 5nm Octa-Core Processor | 12GB RAM with RAM Plus | Android 13 | Without Charger'])[1]")).click();
		Thread.sleep(2000);
		Set<String> allwindow = driver.getWindowHandles();
		for(String wh:allwindow)
		{
			driver.switchTo().window(wh);
		}
		driver.findElement(By.id("contextualIngressPtLabel_deliveryShortLine")).click();
		Thread.sleep(2000);
		WebElement deliverpin = driver.findElement(By.id("GLUXZipUpdateInput"));
		deliverpin.click();
		deliverpin.sendKeys("411033");
		driver.findElement(By.xpath("//input[@class='a-button-input' and @type='submit' and @aria-labelledby='GLUXZipUpdate-announce']")).click();
		driver.findElement(By.id("add-to-cart-button")).click();
//		if(driver.findElement(By.xpath("(//h4[text()='Added to Cart'])[1]")).isDisplayed())
//		{
//			driver.findElement(By.id("//span[@id='attach-sidesheet-view-cart-button']")).click();
//			Thread.sleep(2000);
//		}
//		driver.findElement(By.name("submit.delete.7b9d9531-d8b9-4881-a59d-7823c9bbd46e")).click();
//		
	}

}
