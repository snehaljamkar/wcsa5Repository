package testNG1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
  @Test
  public void method1() {
	  Reporter.log("this is method1",true);
	  
  }
  @Test
  public void method2() {
	  Reporter.log("this is method2",true);
	  
  }
}
