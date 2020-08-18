package example.HandleAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class OkAlertHandle
{
     WebDriver driver;
     
     @Test
        public void okAlert() throws Exception
        {
    	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raje\\Desktop\\Prajkta\\All Browser Drivers\\chromedriver.exe");
    	   driver=new ChromeDriver();
    	   
    	   driver.get("https://demoqa.com/alerts");
    	   driver.findElement(By.xpath("//button[@id='alertButton']")).click();
    	   
    	   Thread.sleep(2000);
    	  driver.switchTo().alert().accept();
    	 
        }
     
     @AfterMethod
        public void closeDriver()
        {
    	 driver.close();
        }
}
