package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class framesMagento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		another wait till click able
//		WebDriverWait wait = new WebDriverWait(driver, 30);
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a"))); 
		
		driver.get("http://magento.com");
		driver.findElement(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"register\"]/span")).click();
		driver.findElement(By.id("firstname")).sendKeys("Samrat");
		driver.findElement(By.id("lastname")).sendKeys("Adhikari");
		driver.findElement(By.name("email")).sendKeys("sarlate@yahoo.com");
		
		Select companyProfile = new Select(driver.findElement(By.id("company_type")));
		//companyProfile.selectByIndex(3);
		//companyProfile.selectByValue("deployment");
		companyProfile.selectByVisibleText("Provides deployment, customization and integration services to merchants");
		
		Select role = new Select(driver.findElement(By.id("individual_role")));
		role.selectByIndex(2);
		
		Select country = new Select(driver.findElement(By.id("country")));
		country.selectByVisibleText("United States");
		
		driver.findElement(By.id("password")).sendKeys("Jach24!!");
		driver.findElement(By.name("password_confirmation")).sendKeys("Jach24!!");
		
			
		//SWITCH TO FRAME
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"msp-recaptcha-d84b65fc916e7398083ea5f17089d8f1\"]/div/div/iframe")));
		driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]")).click();
		//come out to the iframe and html ready for the main window
		driver.switchTo().defaultContent();
		
		
		//driver.findElement(By.id("agree_terms")).click();
		
		if(driver.findElement(By.id("agree_terms")).isSelected()) {
			
			driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div/button")).click();
		}
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();

	}

}
