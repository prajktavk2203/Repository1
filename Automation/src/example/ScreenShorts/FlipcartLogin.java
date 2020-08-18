package example.ScreenShorts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.exec.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class FlipcartLogin
{
    @Test
        public void login() throws Exception
        {
    	    WebDriver driver;
    	    System.setProperty("webdriver.chrome.driver","C:\\Users\\Raje\\Desktop\\Prajkta\\All Browser Drivers\\chromedriver.exe");
    	    driver=new ChromeDriver();
    	   
    	    driver.get("https://www.google.com/");
    	    
    	    ScreenshotLogic.takeSS(driver, "HomePage");
    	    
    	    driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Automation");
    	    
    	   ScreenshotLogic.takeSS(driver, "SearchBar");
          driver.close();
    	 
        }
	
}
