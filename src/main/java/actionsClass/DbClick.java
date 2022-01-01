package actionsClass;

import java.util.List;

import javax.swing.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import appFile.Main;

public class DbClick extends Main {

	public static void main(String[] args) throws InterruptedException {
		
		
		driver =SetUpBrowswer();
		
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement dbclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		Actions action = new Actions(driver);
		Thread.sleep(5000);
		
		action.doubleClick(dbclick).perform();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		WebElement rightClick = driver.findElement(By.cssSelector("span[class='context-menu-one btn btn-neutral']"));
		
		Actions action1 = new Actions(driver);
		action1.contextClick(rightClick).perform();
		
		List<WebElement> subitems = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']//li//span"));
		System.out.println(subitems.size());
		
		for(int i =0; i<subitems.size();i++) {
			
			String text = subitems.get(i).getText();
		//	System.out.println(text);
			
			if(text.contains("Paste")) {
				
				subitems.get(i).click();
				
				break;
				
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
