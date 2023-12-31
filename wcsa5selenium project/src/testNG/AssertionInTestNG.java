package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionInTestNG {
  @Test
  public void verificationMethod() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("http://laptop-2ts75ugp/login.do");
	  
	  String actualTitleOfLoginPage = driver.getTitle();
	  
	  SoftAssert sa = new SoftAssert();
	  sa.assertEquals(driver.getTitle(), actualTitleOfLoginPage);
	  
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  driver.findElement(By.id("loginButton")).click();
	  System.out.println("title match testcase passed");
	  sa.assertAll();
	  
	  String actualTitleOfHomePage = driver.getTitle();
	  Assert.assertEquals(actualTitleOfHomePage, "Snehal");
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("Logout")).click();
  }
}
