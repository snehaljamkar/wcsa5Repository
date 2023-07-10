package webelementmethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.selenium.dev/");
		Rectangle newsElement = driver.findElement(By.xpath("//h2[.='News']")).getRect();
		int Xaxis = newsElement.getX();
		int Yaxis = newsElement.getY();
		
		int height = newsElement.getHeight();
		int width = newsElement.getWidth();
		
		System.out.println(Xaxis+" "+Yaxis+" "+height+" "+width);
		
		
		
		
	}

}
