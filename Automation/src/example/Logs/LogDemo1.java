package example.Logs;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LogDemo1 
{

	public static void main(String[] args) 
	{
         Logger Obj=Logger.getLogger("LogDemo1");
         
         PropertyConfigurator.configure("Log4j.properties");
         
         
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raje\\Desktop\\Prajkta\\All Browser Drivers\\chromedriver.exe");
 		WebDriver driver=new ChromeDriver();
 		Obj.info("Launched browser");
 		
 		driver.get("https://www.facebook.com/");
 		Obj.info("URL launched");
 		
 		driver.manage().window().maximize();
 		Obj.info("Window maximized");
 		
 		driver.findElement(By.xpath("//input[@id='u_0_q']")).sendKeys("Prajkta");
 		Obj.info("First name entered");
 		
 		driver.findElement(By.id("u_0_s")).sendKeys("pund");
 		Obj.info("Last name entered");
 		
 		driver.findElement(By.name("reg_email__")).sendKeys("19029304950");
 		Obj.info("mobile number entered");
 		
 		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("12345678");
 		Obj.info("Entered password");
 	
 		driver.findElement(By.xpath("//button[@id='u_0_16']")).click();
 		Obj.info("Clicked on submit button");
 		
 		
 		driver.close();
	}

}
