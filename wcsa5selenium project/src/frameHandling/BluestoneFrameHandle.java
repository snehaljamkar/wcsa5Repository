package frameHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BluestoneFrameHandle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(2000);
		//Handle frame by using index
		//driver.switchTo().frame(5);
		//Thread.sleep(2000);
	   // driver.findElement(By.xpath("//div[@id='chat-icon']")).click();
		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("chat-icon"))).click();
		
		//handle frame by using String name or id
		driver.switchTo().frame("fc_widget");
		driver.findElement(By.id("chat-icon")).click();
		
		//handle frame by using xpath
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='fc_widget']"));
		driver.switchTo().frame(frameElement);
		WebElement chatBox = driver.findElement(By.id("chat-icon"));
		chatBox.click();
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("chat-fc-name")).sendKeys("snehal");
		driver.findElement(By.id("chat-fc-email")).sendKeys("snehaljamkar@");
		driver.findElement(By.id("chat-fc-phone")).sendKeys("9876543210");
		
	}

}
