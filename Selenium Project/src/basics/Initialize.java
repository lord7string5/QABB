package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class Initialize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		//for chrome 
//		ChromeDriver driver = new ChromeDriver();
////		//for firefox
////		FirefoxDriver driver = new FirefoxDriver();
////		//for IE
////		InternetExplorerDriver driver = InternetExplorerDriver();
//		driver.get("http://google.com");
//		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getTitle());
//		//IE browser may not support it
//		System.out.println(driver.getLocalStorage());
//		//location is not supported by firefox
		//But in chrome too it gives location must be set type error
//		System.out.println(driver.location());
		////will close current tab
		//driver.close();	
		////close all 
		//driver.quit();
		
		//for using webdriver interface to solve works for all
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());	
		//switchbetween one tab to another
		//windowids of each tab
		System.out.println(driver.getWindowHandles());
		System.out.println(driver.getWindowHandle());
		driver.manage().window().maximize();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
//		Explicit Waits : An explicit waits is code you define to wait for a certain condition to occur before proceeding further in the code.
//
//		Implicit Waits : An implicit wait is to tell WebDriver to poll the DOM for a certain amount of time when trying to find an element or elements if they are not immediately available.
//
//		Thread.sleep : In sleep code It will always wait for mentioned seconds, even in case the page is ready to interact after 1 sec. So this can slow the tests.
		
		
		//driver.manage().timeouts().implicitlyWait(100000,  TimeUnit.MILLISECONDS); 
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.switchTo() //specific tab
		driver.quit();

	}

}
