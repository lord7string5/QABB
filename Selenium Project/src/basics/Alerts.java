package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.echoecho.com/javascript4.htm");
		
		//Alert
		driver.findElement(By.name("B1")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		//Confirm
		driver.findElement(By.name("B2")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
		//driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
	
		//Send Data prompt box
		driver.findElement(By.name("B3")).click();
		System.out.println(driver.switchTo().alert().getText());
		//In chrome there is a defect so no data is typed// works in firefox
		driver.switchTo().alert().sendKeys("Test Data");
		
		
		
		driver.switchTo().alert().dismiss();
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		driver.quit();	


	}

}
