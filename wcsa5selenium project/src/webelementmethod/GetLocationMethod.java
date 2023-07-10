package webelementmethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.selenium.dev/");
		Point newsElement = driver.findElement(By.xpath("//h2[.='News']")).getLocation();
		int Xaxis = newsElement.getX();
		int Yaxis = newsElement.getY();
		System.out.println("Xaxis of newsElement:"+Xaxis+" Yaxis of newsElement:"+Yaxis);
		
	}

}
