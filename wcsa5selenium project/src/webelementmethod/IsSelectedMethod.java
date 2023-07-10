package webelementmethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://laptop-2ts75ugp/login.do");
		WebElement checkbox = driver.findElement(By.name("remember"));
		boolean verify = checkbox.isSelected();
		System.out.println(verify);
		Thread.sleep(1000);
		checkbox.click();
		Thread.sleep(1000);
		boolean verify1 = checkbox.isSelected();
		System.out.println(verify1);
		}

}
