package example.extentReport;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;




public class VerifyTitle
{ 
	WebDriver driver;
	  
	@Test
	   public void testTitle()
	   {
		  
		ExtentReports logger=ExtentReports.get(VerifyTitle.class);
	
		logger.init("C:\\Users\\Raje\\Desktop\\Prajkta\\Jar Files\\ExtentReport\\report1.html", true);
		
		logger.startTest("Verify page title");
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raje\\Desktop\\Prajkta\\All Browser Drivers\\chromedriver.exe");
          driver=new ChromeDriver();
          
          logger.log(LogStatus.INFO, "Driver started successfully...");
          
		  driver.get("https://www.google.com/");
		  logger.log(LogStatus.INFO, "URL launched successfully...");
		  
		  
		  String actual=driver.getTitle();
		  String expected="Google";
		  
		  Assert.assertEquals(actual, expected,"Failed to fetch the title");
		  logger.log(LogStatus.PASS, "Title is verified");
	   
		  logger.attachScreenshot("C:\\Users\\Raje\\Desktop\\Prajkta\\Jar Files\\ExtentReport\\Google.png");
	   }
	
	@AfterMethod
	   public void closeDriver()
	   {
		   driver.close();
	   }

}
