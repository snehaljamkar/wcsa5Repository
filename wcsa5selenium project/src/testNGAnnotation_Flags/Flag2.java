package testNGAnnotation_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
	// it is used to disable or enable the methods/Testcase
  @Test(description="Login Method!!",enabled=true)
  public void method1() {
	  Reporter.log("Method1 from flag2",true);
  }
  
  @Test(description ="Logout Method!!",enabled=true)
  public void method2()
  {
	  Reporter.log("method2 from flag2",true);
  }
}
