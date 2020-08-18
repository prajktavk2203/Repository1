package example.FileUploadsAndDownloads;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload 
{

	public static void main(String[] args) throws Exception 
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raje\\Desktop\\Prajkta\\All Browser Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://tinyupload.com/");
        
       // driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
        
        JavascriptExecutor js=(JavascriptExecutor)driver;
        WebElement ele=driver.findElement(By.xpath("//input[@type='file']"));
        js.executeScript("arguments[0].click()",ele);
        

        Runtime.getRuntime().exec("C:\\Users\\Raje\\Desktop\\Prajkta\\AutoIT\\scripts\\Upload.exe");
        
        
		
	}

}
