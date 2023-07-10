package handlingDropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exception {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/Snehal/Desktop/selenium/SingleSelectDropdown.html");
		WebElement dropdown = driver.findElement(By.id("menu"));
		Select sel = new Select(dropdown);
		sel.selectByIndex(1);
		sel.deselectByIndex(1);
		
		
	}

}
