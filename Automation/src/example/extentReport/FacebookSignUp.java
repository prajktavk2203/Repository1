package example.extentReport;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FacebookSignUp
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raje\\Desktop\\Prajkta\\All Browser Drivers\\chromedriver.exe");
		
         WebDriver driver=new ChromeDriver();
         ScreenshotReuseCode.takeScreenshot(driver, "FB_ChromeDriverLaunched");
         
         
         driver.get("https://www.facebook.com/");
         ScreenshotReuseCode.takeScreenshot(driver, "FB_URL_Launched");
         
         driver.manage().window().maximize();
         
         driver.findElement(By.id("u_0_m")).sendKeys("Prajkta");
         ScreenshotReuseCode.takeScreenshot(driver, "FB_UserName_Entered");
         
        
        
        driver.close();
        
		
	}

}
