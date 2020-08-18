package example.HandleAlerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class AlertText 
{
	WebDriver driver;
    @Test
    public void getAlertText()
    {  
   	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raje\\Desktop\\Prajkta\\All Browser Drivers\\chromedriver.exe");
   	 driver=new ChromeDriver();
   	 
   	 driver.get("https://demoqa.com/alerts");
   	 
   	 driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
   	 
   	 String AlertText=driver.switchTo().alert().getText();
   	 
   	 
   	 
   	// driver.switchTo().alert().dismiss();
   	 
   	 System.out.println("Alert Text is : "+AlertText);
     driver.switchTo().alert().accept();
   	 
    }

   @AfterMethod

    public void afterMethod()
     {
       driver.close();	 
     }

}
