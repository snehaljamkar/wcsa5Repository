package popUpHandling;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandleFileUploadPopup {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		WebElement target = driver.findElement(By.id("uploadfile"));
		act.doubleClick(target).perform();
		
		Runtime.getRuntime().exec("./autoitPrograms/Omayo1.exe");
		
		
	}

}
