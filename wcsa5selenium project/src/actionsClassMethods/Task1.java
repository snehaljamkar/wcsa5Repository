package actionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://www.bluestone.com/");
	    Thread.sleep(2000);
	    driver.findElement(By.id("denyBtn")).click();
	    WebElement target = driver.findElement(By.xpath("//a[text()='Coins ']"));
	    
	    Actions act = new Actions(driver);
	    act.moveToElement(target).perform();
	    
	    driver.findElement(By.xpath("//span[text()='1 gram']")).click();
	    Thread.sleep(2000);
	    
	    WebElement img = driver.findElement(By.id("5920"));
	    if(img.isDisplayed())
	    {
	    	driver.quit();
	    }
	    else
	    {
	    	System.out.println("Exception!!");
	    }
	   
	    
	    
	  
	    
	   
	    
	}

}
