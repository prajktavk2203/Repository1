package example.JavaScriptExecutorExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickEvent 
{

	public static void main(String[] args) 
	{

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raje\\Desktop\\Prajkta\\All Browser Drivers\\chromedriver.exe");
	        
	        WebDriver driver=new ChromeDriver();
	        
	        driver.manage().window().maximize();
	        driver.get("https://login.yahoo.com/");
	        
	        JavascriptExecutor js=(JavascriptExecutor)driver;
	        
	        WebElement email=driver.findElement(By.xpath("//input[@id='login-username']"));
	        js.executeScript("arguments[0].value='Prajkta'",email);
	        
	        
	        //click event by---> document.getElement
	        js.executeScript("document.getElementById('persistent').click()");
	        
	        // Or click event --> by WebElement + arguments
	        //WebElement button=driver.findElement(By.id("persistent"));
	        // js.executeScript("arguments[0].click()",button);
	}

}
