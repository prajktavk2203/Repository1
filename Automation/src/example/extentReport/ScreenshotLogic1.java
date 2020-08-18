package example.extentReport;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotLogic1 
{
      public static String takeScreenshot(WebDriver driver, String ScreenshotName) 
      {
    	  try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			  File source=ts.getScreenshotAs(OutputType.FILE);
			  String destination="./ScreenShorts/"+ScreenshotName+".png";
			  FileHandler.copy(source, new File(destination));
			 // FileHandler.copy(source, new File("./ScreenShorts/"+ScreenshotName+".png"));
			  System.out.println("Screenshot captured..");
			  return destination;

		      } 
    	  catch (Exception e) 
    	    {
              System.out.println("Exception while capturing screenshot"+e.getMessage());
    	    }
		return ScreenshotName;
    	  
      }
   
      

}

