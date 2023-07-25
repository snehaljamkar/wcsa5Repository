package testNGExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SelectBrowser {	
  static WebDriver driver;
  @Test
  @Parameters({"browser","url","Vusername","Vpassword"})
  public void testParallelMethod(String browserValue,String url,String usn,String pass) throws InterruptedException {
	  if (browserValue.equalsIgnoreCase("chrome")) {
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.get(url);
		  driver.findElement(By.name("username")).sendKeys(usn);
		  driver.findElement(By.name("pwd")).sendKeys(pass);
		  driver.findElement(By.id("loginButton")).click();
		  Thread.sleep(2000);	
		  driver.quit();
	  }
	  else if(browserValue.equalsIgnoreCase("edge"))
	  {
		  System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		  driver=new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.get(url);
		  driver.findElement(By.name("username")).sendKeys(usn);
		  driver.findElement(By.name("pwd")).sendKeys(pass);
		  driver.findElement(By.id("loginButton")).click();
		  Thread.sleep(2000);
		  driver.quit();
	  }
		  
  }
  

	
}

