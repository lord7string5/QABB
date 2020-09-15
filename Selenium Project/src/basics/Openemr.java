package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Openemr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.openemr.io/a/openemr/");
		
		driver.findElement(By.id("authUser")).clear();
		driver.findElement(By.id("authUser")).sendKeys("admin");
		
		driver.findElement(By.id("clearPass")).clear();
		driver.findElement(By.id("clearPass")).sendKeys("pass");
		
		driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[3]/div[1]/div[5]/button")).click();
		//using class name if unique
		//driver.findElement(By.className("fa-sign-in")).click();
		
		//Mouse Over via action
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu_logo\"]/div/div/span[5]/div/div"))).perform();
		
		action.click((driver.findElement(By.xpath("//*[@id=\"menu_logo\"]/div/div/span[5]/div/ul/li[2]/div")))).perform();
		
		driver.switchTo().frame(driver.findElement(By.name("pat")));
		driver.findElement(By.id("form_fname")).sendKeys("fnameTest1");
		driver.findElement(By.id("form_lname")).sendKeys("lnameTest1");
		driver.findElement(By.id("form_DOB")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div[1]/div[2]/table/tbody/tr[2]/td[4]/div"))); 
		
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/table/tbody/tr[2]/td[5]/div")).click();
		
		Select sex = new Select(driver.findElement(By.id("form_sex")));
		sex.selectByIndex(2);
		
		driver.findElement(By.id("create")).click();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(driver.findElement(By.id("modalframe")));
		driver.findElement(By.xpath("/html/body/center/input")).click();
		driver.switchTo().defaultContent();
		
		wait.until(ExpectedConditions.alertIsPresent()); 
		
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		driver.switchTo().frame(driver.findElement(By.id("modalframe")));
		System.out.println(driver.findElement(By.xpath("/html/body/div/p")).getText());
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//*[@id=\"bdayreminder\"]/div/div/div[1]")).click();
		
		action.moveToElement(driver.findElement(By.id("username"))).perform();
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"username\"]/div/ul/li[4]")));

		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		driver.quit();	
		

	}

}
