package example.extentReport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


public class GoogleSearch1 
{
	
	WebDriver driver;
	@Test
	public void GoogleSearch()
	  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raje\\Desktop\\Prajkta\\All Browser Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='ppq']")).sendKeys("Hello");
		driver.close();
		
	  }
	
	@AfterMethod()
	public void afterMethod(ITestResult result) throws Exception
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			ScreenshotLogic1.takeScreenshot(driver, result.getName());
		}
	}

}
