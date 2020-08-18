package example.HandleWindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleWindow1 {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Raje\\Desktop\\Prajkta\\All Browser Drivers\\geckodriver.exe");
		
		driver=new FirefoxDriver();
		
		driver.get("https://demoqa.com/browser-windows");
        String parent=driver.getWindowHandle();
        System.out.println("parent window id id"+parent);
        
        driver.findElement(By.xpath("//button[@id='windowButton']")).click();
        
        Set<String> allWindow=driver.getWindowHandles();
        
        int count=allWindow.size();
        System.out.println("Total window is : "+count);
        
        for(String child:allWindow)
        {
        	if(!parent.equalsIgnoreCase(child))
        	{
        		driver.switchTo().window(child);
        		driver.manage().window().maximize();
        		System.out.println("Child window title is : "+driver.getTitle());
        		Thread.sleep(4000);
        		driver.close();
        	}
        }
        
        driver.switchTo().window(parent);
        System.out.println("Parent window title is:"+driver.getTitle());
        
        driver.close();
        
	}

}
