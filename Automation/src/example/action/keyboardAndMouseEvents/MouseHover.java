package example.action.keyboardAndMouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raje\\Desktop\\Prajkta\\All Browser Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/");
		driver.manage().window().maximize();
		
		WebElement ele=driver.findElement(By.xpath("//ul[@id='primary-menu']//span[contains(@class,'menu-text')][contains(text(),'VIDEOS')]"));
		
		Actions act=new Actions(driver);
		act.moveToElement(ele);
		
		
		
		 //ul[@id='primary-menu']//span[contains(@class,'menu-text')][contains(text(),'Paid Selenium Video Tutorial')]
		
		
		//ul[@id='primary-menu']//span[contains(@class,'menu-text')][contains(text(),'VIDEOS')]//following::span[5]

	}

}
