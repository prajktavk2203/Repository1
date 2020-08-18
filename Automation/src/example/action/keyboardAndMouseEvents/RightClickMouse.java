package example.action.keyboardAndMouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickMouse 
{

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raje\\Desktop\\Prajkta\\All Browser Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		
		WebElement element=driver.findElement(By.xpath("//input[@id='userName']"));
		Actions act=new Actions(driver).contextClick(element);
		act.build().perform();
	}

}
