package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://in.puma.com/in/en/mens/mens-shoes?offset=48");
		WebElement shoes = driver.findElement(By.xpath("(//h3[contains(@class,'w-')]/descendant::span[text()='Puma Black-Puma Silver'])[2]"));
		Point shoe = shoes.getLocation();
		int xaxis = shoe.getX();
		int yaxis = shoe.getY();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
}

}
