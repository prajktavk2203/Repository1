package example.action.keyboardAndMouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDropByOffset
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raje\\Desktop\\Prajkta\\All Browser Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
		
		Actions act=new Actions(driver);
		act.dragAndDropBy(source, 300, 100);
		act.perform();

		
		
		

	}

}
