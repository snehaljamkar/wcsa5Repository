package testNG1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3 {
  @Test
  public void method5() {
	  Reporter.log("this is method5", true);
  }
  @Test
  public void method6() {
	  Reporter.log("this is method6",true);
	  
  }
}
