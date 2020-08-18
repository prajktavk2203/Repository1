package automateFacebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raje\\Desktop\\Prajkta\\All Browser Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='u_0_q']")).sendKeys("Prajkta");
		driver.findElement(By.id("u_0_s")).sendKeys("pund");
		driver.findElement(By.name("reg_email__")).sendKeys("19029304950");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("12345678");
		driver.findElement(By.xpath("//button[@id='u_0_16']")).click();
		
		//Select sel1=new Select(driver.findElement(By.xpath("//select[@id='day']")));
	//	sel1.selectByIndex(3);
		
		//Select sel2= new Select(driver.findElement(By.xpath("//select[@id='month']")));
	//	sel2.selectByValue("8");
		
		Select sel3= new Select(driver.findElement(By.xpath("//select[@id='year']")));
		sel3.selectByVisibleText("1993");
		
		driver.findElement(By.xpath("//input[@id='u_0_9']")).click();
		
		driver.findElement(By.xpath("//button[@id='u_0_16']")).click();
		
		
		driver.close();


	}

}
