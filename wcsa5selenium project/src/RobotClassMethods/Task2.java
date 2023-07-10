package RobotClassMethods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task2 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
	    Thread.sleep(2000);
	    driver.findElement(By.id("denyBtn")).click();
	    Thread.sleep(1000);
	    WebElement target1 = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
	    
	    Actions act = new Actions(driver);
	    act.moveToElement(target1).perform();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//a[.='Band']")).click();
	    Thread.sleep(2000);
	    WebElement target2 = driver.findElement(By.xpath("//div[text()='Filter by' and @class='opt-title']"));
	    Thread.sleep(2000);
	   // act.clickAndHold(target2).perform();
	    act.doubleClick(target2);
	    
	    Robot robot = new Robot();
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_C);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    robot.keyRelease(KeyEvent.VK_C);
	    
	    driver.findElement(By.id("search_query_top_elastic_search")).click();
	  
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    robot.keyRelease(KeyEvent.VK_V);
	    
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	    
	    if(driver.findElement(By.xpath("//span[text()='1 Designs']")).isDisplayed())
	    {
	    	Thread.sleep(2000);
	    	driver.quit();	
	    }
	    else {
	    	System.out.println("Exception!!");
	    }
	    }
	    
	
		}


