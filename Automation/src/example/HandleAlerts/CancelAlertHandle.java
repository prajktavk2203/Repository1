package example.HandleAlerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class CancelAlertHandle
{
	WebDriver driver;
     @Test
     public void dismissAlert()
     {  
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raje\\Desktop\\Prajkta\\All Browser Drivers\\chromedriver.exe");
    	 driver=new ChromeDriver();
    	 
    	 driver.get("https://demoqa.com/alerts");
    	 
    	 driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
    	 
    	 //driver.switchTo().alert().accept();
    	 
    	 driver.switchTo().alert().dismiss();
    	 
    	 System.out.println("Alert closed successfully....");
    	 
     }

 @AfterMethod
 
public void afterMethod()
{
  driver.close();	 
}
}

