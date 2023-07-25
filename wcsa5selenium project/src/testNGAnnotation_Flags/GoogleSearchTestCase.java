package testNGAnnotation_Flags;

import org.testng.annotations.Test;

public class GoogleSearchTestCase extends BaseTest {
  @Test(description="TestCase1")
  public void search1() throws InterruptedException {
	  driver.switchTo().activeElement().sendKeys("Java");
	  Thread.sleep(2000);
  }
  
  @Test(description="Testcase2")
  public void search2() throws InterruptedException {
	  driver.switchTo().activeElement().sendKeys("SQL");
	  Thread.sleep(2000);
  }
  
  @Test(description="Testcase3")
  public void search3() throws InterruptedException {
	  driver.switchTo().activeElement().sendKeys("selenium");
	  Thread.sleep(2000);
  }
}
