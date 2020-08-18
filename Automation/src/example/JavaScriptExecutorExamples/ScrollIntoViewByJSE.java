package example.JavaScriptExecutorExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoViewByJSE 
{
    public static void main(String[] args) 
    {
	  
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raje\\Desktop\\Prajkta\\All Browser Drivers\\chromedriver.exe");
        
        WebDriver driver=new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("https://www.javatpoint.com/selenium-tutorial");
        
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
        JavascriptExecutor js=(JavascriptExecutor)driver;
        WebElement element=driver.findElement(By.xpath("//a[contains(text(),'WebDriver-Features')]"));
        js.executeScript("arguments[0].scrollIntoView(true)",element);
	}
}
