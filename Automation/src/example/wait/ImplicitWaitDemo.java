package example.wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitDemo 
{
    public static void main(String[] args) 
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raje\\Desktop\\Prajkta\\All Browser Drivers\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     
	     driver.get("https://www.toolsqa.com/");
	     
	     driver.manage().window().maximize();
	     
	     driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	     
	     driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[2]/a/span/span"));
	     
	     System.out.println("Title of the page is : "+driver.getTitle());
	     
	     driver.close();
	     
	}
}
