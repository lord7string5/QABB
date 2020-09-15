package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//all will use it...the implicitwait
		driver.manage().timeouts().implicitlyWait(30,  TimeUnit.SECONDS);
		
		driver.get("http://google.com"); 
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("tests");
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/a/h3")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("SeleniumHQ Browser Automation")) {
			System.out.println("Test Passed");
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();

	}

}
