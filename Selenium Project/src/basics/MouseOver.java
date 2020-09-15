package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://spiceJet.com");
		
		//behavior of the web site driven, waiting for first trip to be selected
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeSelected(By.id("ctl00_mainContent_rbtnl_Trip_0")));
		
		//Mouse Over via action
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"))).perform();
		
		//hard coded wait
		Thread.sleep(5000);
		
		//Right Click
		//action.contextClick(driver.findElement(By.xpath("//*[@id=\"Covid19info\"]/span[2]"))).perform();
		
		
		//Going to Magento.com
		
		driver.get("http://magento.com");
		
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"block-header\"]/ul/li[2]/a/span"))).perform();
		
		//hard coded wait
		Thread.sleep(5000);
		
		//Click B2B
		action.click((driver.findElement(By.xpath("//*[@id=\"block-header\"]/ul/li[2]/div/div/div/div/ul/li[2]/ul/li[2]/a")))).perform();
		
		//hard coded wait
		Thread.sleep(5000);
		
		driver.quit();

	}

}
