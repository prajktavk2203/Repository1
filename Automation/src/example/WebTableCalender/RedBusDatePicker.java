package example.WebTableCalender;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusDatePicker
{

	public static void main(String[] args)
	{
       
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raje\\Desktop\\Prajkta\\All Browser Drivers\\chromedriver.exe");
        
        WebDriver driver=new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("https://www.goibibo.com/");
        
        driver.findElement(By.xpath("//input[@id='departureCalendar']")).click();
        
       List<WebElement> dates =driver.findElements(By.xpath("//div[@class='fareCalFlt ']//div[@class='DayPicker DayPicker--en']//div[@class='DayPicker-Month']/div[@class='DayPicker-Body']/div[@class='DayPicker-Week']/div"));

       
       int count=dates.size();
       
       for(int i=0;i<count;i++)
       {
    	   String selectDate=dates.get(i).getText();
    	   if(selectDate.equals("20"))
    	   {
    		   dates.get(i).click();
    	       System.out.println(dates.get(i).getText());

    		   break;
    	   }
    	   
       }
       
       
       
       
       
       
       
	}

}
