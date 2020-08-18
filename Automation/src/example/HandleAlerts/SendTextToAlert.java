package example.HandleAlerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class SendTextToAlert
{
    WebDriver driver;
    
       @Test
          public void sendText()
          {
    	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raje\\Desktop\\Prajkta\\All Browser Drivers\\chromedriver.exe");
    	   	 driver=new ChromeDriver();
    	   	 
    	   	 driver.get("https://demoqa.com/alerts");
    	   	 
    	   	 driver.findElement(By.xpath("//button[@id='promtButton']")).click();
    	   	 
    	   	 driver.switchTo().alert().sendKeys("123456");
    	   	 
    	   	 
          }
      
}
