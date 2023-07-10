package handlingDropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OperationalMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/Snehal/Desktop/selenium/MultiSelectDropDown.html");
		WebElement multiSelectDD = driver.findElement(By.id("menu"));
		Select sel=new Select(multiSelectDD);
		
		//isMultiple Method
		boolean result = sel.isMultiple();
		System.out.println(result);
		
		//get options method
		List<WebElement> dropdownOptions = sel.getOptions();
		for(int i=0;i<dropdownOptions.size();i++)
		{
			String options = dropdownOptions.get(i).getText();
			System.out.println(options);
		}
		
		System.out.println();
		List<WebElement> ops = sel.getOptions();
		for(WebElement we:ops)
		{
			String textOfOps = we.getText();
			System.out.println(textOfOps);
		}
		}
		
		
	}


