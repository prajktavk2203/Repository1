package example.action.keyboardAndMouseEvents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class KeyboardEventFBLogin 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raje\\Desktop\\Prajkta\\All Browser Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize(); 
		
		driver.findElement(By.xpath("//*[@id=\"u_0_m\"]")).sendKeys("Prajkta");
		
		Actions act=new Actions(driver);
		
		act.sendKeys(Keys.TAB)
		.pause(Duration.ofSeconds(1))
		.sendKeys("Pund")
		.sendKeys(Keys.TAB)
		.pause(Duration.ofSeconds(1))

		.sendKeys("6787654432")
		.sendKeys(Keys.TAB)
		.pause(Duration.ofSeconds(1))

		.sendKeys("gjhgduyewt65675756")
		.sendKeys(Keys.TAB)
		.build().perform();
		
		
		
	}

}
