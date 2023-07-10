package handlingDropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelectDropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/Snehal/Desktop/selenium/MultiSelectDropDown.html");
		
		WebElement multiSelectDD = driver.findElement(By.id("menu"));
		Select sel=new Select(multiSelectDD);
		
		//select By Index 
		sel.selectByIndex(1);
		Thread.sleep(2000);
		
		//select By Visible Text
		sel.selectByVisibleText("Pav Bhaji ");
		Thread.sleep(2000);
		
		//select By value
		sel.selectByValue("v4");
		Thread.sleep(2000);
		
		//deselect by index
		sel.deselectByIndex(2);
		Thread.sleep(1000);
		
		//deselct by visible Text
		sel.deselectByVisibleText("Paani Puri");
		//Thread.sleep(1000);
		
		//deselect by value
		sel.deselectByValue("v2");
		
		for(int i=0; i<5;i++)
		{
			sel.selectByIndex(i);
			Thread.sleep(1000);
		}
		
		//for(int i=0;i<5;i++)
		//{
		//	sel.deselectByIndex(i);
		//	Thread.sleep(1000);
		//}
		
		sel.deselectAll();

		
		
		
		
		
		
		
	}

}
