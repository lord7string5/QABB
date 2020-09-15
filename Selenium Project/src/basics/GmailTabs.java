package basics;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailTabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//all will use it...the implicitwait
		driver.manage().timeouts().implicitlyWait(30,  TimeUnit.SECONDS);
		
		driver.get("http://google.com"); 
		driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[1]/a")).click();
		//alternative for a tag names
		//driver.findElement(By.linkText("Gmail")).click();
		//when a is expandable and text is inside nested..then partial link text (nested)
		
		
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[4]/ul[1]/li[2]/a")).click();
		//extract win handles
		//Set ensures no duplicate
		Set<String> winids = driver.getWindowHandles();
		//just one
		//String main = driver.getWindowHandle(); 
		
		//switch html despite the new tab is in focus
		
				//typecast to string
		driver.switchTo().window((String) winids.toArray()[1]);
		
		//type username
		driver.findElement(By.id("identifierId")).sendKeys("sarlate"+ Keys.ENTER); 
		
		
		
		driver.switchTo().window((String) winids.toArray()[0]);
		driver.findElement(By.linkText("For Work")).click();
		winids = driver.getWindowHandles();
		driver.switchTo().window((String) winids.toArray()[2]);
		driver.findElement(By.linkText("Admin console")).click();
		winids = driver.getWindowHandles();
		driver.switchTo().window((String) winids.toArray()[3]);
		driver.findElement(By.id("identifierId")).sendKeys("sarlate"+ Keys.ENTER);
		
		//to close
		driver.close();
		
		//get refreshed winids...as we closed
		winids = driver.getWindowHandles();
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();

	}

}
