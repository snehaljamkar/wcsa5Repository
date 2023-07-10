package handlingDropdowns;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class RemoveDuplicateUsingHashSet {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/Snehal/Desktop/selenium/MultiSDropdown.html");
		WebElement dropdown = driver.findElement(By.id("city"));
		Select sel = new Select(dropdown);
		HashSet<String> hs = new HashSet<String>();
		List<WebElement> allopts = sel.getOptions();
		for(int i=0;i<allopts.size();i++)
		{
			WebElement op = allopts.get(i);
			String value = op.getText();
			hs.add(value);
		}
		for(String element:hs)
		{
			Thread.sleep(1000);
			System.out.println(element);
			
		}
			
		
	}

}
