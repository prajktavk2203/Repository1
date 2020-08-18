package example.ScreenShorts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotLogic 
{
     public static void takeSS(WebDriver driver, String google)
     {
    	 try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			 
			File src= ts.getScreenshotAs(OutputType.FILE);
			 FileHandler.copy(src, new File("./ScreenShorts/"+google+".png"));
			 
			 System.out.println("Screenshot Taken...");
		} 
    	 catch (Exception e)
    	 {
			System.out.println("Exception while taking screenshot :"+e.getMessage());
		} 
    	
     }
}
