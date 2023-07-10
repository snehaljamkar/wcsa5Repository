package handlingDropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectionMethods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/Snehal/Desktop/selenium/MultiSelectDropDown.html");
		WebElement multiSelectDD = driver.findElement(By.id("menu"));
		Select sel=new Select(multiSelectDD);
		List<WebElement> dropdownOptions = sel.getOptions();
		//for(int i=0;i<dropdownOptions.size();i++)
		//{
			//dropdownOptions.get(i).click();
			///Thread.sleep(2000);
		//}
		
		for(WebElement ops:dropdownOptions)
		{
			if(ops.getText().equals("Pav Bhaji"))
			{
				ops.click();
				break;
			}
		}
		
		
	}

}
