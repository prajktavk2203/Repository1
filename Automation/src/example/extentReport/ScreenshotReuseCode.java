package example.extentReport;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotReuseCode 
{
     public static void takeScreenshot(WebDriver driver, String ScreenshotName)
     {
    	 try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			 File source= ts.getScreenshotAs(OutputType.FILE);
			 FileHandler.copy(source, new File("./ScreenShorts/"+ScreenshotName+".png")); 
			 System.out.println("Screenshot captured...");
		      } 
    	 catch (Exception e) 
    	  {
    		 System.out.println(e.getMessage());
		  }
    	 
     }
	

}
