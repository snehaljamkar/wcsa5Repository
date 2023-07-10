package handlingDropdowns;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveDuplicateUsingLinkedHashset {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.get("file:///C:/Users/Snehal/Desktop/selenium/MultiSDropdown.html");
	    WebElement dropdown = driver.findElement(By.id("city"));
	    Select sel = new Select(dropdown);	 
	    LinkedHashSet<String> lhs = new LinkedHashSet<String>();
	    List<WebElement> allops = sel.getOptions();
	    for(int i=0;i<allops.size();i++)
	    {
	    	WebElement op = allops.get(i);
	    	String value = op.getText();
	    	lhs.add(value);
	    }
	    for(String element:lhs)
	    {
	    	System.out.println(element);
	    	Thread.sleep(2000);
	    }
	}

}
