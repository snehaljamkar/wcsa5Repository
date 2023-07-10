package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTillParticularWebElement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/");
		WebElement newsElement = driver.findElement(By.xpath("//h2[text()='News']"));
//		Point loc = newsElement.getLocation();
//		int xaxis = loc.getX();
//		int yaxis = loc.getY();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
	//	jse.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
		
		jse.executeScript("arguments[0].scrollIntoView(true)",newsElement );
		
	}

}
