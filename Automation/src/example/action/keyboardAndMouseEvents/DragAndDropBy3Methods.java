package example.action.keyboardAndMouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropBy3Methods
{

	public static void main(String[] args)
	{
     
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raje\\Desktop\\Prajkta\\All Browser Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/dragabble");
		driver.manage().window().maximize();
		
		WebElement source=driver.findElement(By.xpath("//div[@id='dragBox']"));
		
	
		Actions act=new Actions(driver);
		act.clickAndHold(source);
		act.pause(2000);
		act.moveByOffset(300, 100);
		act.pause(2000);
		act.release();
		act.perform();
		
	}

}
