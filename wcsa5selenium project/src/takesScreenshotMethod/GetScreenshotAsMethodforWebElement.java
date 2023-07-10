package takesScreenshotMethod;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class GetScreenshotAsMethodforWebElement {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/Snehal/Desktop/selenium/SingleSelectDropdown.html");
		WebElement dropdown = driver.findElement(By.id("menu"));
		File src = dropdown.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/webelement.png");
		Files.copy(src, dest);
	}

}
