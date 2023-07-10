package popUpHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ConfirmationPopupUsingSwitchToMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Snehal/Desktop/selenium/ConfirmationPopUp.html");
		driver.findElement(By.tagName("input")).click();
		Alert al = driver.switchTo().alert();
		//al.accept();
		//al.dismiss();
		System.out.println(al.getText());
		
	}

}
