package example.extentReport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class GoogleSearch 
{
	
	ExtentReports reports;
	ExtentTest logger;
@Test
	public void  GoogleSearch()
	{
		
	    reports=new ExtentReports();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raje\\Desktop\\Prajkta\\All Browser Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        reports.init("C:\\Users\\Raje\\Desktop\\Prajkta\\ExtentReports\\google.html", true);
        reports.startTest("GoogleSearch");
        
        driver.get("https://www.google.com/");
        reports.log(LogStatus.INFO, "URL launched");

        
        driver.findElement(By.name("q")).sendKeys("Prajkta");
        reports.log(LogStatus.PASS, "Entered text");
        
    
	}
@AfterMethod

    public void afterMethod(ITestResult result)
    {
	    if(ITestResult.FAILURE==result.getStatus())
	    {
	    	reports.log(LogStatus.FAIL, "Test case failed");
	    }
	
	    reports.endTest();
	    
    }

}
