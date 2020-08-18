package example.JavaScriptExecutorExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class JavaScriptExeTypeAndClick 
{

	public static void main(String[] args) 
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raje\\Desktop\\Prajkta\\All Browser Drivers\\chromedriver.exe");
        
        WebDriver driver=new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("https://login.yahoo.com/");
        
        JavascriptExecutor js=(JavascriptExecutor)driver;
        
        //Enter User name
        WebElement uName=driver.findElement(By.xpath("//input[@id='login-username']"));
        js.executeScript("arguments[0].value='Prajkta'",uName);

        
        //Click on next button
        WebElement button=driver.findElement(By.xpath("//input[@id='login-signin']")); 
        js.executeScript("arguments[0].click()",button);
        
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //Enter password  
       WebElement pwd=driver.findElement(By.id("login-passwd")); 
        js.executeScript("arguments[0].value='Prajkta'",pwd);

        //Click on login/next button
       // WebElement nextBtn=driver.findElement(By.xpath("//button[@id='login-signin']"));
       // js.executeScript("arguments[0].click()",nextBtn);
        
        js.executeScript("document.getElementBy.Id('persistent').click()");
        
		
	}

}
