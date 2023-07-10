package handlingDropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptionsMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/Snehal/Desktop/selenium/MultiSelectDropDown.html");
		WebElement dropdown = driver.findElement(By.id("menu"));
		Select sel = new Select(dropdown);
		for(int i=2; i<5;i++)
		{
			sel.selectByIndex(i);
			Thread.sleep(1000);
		}
		List<WebElement> allops = sel.getAllSelectedOptions();
		for(WebElement op:allops)
		{
			System.out.println(op.getText());
			Thread.sleep(1000);
		}
			
	}

}
