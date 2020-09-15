package basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindTableElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		
		
		WebElement tableHeader = driver.findElement(By.id("example")).findElement(By.tagName("thead"));
		System.out.println(tableHeader.getText());
		//Selecting Example Table, and then selecting the Table Body
		WebElement tableBody = driver.findElement(By.id("example")).findElement(By.tagName("tbody"));
		System.out.println(tableBody.getText());
		
		List<WebElement> rows = tableBody.findElements(By.tagName("tr"));
		
		for (int i = 0; i<rows.size(); i++) {
			
			rows.get(i).findElements(By.tagName("td")).get(0).click();
			System.out.println("Row " + (i+1) + ": " + rows.get(i).getText());
			System.out.println("Name in the Row " + (i+1) + ": " + rows.get(i).findElements(By.tagName("td")).get(1).getText());
		}
		
		System.out.println("4th Row's Position: " + driver.findElement(By.id("example")).findElement(By.tagName("tbody")).findElements(By.tagName("tr")).get(3).findElements(By.tagName("td")).get(2).getText());
	
		
		WebElement unorderedList = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/ul/li[4]/ul/li[13]/ul"));
		System.out.println(unorderedList.getText());
		
		List<WebElement> listItem = unorderedList.findElements(By.tagName("li"));
		
		for (int i = 0; i<listItem.size(); i++) {
			System.out.println("List Item " + (i+1) + ": " + listItem.get(i).getText());
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
