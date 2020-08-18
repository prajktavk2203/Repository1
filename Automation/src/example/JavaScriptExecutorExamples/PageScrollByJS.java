package example.JavaScriptExecutorExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.interactions.touch.Scroll;

public class PageScrollByJS 
{
    public static void main(String[] args) 
    {

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raje\\Desktop\\Prajkta\\All Browser Drivers\\chromedriver.exe");
	        
	        WebDriver driver=new ChromeDriver();
	        
	        driver.manage().window().maximize();
	        driver.get("https://www.javatpoint.com/selenium-tutorial");
	        
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        
	        JavascriptExecutor js=(JavascriptExecutor)driver;
	        js.executeScript("scroll(0,800)");
	}
}
