package example.HandelFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class SwitchToFrames 
{
    WebDriver driver;
       @Test  
         public void switchFrame() throws Exception
         {
    	     System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raje\\Desktop\\Prajkta\\All Browser Drivers\\chromedriver.exe");
    	     driver=new ChromeDriver();
    	     
    	     driver.get("https://demoqa.com/frames");
    	     
    	     driver.manage().window().maximize();
    	     Thread.sleep(2000);
    	    String default_title= driver.switchTo().defaultContent().getTitle();
    	    System.out.println("Title is: "+default_title);
    	    
    	    WebElement we= driver.findElement(By.id("frame2"));
    	    driver.switchTo().frame(we);
    	   String frame2_title= driver.getTitle();
    	   System.out.println(frame2_title);
    	    
    	  
    	 
         }
       
       
       @AfterMethod
         public void close()
         {
    	   driver.close();
         }
}
