package webelementmethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabledMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.instagram.com/accounts/login/");
		driver.findElement(By.name("username")).sendKeys("asdfghjkl");
		driver.findElement(By.name("password")).sendKeys("zxcvbnm");
		boolean loginButton = driver.findElement(By.xpath("//button[contains(@class,'_acap')]")).isEnabled();
		System.out.println(loginButton);
		
		
	}

}
