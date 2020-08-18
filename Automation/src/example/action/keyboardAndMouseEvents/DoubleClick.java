package example.action.keyboardAndMouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick 
{
   public static void main(String[] args) 
   {
	
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raje\\Desktop\\Prajkta\\All Browser Drivers\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   
	   driver.get("https://demoqa.com/buttons");
	   driver.manage().window().maximize();
	   
	   WebElement doublebtn= driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
	   
	   Actions act=new Actions(driver);
	   act.doubleClick(doublebtn);
	   act.perform();
	   
	   driver.switchTo().alert().accept();
	   String msg= driver.switchTo().alert().getText();
	   System.out.println(msg);
	   
	
   }
}
